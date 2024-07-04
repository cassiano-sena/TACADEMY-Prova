import java.time.LocalDateTime;

public class Alien {
    private static int nextInt = 1;
    protected int id;
    protected String name;
    protected Species species;
    protected int estimatedThreatLevel;
    protected LocalDateTime date;
    protected boolean quarantine;

    public Alien(LocalDateTime date, int estimatedThreatLevel, Species species, String name) {
        this.id = nextInt++;
        this.date = date;
        this.estimatedThreatLevel = estimatedThreatLevel;
        this.species = species;
        this.name = name;
        this.quarantine = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getEstimatedThreatLevel() {
        return estimatedThreatLevel;
    }

    public void setEstimatedThreatLevel(int estimatedThreatLevel) {
        this.estimatedThreatLevel = estimatedThreatLevel;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isQuarantined() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }
}
