import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("AUFGABE 1:");
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
    System.out.println();

    System.out.println("AUFGABE 2:");
    int[] numbers={4, 8, 3, 10, 17};
    System.out.println("Minimale Wert:"+ArrayProcessing.Min(numbers));
    System.out.println("Maximale Wert:"+ArrayProcessing.Max(numbers));
    System.out.println("Maximale Summe:"+ArrayProcessing.maximale_Summer(numbers));
    System.out.println("Minimale Summe"+ArrayProcessing.minimale_Summe(numbers));
    }
}

