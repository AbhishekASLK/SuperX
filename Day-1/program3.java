// WAP to check whether the given no is odd or even

import java.util.*;

class Test {

	static void evenOdd(int n){

		if(n%2==0)
            		System.out.println(n+" is even");
        	else
            		System.out.println(n+" is odd");
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
     
		evenOdd(n);
	}
}
