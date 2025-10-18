import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("AUFGABE 1:");
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] failing_grades = Grading.Failing(grades);
        System.out.println("Failing Grades:");
        for (int i = 0; i < failing_grades.length; i++) {
            System.out.print(failing_grades[i] + " ");
        }
        System.out.println();
        System.out.println("Average:" + Grading.Average(grades));

        int[] rounded_grades = Grading.RoundedGrades(grades);
        System.out.println("Rounded Grades:");
        for (int i = 0; i < rounded_grades.length; i++) {
            System.out.print(rounded_grades[i] + " ");
        }

        System.out.println();
        System.out.println("Highest Rounded Grade:" + Grading.highest_rounded_grade(grades));
        System.out.println();

        System.out.println("AUFGABE 2:");
        int[] numbers = {4, 8, 3, 10, 17};
        System.out.println("Minimale Wert:" + ArrayProcessing.Min(numbers));
        System.out.println("Maximale Wert:" + ArrayProcessing.Max(numbers));
        System.out.println("Maximale Summe:" + ArrayProcessing.maximale_Summer(numbers));
        System.out.println("Minimale Summe:" + ArrayProcessing.minimale_Summe(numbers));

        System.out.println();
        System.out.println("AUFGABE 3:");
        int[] number1 = {2, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number2 = {2, 1, 0, 0, 2, 0, 0, 0, 0};
        int[] sum = NumbersProcessing.Add(number1, number2);
        System.out.println("Summe der Zahlen:");
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

        System.out.println();
        int[] number3 = {2, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number4 = {2, 1, 0, 0, 2, 0, 0, 0, 0};
        int[] diff = NumbersProcessing.Diff(number3, number4);
        System.out.println("Difference der Zahlen:");
        for (int i = 0; i < diff.length; i++) {
            System.out.print(diff[i] + " ");
        }

        System.out.println();
        int digit=2;
        int[] number5={2,3,6,0,0,0,0,0,0};
        int[] mul=NumbersProcessing.Multiply(number5,digit);
        System.out.println("Multiplication der Zahlen:");
        for (int i = 0; i < mul.length; i++) {
            System.out.print(mul[i] + " ");
        }

        System.out.println();
        int digit2=5;
        int[] number6={1,0};
        int[] div=NumbersProcessing.Division(number6,digit2);
        System.out.println("Division der Zahlen:");
        for (int i = 0; i < div.length; i++) {
            System.out.print(div[i] + " ");
        }

        System.out.println();
        System.out.println("AUFGABE 4:");
        int[] Tastaturen={40, 35, 70, 15, 45};
        int[] USB={20, 15, 40, 15};
        System.out.println("Billigste Tastatur:"+ ElektronikShop.billigsteTastatur(Tastaturen));
        System.out.println();
        System.out.println("Teuerste Gegenstand:"+ElektronikShop.teuersteGegenstand(Tastaturen,USB));
        System.out.println();
        int budget=30;
        int[] Preise={15,45,20};
        System.out.println("teuerster usb laufwerk fur budget:"+ElektronikShop.BudgetUSB(Preise, budget));
    }
}

