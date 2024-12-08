package comporator4;

import java.util.Comparator;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", year=" + year + '}';
    }


    static class ModelComporator implements Comparator<Car> {
        @Override
        public int compare(Car c1, Car c2) {
            return c1.getModel().compareTo(c2.getModel());
        }
    }

    static class YearComporator implements Comparator<Car> {
        @Override
        public int compare(Car c1, Car c2) {
            return Integer.compare(c1.getYear(), c2.getYear());
        }


    }
}