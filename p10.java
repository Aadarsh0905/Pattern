package Pattern;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Give the no. of test cases you want in the output: ");
        int t=in.nextInt();
        for (int i = 0; i <t; i++) {
            System.out.print("Enter the number of rows to print: ");
            int n=in.nextInt();
            p10(n);
        }
    }
    static void p10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
