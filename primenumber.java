package lecture4;
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 45;
		int fact = 0;
		
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				fact++;
			}
		}
			if(fact>=1) {
				System.out.println("not prime");
				
			}else {
				System.out.println("prime");
			}
		}
		
	}

