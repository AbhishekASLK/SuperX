// WAP to check whether the string contains vowels and return the count of vowels

import java.util.*;

class Test {

    static int vowelsCount(String str){
        char[] ch = str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(vowelsCount(str));
    }
}