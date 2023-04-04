package Collections.test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Collection<String> carBrandsList = new ArrayDeque<>();
        carBrandsList.add("Audi");
        carBrandsList.add("Porche");
        carBrandsList.add("Aston Martin");
        carBrandsList.add("Ferrari");
        carBrandsList.add("Mercedes");
        carBrandsList.add("BMW");
        carBrandsList.add("Lamborghini");

        System.out.println("Number of elements before deleting: " + carBrandsList.size());
        System.out.println(carBrandsList.toString());

        carBrandsList.remove("BMW");
        carBrandsList.remove("Aston Martin");

        System.out.println("Number of elements after deleting BMW and Aston Martin: " + carBrandsList.size());
        System.out.println(carBrandsList.toString());

        Iterator<String> iterator = carBrandsList.iterator();

        while (iterator.hasNext()) {
            String brand = iterator.next();
            if (brand.equals("Audi")) {
                iterator.remove();
                System.out.println(carBrandsList.toString());
            }
        }
    }
}
