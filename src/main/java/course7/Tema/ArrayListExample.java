package course7.Tema;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Array List size 3;
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.get(0));
        //array
        String[] carsArray =new String[2];
        carsArray[0] = "BMW";
        carsArray[1] = "Audi";
        //carsArray[2] = "Volvo"; // The array has size 2, it cannot have 3 cars!
    }
}
