
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {

    public static List<Double> quickSort(List<Double> array){
        if (array.size() < 1){
            return new ArrayList<>();
        }
        List<Double> left = new ArrayList<>();
        List<Double> right = new ArrayList<>();
        double pivot = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            Double number = array.get(i);
            if (number < pivot) {
                left.add(number);
            } else {
                right.add(number);
            }
        }

        return Stream.of(quickSort(left), List.of(pivot), quickSort(right))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
    public static List<Double> bubbleSort(List<Double> array){
        for (int i = 0; i < array.size() - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j) > array.get(j + 1)){
                    Double currentNumber = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, currentNumber);
                    flag = false;
                }
            }
            if (flag) break;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Double> randomArray = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            randomArray.add(Math.random()*10);
        }
        System.out.println(randomArray);
        int sortingMethod;
        do {
            System.out.println("¿Qué métodos quieres aplicar para ordenar la lista?");
            System.out.println("Selecciona 1) para Bubble sort. 2) para Quick sort.  o " +
                    "cualquier otro numero para salir");
            Scanner scanner = new Scanner(System.in);
            sortingMethod = Integer.parseInt(scanner.nextLine());

            switch (sortingMethod){
                case 1:
                    System.out.println(bubbleSort(randomArray));
                    break;
                case 2:
                    System.out.println(quickSort(randomArray));
                    break;
                default:
                    System.out.println("Escoja una opción correcta");
            }
        } while (sortingMethod <= 2);
            System.out.println("Termino el programa");
    }
}