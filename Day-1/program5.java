
// WAP to count the size of given string
import java.util.*;

class Test {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			count++;
		}	
		System.out.println("Length: "+count);	
	}
}
