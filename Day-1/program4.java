// WAP to print the odd numbers in the given range

import java.util.*;

class Test {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
        int end = sc.nextInt();

		for(int i=start;i<=end;i++){
			if(i%2==1)
			    System.out.println(i);
		}
	}
}
