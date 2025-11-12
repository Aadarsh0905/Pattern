package Pattern;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Give the no. of test cases you want in the output: ");
        int t=in.nextInt();
        for (int i = 0; i <t; i++) {
            System.out.print("Enter the number of rows to print: ");
            int n=in.nextInt();
            p11(n);
        }
    }
    static void p11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int p=0;p<2*(n-i);p++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
