package javaProgrammes;
import org.testng.annotations.Test;

public class programmes {

	@Test(enabled=false) //Fibonacci Series
	public void fibS() {
		int n1=0,n2=1,n3,count=8;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=count;++i) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}
	
	@Test(enabled=false) // Palindrome number
	public void paliNo() {
		int n=121,sum=0,r,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		
	}
	
	@Test(enabled=false) // Reverse a number
	public void rev() {
	int n=123,sum=0,r;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);		
	}
	
	@Test(enabled=false)
	public void arr() { // to print array elemts
		int a1[] = {10,11,2,6,5};
//		int a2[] = {11,22,2,10,51};
	
		for(int i=0;i<a1.length;i++) {
		System.out.println(a1[i]);
		}
	}
	
	@Test
	public void patr5() {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}