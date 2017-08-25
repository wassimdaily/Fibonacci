package com.sjsu.sanaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter the number that you wish to calculate the fibonacci up to it: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int count = Integer.valueOf(input);
        int res;

        ArrayList<Integer> result = new ArrayList<Integer>();

        System.out.println("The iterative version is as follow: ");

        if(count == 1){

            System.out.println("Fibonacci series is: " + count);
        }
        if(count == 2){
            System.out.println("Fibonacci series is: " + count + " " + count);
        }
        else{

            int first = 1;
            int second = 1;

            for(int i = 1; i < count - 1; i++){

                res = first + second;
                result.add(res);
                first = second;
                second = res;
            }

            System.out.print("1 1 ");
            for(int j = 0; j < result.size(); j++){
                System.out.print(result.get(j) + " ");
            }


        }

        System.out.println("\nThe recursive version is as follow: ");
        for(int a = 1; a <= count; a++){
            System.out.print(fibo(a) + " ");
        }

    }

    public static int fibo(int n){

        if(n == 0){
            return 0;

        } else if (n == 1) {
            return 1;

        } else{
            int res = fibo(n-1) + fibo(n - 2);

            return res;

        }
    }
}
