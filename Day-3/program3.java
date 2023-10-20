// WAP to check the given no is palindrome or not

import java.util.*;

class Test {

    static void palindrome(int n){

        int temp = n;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
        }
        if(rev==n)
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindrome(n);
    }
}