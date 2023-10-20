// WAP to print the composite numbers in the given range 

import java.util.*;

class Test {

    static void composite(int start,int end){
        for(int i=start;i<=end;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%2==0)
                    count++;
            }
            if(count!=0)
                System.out.println(i);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        composite(start,end);
    }
}