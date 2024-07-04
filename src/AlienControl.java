import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AlienControl {
    private List<Alien> aliens;
    private List<Species> species;
    private List<Planet> planets;
    private Scanner scanner;

    public AlienControl() {
        aliens = new ArrayList<>();
        species = new ArrayList<>();
        planets = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        System.out.println("___________________________________________________________________________________");
        System.out.println("STARTING ALIEN CONTROL SYSTEM");
        System.out.println("___________________________________________________________________________________");
        System.out.println("THIS INTERFACE IS PROHIBITED FOR ANYONE OUTSIDE THE INTERPLANETARY GOVERNMENT");
        System.out.println("EMPLOYEE ID: 7294");
        System.out.println("ACCESS GRANTED!");
        int choice;
        do {
            System.out.println("___________________________________________________________________________________");
            System.out.println("1- ALIEN REGISTER");
            System.out.println("2- ALIEN MONITORING");
            System.out.println("3- MONITOR QUARANTINE");
            System.out.println("4- ENTRY REPORT");
            System.out.println("5- EXIT");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    alienControlSystem();
                    break;
                case 2:
                    monitorAliens();
                    break;
                case 3:
                    monitorQuarantine();
                    break;
                case 4:
                    controlSystemReport();
                    break;
                case 5:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("INVALID!");
                    break;
            }
        } while (choice != 6);
        scanner.close();
    }

    public List<Alien> monitorAliens() {
        System.out.println("___________________________________________________________________________________");
        System.out.println("MONITOR ALL ALIENS");
        System.out.println("___________________________________________________________________________________");

        return aliens;
    }

    public void alienControlSystem() {
        System.out.println("___________________________________________________________________________________");
        System.out.println("ALIEN REGISTRATION");
        System.out.println("___________________________________________________________________________________");
        System.out.print("Enter Alien Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Species Name: ");
        String speciesName = scanner.nextLine();
        Species alienSpecies = specimenControl(speciesName);
        int estimatedThreatLevel;
        do {
            System.out.print("Estimated Threat Level (0-9): ");
            estimatedThreatLevel = scanner.nextInt();
            scanner.nextLine();
        } while (estimatedThreatLevel < 0 || estimatedThreatLevel > 9);

        boolean safe = (estimatedThreatLevel > 5);

        System.out.print("Enter Birth Planet: ");
        String birthPlanetName = scanner.nextLine();
        Planet planet = planetControl(birthPlanetName);
        LocalDateTime entryDate = LocalDateTime.now();
        boolean quarantine = !safe;

        System.out.println("DON'T FORGET TO THANK THE SUBJECT FOR 'KINDLY' SHARING EVERY DETAIL");
        Alien alien = new Alien(entryDate, estimatedThreatLevel, alienSpecies, name);
        alien.setQuarantine(quarantine);

        friendlyPeaceInducingProtocol(safe);

        aliens.add(alien);
    }

    public void monitorQuarantine() {
        System.out.println("___________________________________________________________________________________");
        System.out.println("MONITOR QUARANTINE");
        System.out.println("___________________________________________________________________________________");

        boolean anyQuarantined = false;
        for (Alien alien : aliens) {
            if (alien.isQuarantined()) {
                System.out.println("Name: " + alien.getName());
                System.out.println("Species: " + alien.getSpecies().getName());
                System.out.println("Threat Level: " + alien.getEstimatedThreatLevel());
                System.out.println("Entry Date: " + alien.getDate());
                System.out.println("----------------------------------");
                anyQuarantined = true;
            }
        }

        if (!anyQuarantined) {
            System.out.println("No aliens currently in quarantine.");
        }
    }

    public void friendlyPeaceInducingProtocol(boolean safe) {
        if (safe) {
            System.out.println("BEGINNING 'FRIENDLY-PEACE-INDUCING' PROTOCOL...");
            System.out.println("SUBJECT HAS BEEN MARKED BY OUR 'CLEANING' STAFF!");
            System.out.println("INFORM THE SUBJECT THAT THERE'S NO ESCAPE");
        } else {
            System.out.println("SUBJECT HAS BEEN CONSIDERED A SAFE ADDITION TO EARTH");
            System.out.println("PLEASE DON'T FORGET TO REMIND THE SUBJECT TO COME BACK FOR THE WEEKLY ANALYSIS NEXT WEEK.");
            System.out.println("SAY TO THE SUBJECT: 'HAVE A GOOD LIFE WHILE YOU CAN.'");
        }
    }

    public void controlSystemReport() {
        System.out.println("___________________________________________________________________________________");
        System.out.println("ENTRY REPORT");
        System.out.println("___________________________________________________________________________________");

        for (Alien alien : aliens) {
            System.out.println("Name: " + alien.getName());
            System.out.println("Species: " + alien.getSpecies().getName());
            System.out.println("Threat Level: " + alien.getEstimatedThreatLevel());
            System.out.println("Entry Date: " + alien.getDate());
            if (alien.isQuarantined()) {
                System.out.println("Quarantine Status: Yes");
            } else {
                System.out.println("Quarantine Status: No");
            }
            System.out.println("----------------------------------");
        }
    }

    public Planet planetControl(String planetName) {
        for (Planet planet : planets) {
            if (planet.getName().equalsIgnoreCase(planetName)) {
                return planet;
            }
        }
        Planet p = new Planet(planetName);
        planets.add(p);
        return p;
    }

    public Species specimenControl(String specimenName) {
        for (Species specimen : species) {
            if (specimen.getName().equalsIgnoreCase(specimenName)) {
                return specimen;
            }
        }
        Species s = new Species(specimenName, null, 0);
        species.add(s);
        return s;
    }

    public static void main(String[] args) {
        AlienControl alienControl = new AlienControl();
        alienControl.mainMenu();
    }
}
