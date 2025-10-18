package Aufgabe1;

public class Grading {
    public static int[] Failing(int[] grades) {
        int count = 0;
        for(int grade : grades) {
            if(grade < 40) {
                count++;
            }
        }
        int[] failing_grades = new int[count];
        int number = 0;
        for(int grade : grades) {
            if(grade < 40) {
                failing_grades[number] = grade;
            }
            number++;
        }
        return failing_grades;
    }
}
