// WAP to print each reverse numbers in the given range 

import java.util.*;

class Test {

    static void reverseInRange(int start,int end){
        for(int i=start;i<=end;i++){
            int temp = i;
            int rev = 0;
            while(temp!=0){
                int rem = temp%10;
                rev = rev*10+rem;
                temp/=10;
            }
            System.out.println(rev);
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        reverseInRange(start,end);
    }
}