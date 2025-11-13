package Pattern;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Give the no. of test cases you want in the output: ");
        int t=in.nextInt();
        for (int i = 0; i <t; i++) {
            System.out.print("Enter the number of rows to print: ");
            int n=in.nextInt();
            p16(n);
        }
    }
    static void p16(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int d=i+64;
                System.out.print((char)d);
            }
            System.out.println();
        }
    }
}
