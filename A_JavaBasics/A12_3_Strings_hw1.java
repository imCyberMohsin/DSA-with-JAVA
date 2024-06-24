//! Stings Homework Q1: Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class A12_3_Strings_hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size of the Array: ");
        int size = sc.nextInt();

        String arr[] = new String[size];
        int totalLength = 0;

        for(int i=0; i<size; i++){
            arr[i] = sc.nextLine();
            totalLength = totalLength+arr[i].length();
        }
        System.out.println("Total Length = "+totalLength);

        sc.close();
    }
}