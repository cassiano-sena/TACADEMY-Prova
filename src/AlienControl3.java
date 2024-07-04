////9) Sistema de Controle de Entrada de Alienígenas:
////
////Você deve implementar um sistema de controle para monitorar a entrada de alienígenas no planeta Terra, permitindo aos usuários realizar as seguintes operações:
////
////Registro de Alienígenas: Cada alienígena tem características como id, nome, espécie, nível de periculosidade e data/hora de entrada.
////
////Registo de espécie: Cada espécie tem um planeta de origem e um nivel de periculosidade base.
////
////Avaliação de Periculosidade: O sistema deve avaliar a periculosidade de cada alienígena com base em sua espécie e atributos específicos.
////
////Quarentena e Monitoramento: Alienígenas considerados perigosos devem ser colocados em quarentena e monitorados continuamente.
////
////Relatório de Entradas: Mostrar um relatório com todos os alienígenas registrados, incluindo detalhes como nome, espécie, status de quarentena e avaliação de periculosidade.
////
////Encerramento do Programa: Permitir ao usuário encerrar o programa de forma adequada.
////
////Funções extras:
////-Ranking de periculosidade
////-Verificar todos planetas, espécies e alienígenas cadastrados.
////-Verificar alienígenas em quarentena
////-Sistema de pesquisa como:
////   -Mostrar todos os alienígenas de uma espécie específica.
////   -Mostrar todos os alienígenas que entraram no planeta nos últimos 6 meses.
////
////Encaminhar link do github.
//import java.time.LocalDateTime;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//public class AlienControl {
//    private List<Alien> aliens;
//    private List<Species> species;
//    private List<Planet> planets;
//    private Scanner scanner;
//    public AlienControl() {
//        aliens = new ArrayList<>();
//        species = new ArrayList<>();
//        planets = new ArrayList<>();
//        scanner = new Scanner(System.in);
//    }
//
//    public void mainMenu() {
//        System.out.println("___________________________________________________________________________________");
//        System.out.println("STARTING ALIEN CONTROL SYSTEM");
//        System.out.println("___________________________________________________________________________________");
//        System.out.println("THIS INTERFACE IS PROHIBITED FOR ANYONE OUTSIDE THE INTERPLANETARY GOVERNMENT");
//        System.out.println("EMPLOYEE ID: 7294");
//        System.out.println("ACCESS GRANTED!");
//        int choice;
//        do {
//            System.out.println("___________________________________________________________________________________");
//            System.out.println("1- ALIEN REGISTER");
//            System.out.println("2- ALIEN MONITORING");
//            System.out.println("3- ENTRY REPORT");
//            System.out.println("4- EXIT");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    alienControlSystem();
//                    break;
//                case 2:
//                    System.out.println("ALIEN MONITORING");
//                    break;
//                case 3:
//                    controlSystemReport();
//                    break;
//                case 4:
//                    System.out.println("EXIT");
//                    break;
//                default:
//                    System.out.println("INVALID!");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    public void alienControlSystem(){
//        Species species = null;
//        int estimatedThreatLevel = -1;
//        LocalDateTime entryDate;
//        boolean safe;
//        scanner.nextLine();
//        System.out.println("___________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________");
//        System.out.println("WELCOME TO THE MANDATORY ALIEN CONTROL PROCEDURE");
//        System.out.println("___________________________________________________________________________________");
//        System.out.println("___________________________________________________________________________________");
//        System.out.println("PLEASE INFORM THE SUBJECTS CREDENTIALS FOR 'FRIENDLY' AND 'PEACE-INDUCING' ANALYSIS:");
//        System.out.println("NAME: ");
//        String name = scanner.nextLine();
//        System.out.println("SPECIES: ");
//        String speciesName = scanner.nextLine();
//        Species alienSpecies = specimenControl(speciesName);
//        while(estimatedThreatLevel < 0 || estimatedThreatLevel > 9){
//            System.out.println("OFFICIAL UNIVERSAL-GOVERNMENT ESTIMATED THREAT LEVEL (0-9): ");
//            estimatedThreatLevel = scanner.nextInt();
//            if (estimatedThreatLevel <= 5){
//                &safe=true;
//            }else{
//                &safe=false;
//            }
//        }
//        scanner.nextLine();
//
//        System.out.println("BIRTH PLANET: ");
//        String birthPlanetName = scanner.nextLine();
//        Planet planet = planetControl(birthPlanetName);
//        entryDate=LocalDateTime.now();
//
//        System.out.println("DON'T FORGET TO THANK THE SUBJECT FOR 'KINDLY' SHARING EVERY DETAIL");
//        Alien alien = new Alien(entryDate,estimatedThreatLevel,alienSpecies,name);
//        friendlyPeaceInducingProtocol(safe);
//    }
//    public void friendlyPeaceInducingProtocol(boolean safe){
//        if(safe){
//            System.out.println("BEGINNING 'FRIENDLY-PEACE-INDUCING' PROTOCOL...");
//            System.out.println("SUBJECT HAS BEEN MARKED BY OUR 'CLEANING' STAFF!");
//            System.out.println("INFORM THE SUBJECT THAT THERES NO ESCAPE");
//        }else{
//            System.out.println("SUBJECT HAS BEEN CONSIDERED A SAFE ADDITION TO EARTH");
//            System.out.println("PLEASE DONT FORGET TO REMIND THE SUBJECT TO COMEBACK FOR THE WEEKLY ANALYSIS NEXT WEEK.");
//            System.out.println("SAY TO THE SUBJECT: 'HAVE A GOOD LIFE WHILE YOU CAN.'");
//        }
//    }
//    public void controlSystemReport(){
//        for (Alien alien : aliens){
//            System.out.println("NAME: " + alien.getName());
//            System.out.println("SPECIES: " + alien.getSpecies().getName());
//            System.out.println("THREAT: " + alien.getEstimatedThreatLevel());
//            System.out.println("ENTRY: " + alien.getDate());
//        }
//    }
//    public Planet planetControl(String planetName){
//        for (Planet planet : planets){
//            if (planet.getName().equalsIgnoreCase(planetName)){
//                return planet;
//            }
//        }
//        Planet p = new Planet(planetName);
//        planets.add(p);
//        return p;
//    }
//    public Species specimenControl(String specimenName){
//        for (Species specimen : species){
//            if (specimen.getName().equalsIgnoreCase(specimenName)){
//                return specimen;
//            }
//        }
//        Species s = new Species(specimenName, null, 0);
//        species.add(s);
//        return s;
//    }
//}
//
