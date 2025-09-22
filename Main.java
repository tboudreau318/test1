import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//ask user how many students
        System.out.println("Enter the amount of students are in the class: ");
        int n = scanner.nextInt();
        int[] students = new int [n];

//input grades
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the students score: " + (i + 1 + ": "));
            students[i] = scanner.nextInt();
        }
        //calculate sum max min
        int sum = 0;
        int max = students[0];
        int min = students[0];

        for (int m : students){
            sum+= m;
            if (m > max) max = m;
            if (m < min) min = m;
        }
        double average = (double) sum / n;

        System.out.println("The average of the grades are : " + average);
        System.out.println("The lowest grade is: " + min);
        System.out.println("The highest grade is: " + max);





    }
}