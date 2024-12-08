package comporator4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyta", 2020));
        cars.add(new Car("Nissan", 2008));
        cars.add(new Car("Subaru", 2001));
        cars.add(new Car("Lada", 2017));

        cars.sort(new Car.ModelComporator());
        System.out.println("Сортировка по модели:");
        cars.forEach(System.out::println);

        cars.sort(new Car.YearComporator());
        System.out.println("Сортировка по году");
        cars.forEach(System.out::println);


    }
}
