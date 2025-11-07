package Pattern;
import java.lang.*;
import java.util.*;
public class P1{
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("Enter the no. of test cases you want to print: ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Enter the number of rows or columns of the pattern: ");
            int n=in.nextInt();
            NForest(n);
        }
    }
    static void NForest(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
