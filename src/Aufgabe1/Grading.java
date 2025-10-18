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

    public static double Average(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for(int grade : grades) {
            sum+=grade;
        }
        return (double)sum/grades.length;
    }

    public static int[] RoundedGrades(int[] grades) {
        int[] rounded_grades = new int[grades.length];
        int number=0;
        int next_multiple_of_5=0;
        for(int grade : grades) {
            if(grade%10<5){
                next_multiple_of_5=grade/10*10+5;
            }
            else
                next_multiple_of_5=grade/10*10+10;

            if(next_multiple_of_5-grade<3 && grade >=38) {
                rounded_grades[number] = next_multiple_of_5;
                }
            else
                rounded_grades[number] = grade;
            number++;
        }
        return rounded_grades;
    }

    public static int highest_rounded_grade(int[] grades) {
         int[] rounded_grades = RoundedGrades(grades);
         int max=rounded_grades[0];
         for(int grade : rounded_grades) {
             if(grade>max) {
                 max=grade;
             }
         }
         return max;
    }
}
