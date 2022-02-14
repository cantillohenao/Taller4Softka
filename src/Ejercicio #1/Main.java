import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void gravitationalAttraction() {
        ArrayList<Planet> planet = new ArrayList<>();
        Planet p1 = new Planet(3.302 * 10E23, 5.43, 4880, 5.791 * 10E7, 1,"Mercurio");
        Planet p2 = new Planet(4.867 * 10E24, 5.24, 12104, 1.08 * 10E8, 2, "Venus");
        Planet p3 = new Planet(5.972 * 10E24, 5.51, 12756, 1.496 * 10E8, 3, "Tierra");
        Planet p4 = new Planet(6.39 * 10E23, 3.93, 6796, 2.2794 * 10E8, 4, "Marte");
        Planet p5 = new Planet(1.899 * 10E27, 1.33, 142984, 7.7833 * 10E8, 5, "Jupiter");
        Planet p6 = new Planet(5.683 * 10E26, 0.7, 108728, 1.4294 * 10E9, 6, "Saturno");
        Planet p7 = new Planet(8.681 * 10E25, 1.27, 51118, 2.87099* 10E9, 7, "Urano");
        Planet p8 = new Planet(1.024 * 10E26, 1.64, 49532, 4.5043 * 10E9, 8, "Neptuno");
        Planet p9 = new Planet(1.29 * 10E22, 1.8, 2320, 5.91352 * 10E9, 9, "Plutón");
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
         * Logica del programa
         */
        System.out.println("Bienvenido al sistema de calculo gravitacional");
        System.out.println("Planetas Disponibles");
        System.out.println("Id " + p1.getId() + " " + p1.getName() + ", " + "Id " + p2.getId() + " " + p2.getName() +
                ", " + "Id " + p3.getId() + " " + p3.getName() + ", " + "Id " + p4.getId() + " " + p4.getName() +
                ", " +"Id " + p5.getId() + " " + p5.getName() + ", " + "Id " + p6.getId() + " " + p6.getName() +
                ", " + "Id "  + p7.getId() + " " + p7.getName() + ", " + "Id " + p8.getId() + " " + p8.getName() +
                ", " + "Id " + p9.getId() + " " + p9.getName());

        Boolean flag = true;
        while (flag) {

            System.out.println("Seleccione 2 Id de planetas para hacer el calculo");
            System.out.println("Ingrese 0 en cualquier momento para salir");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Id del primer planeta");
            int idPlaneta1 = Integer.parseInt(scanner.nextLine());

            if(idPlaneta1 == 0 ){
                System.out.println("Termino el programa");
                flag = false;
                break;
            }
            System.out.println("Id del segundo planeta");
            int idPlaneta2 = Integer.parseInt(scanner.nextLine());

            if(idPlaneta2 == 0){
                System.out.println("Termino el programa");
                flag = false;
                break;
            }
            Planet planeta1 = planet.get(idPlaneta1 - 1);
            Planet planeta2 = planet.get(idPlaneta2 - 1);
            double F = getF(planeta1, planeta2);
            System.out.println("La atracción gravitacional de " + planeta1.getName() + " y "+ planeta2.getName() + " es de: "
                    + F + " N");
        }
    }

    /**
     * Metodo para el calculo de atracción gravitacional
     */
    private static double getF(Planet p1, Planet p2) {
        double gravity = 6.67E-11;  // Universal Gravitation Constant.
        double m1 = p1.getMass();
        double m2 = p2.getMass();
        double d = p1.getDistanceSun() - p2.getDistanceSun();
        double dElevado = Math.pow(d, 2);
        return gravity*((m1*m2)/dElevado);
    }

    public static void main(String[] args) {
        gravitationalAttraction();
    }
}