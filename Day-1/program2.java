
// 1 
// 1 2
// 2 3 4
// 4 5 6 7

import java.util.*;

class Test {

	static void pattern(int n){
        	int x = 1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x+++" ");
			}
            		x--;
			System.out.println();
		}
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        	
		pattern(n);
	}
}
