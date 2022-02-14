
/**
 * @author [Juan Camilo, Cantillo Henao]
 */
public class Planet {
    private double mass;
    private double density;
    private int diameter;
    private double distanceSun;
    private int id;
    private String name;

    public Planet(double mass, double density, int diameter, double distanceSun, int id, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.id = id;
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(long distanceSun) {
        this.distanceSun = distanceSun;
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

