// 1 
// 2 4
// 3 6 9
// 4 8 12 16

import java.util.*;

class Test {

    static void pattern(int n){

        for(int i=1;i<=n;i++){
            int x = i;
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x+=i;
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