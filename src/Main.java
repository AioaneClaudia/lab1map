import Aufgabe1.Grading;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] grades={29, 37, 38, 41, 84, 67};
    int[] failing_grades=Grading.Failing(grades);
    System.out.println("Failing Grades:");
    for (int i=0;i<failing_grades.length;i++){
        System.out.print(failing_grades[i]+" ");
    }
    }
}

