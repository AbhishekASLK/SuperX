// A B C D
// D C B A
// A B C D
// D C B A

import java.util.*;

class Test {

    static void pattern(int n){

        for(int i=0;i<n;i++){
            char ch1 = 'A';
            char ch2 = (char)(65+n-1);
            for(int j=0;j<n;j++){
                if(i%2==0)
                    System.out.print(ch1+++" ");
                else
                    System.out.print(ch2--+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}