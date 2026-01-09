package collections;

import java.util.HashMap;
import java.util.Map;
public class StudentGradesApp {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();
        grades.put("Ali", 15.5);
        grades.put("Sara", 18.0);
        grades.put("Youssef", 12.0);
        System.out.println("Grads: " );
        display(grades);

        grades.computeIfPresent("Ali", (k, v) -> v + 1);
        System.out.println("Map after Increase grade: " );
        display(grades);

        grades.remove("Youssef");
        System.out.println("Map after Remove grade: " );
        display(grades);

        System.out.println("Size: " + grades.size());

        double avg = grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double max = grades.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);
        double min = grades.values().stream().mapToDouble(Double::doubleValue).min().orElse(0);

        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        boolean has20 = grades.values().stream().anyMatch(g -> g == 20);
        System.out.println("Contains grade 20? " + has20);
    }
    static void display(Map<String, Double> map) {
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

