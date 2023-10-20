// A B C D
// B C D E
// C D E F
// D E F G

import java.util.*;

class Test {

    static void pattern(int n){
        char ch = 'A';
        for(int i=0;i<n;i++){
            char x = ch;
            for(int j=0;j<n;j++){
                System.out.print(x+++" ");
            }
            ch++;
            System.out.println();
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }
}