public class Species{
    private static int nextInt = 1;
    protected int id;
    protected String name;
    protected Planet planet;
    protected int threatLevel;

    public Species(String name, Planet planet, int threatLevel) {
        this.id = nextInt++;
        this.name = name;
        this.planet = planet;
        this.threatLevel = threatLevel;
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

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }
}
