import java.util.ArrayList;

public class Main {

    public static double gravitationalAttraction() {
        ArrayList<PlanetarySystem> planet = new ArrayList<>();
        PlanetarySystem p1 = new PlanetarySystem(3.302 * 10E23, 5.43, 4880, 5.791 * 10E7, 1,"Mercurio" + "\n");
        PlanetarySystem p2 = new PlanetarySystem(4.867 * 10E24, 5.24, 12104, 1.08 * 10E8, 2, "Venus" + "\n");
        PlanetarySystem p3 = new PlanetarySystem(5.972 * 10E24, 5.51, 12756, 1.496 * 10E8, 3, "Tierra" + "\n");
        PlanetarySystem p4 = new PlanetarySystem(6.39 * 10E23, 3.93, 6796, 2.2794 * 10E8, 4, "Marte" + "\n");
        PlanetarySystem p5 = new PlanetarySystem(1.899 * 10E27, 1.33, 142984, 7.7833 * 10E8, 5, "Jupiter" + "\n");
        PlanetarySystem p6 = new PlanetarySystem(5.683 * 10E26, 0.7, 108728, 1.4294 * 10E9, 6, "Saturno" + "\n");
        PlanetarySystem p7 = new PlanetarySystem(8.681 * 10E25, 1.27, 51118, 2.87099* 10E9, 7, "Urano" + "\n");
        PlanetarySystem p8 = new PlanetarySystem(1.024 * 10E26, 1.64, 49532, 4.5043 * 10E9, 8, "Neptuno" + "\n");
        PlanetarySystem p9 = new PlanetarySystem(1.29 * 10E22, 1.8, 2320, 5.91352 * 10E9, 9, "Plutón" + "\n");
        planet.add(p1);
        planet.add(p2);
        planet.add(p3);
        planet.add(p4);
        planet.add(p5);
        planet.add(p6);
        planet.add(p7);
        planet.add(p8);
        planet.add(p9);

        /**
         * Ecuacion para el calculo de atracción gravitacional
         */
        double gravity = 6.67E-11;  // Universal Gravitation Constant.
        double m1 = p1.getMass();
        double m2 = p2.getMass();
        double d = p1.getDistanceSun() - p2.getDistanceSun();
        double dElevado = Math.pow(d, 2);
        double F = gravity*((m1*m2)/dElevado);

        System.out.println("La atracción gravitacional entre Mercurio y Venus es de: " + F + " N");
        return F;
    }
    public static void main(String[] args) {
        gravitationalAttraction();
    }
}