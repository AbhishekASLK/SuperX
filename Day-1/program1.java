
// 1 2 3 4
// 2 3 4 5
// 3 4 5 6
// 4 5 6 7

import java.util.*;

class Test {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			int x = i;
			for(int j=1;j<=n;j++){
				System.out.print(x+++" ");
			}
			System.out.println();
		}
	}
}
