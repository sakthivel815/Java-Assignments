package array;

import java.util.Scanner;

public class StudentPerformance2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[][] = new int[3][4];

        int overallHighest = 0;
        int topperClass = 0;
        int topperStudent = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter marks for Class " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Student " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();

                if (marks[i][j] > overallHighest) {
                    overallHighest = marks[i][j];
                    topperClass = i + 1;
                    topperStudent = j + 1;
                }
            }
        }

        System.out.println("\nStudent Performance:");

        for (int i = 0; i < 3; i++) {
            int total = 0;
            int highest = 0;
            System.out.println("\nClass " + (i + 1) + ":");
            
            for (int j = 0; j < 4; j++) {
                System.out.println(
                    "Student " + (j + 1) + ": " + marks[i][j]
                );

                total = total + marks[i][j];
                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }
            }

            System.out.println("Total Marks: " + total);
            System.out.println("Highest Mark: " + highest);
        }

        System.out.println("\nOverall Topper:");
        System.out.println("Class: " + topperClass);
        System.out.println("Student: " + topperStudent);
        System.out.println("Highest Mark: " + overallHighest);

        sc.close();
    }
}

