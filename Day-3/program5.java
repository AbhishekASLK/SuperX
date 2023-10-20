// WAP to check whether the string contains characters other than letters

import java.util.*;

class Test {

    static void letter(String str){

        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            int f = 0;
            if((arr[i]<'A' || arr[i]>'z') ||  (arr[i]<'Z' && arr[i]>'a'))
                f=1;
            if(f==1)
                System.out.println("It contains character other than letters");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        letter(str);
    }
}