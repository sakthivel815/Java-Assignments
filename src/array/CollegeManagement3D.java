package array;

import java.util.Scanner;

public class CollegeManagement3D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[][][] = new int[2][2][3];
        int overallHighest = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("\nDepartment " + (i + 1));
            
            for (int j = 0; j < 2; j++) {
                System.out.println("Class " + (j + 1));

                for (int k = 0; k < 3; k++) {
                    System.out.print("Student " + (k + 1) + ": ");

                    marks[i][j][k] = sc.nextInt();

                    if (marks[i][j][k] > overallHighest) {
                        overallHighest = marks[i][j][k];
                    }
                }
            }
        }

        System.out.println("\nCollege Management Results");

        for (int i = 0; i < 2; i++) {
            int departmentHighest = 0;
            System.out.println("\nDepartment " + (i + 1));

            for (int j = 0; j < 2; j++) {
                int total = 0;
                System.out.println("\nClass " + (j + 1));

                for (int k = 0; k < 3; k++) {
                    System.out.println(
                        "Student " + (k + 1) + ": " + marks[i][j][k]
                    );

                    total = total + marks[i][j][k];

                    if (marks[i][j][k] > departmentHighest) {
                        departmentHighest = marks[i][j][k];
                    }
                }

                double average = total / 3.0;

                System.out.println("Class Total: " + total);
                System.out.println("Class Average: " + average);
            }

            System.out.println(
                "Department Highest Mark: " + departmentHighest
            );
        }

        System.out.println("\nOverall Highest Mark: " + overallHighest);

        sc.close();
    }
}

