package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count;
        int num;
        int arr[];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in this sleepy array, please:");
        num = input.nextInt();
        arr = new int[num];
        System.out.println("OH MY " + num + " FOR YOUR SOUL");

        for (count = 0; count < num; count++){
            arr[count] = input.nextInt();
        }

        boolean sort = false;
	    int exchange;

	    while (!sort) {
	        sort = true;
	        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr [i+1]){
                    sort = false;
                    exchange = arr [i];
                    arr[i] = arr[i+1];
                    arr [i+1] = exchange;
                }
            }
        }
        System.out.println("Your sleeping hours for this week:" + "\n" + Arrays.toString(arr));
    }
}
