// WAP to check whether the given no is prime or composite

import java.util.*;

class Test {

    static void isPrime(int n){
        if(n==1){
            System.out.println("1 is not prime nor composite");
            return;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is composite");
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);
    }
}