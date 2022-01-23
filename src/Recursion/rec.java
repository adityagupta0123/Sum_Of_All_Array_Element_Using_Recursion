package Recursion;

import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("Enter element "+ i);
            arr [i] = sc.nextInt();
        }
        System.out.println("Total Sum : ");
        System.out.println(sum(arr, n));

    }
    public static int sum( int[] ar,int n){
        if(n == 0 )
            return 0 ;
        return ar[n-1] + sum(ar, n-1);

    }
}
