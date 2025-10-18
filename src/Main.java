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
    System.out.println();
    System.out.println("Average:"+Grading.Average(grades));

    int[] rounded_grades=Grading.RoundedGrades(grades);
    System.out.println("Rounded Grades:");
    for (int i=0;i<rounded_grades.length;i++){
        System.out.print(rounded_grades[i]+" ");
    }

    System.out.println();
    System.out.println("Highest Rounded Grade:"+Grading.highest_rounded_grade(grades));

    }
}

