// 1
// 2 1
// 3 2 1
// 4 3 2 1

import java.util.*;

class Test {

    static void pattern(int n){

        for(int i=1;i<=n;i++){
            int x = i;
            for(int j=1;j<=i;j++){
                System.out.print(x--+" ");
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