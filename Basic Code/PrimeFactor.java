import java.util.Scanner;
public class PrimeFactor {
    public static Scanner scn = new Scanner(System.in);
    public static void PrimeFactorFunction(int n){

        for(int div = 2 ; div*div <= n ; div++){
            while(n%div==0){
                n=n/div;
                System.out.print(div+" ");
            }
        }

        if(n!=1){
            System.out.print(n+" ");
        }

    }
    public static void main(String[] args){
        int n = scn.nextInt();
        PrimeFactorFunction(n);
    }
    
}
