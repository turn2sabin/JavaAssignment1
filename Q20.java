package Java1Assignment;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 0; j < i; j++) {
            for (int k = 0; k < j; k++) {
                if (j == 1) {
                    System.out.print("*");
                } else if (j == 2) {
                    System.out.print("#");

                } else if (j==3)
                        System.out.print("^");}

                System.out.println();
            }
        }
    }




