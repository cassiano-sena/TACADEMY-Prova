public class Planet{
    protected int id;
    private static int nextInt = 1;
    protected String name;

    public Planet(String name) {
        this.name = name;
        this.id = nextInt++;
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
}
