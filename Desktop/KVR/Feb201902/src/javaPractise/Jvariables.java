package javaPractise;

public class Jvariables 
{
	int i=10, x=22; // instance variable
	static String s="JAVA"; // static variable

	void localVar() 
	{
	int j=22; // local variable
//	System.out.println("local variable: "+j);
	}
	
	public void fel() // for each loop 
	{ 
		int a[]= {12,11,2,12};
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	public void ifl() // infinite for loop 
	{
		for(;;) {
			System.out.println("il");
		}
	}
	
	public void wl() // while loop 
	{
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void iwl() { //Infinite while loop
		while(true) {
			System.out.println("IWL");
		}
	}
	
	public void fib() {
		int n1=0,n2=1,n3,count=12;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=count;++i) 
		{
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}	
		
	}
	
	public void pns() // Palindrome number 
	{
		int n=43,temp,sum=0,r;
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
	
	public void factL() {
		int i,fact=1,n=7;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);				
	}
	
	public void fs01() // fibonaccie 
	{
		int i,n1=0,n2=1,n3,count=12;
		System.out.print(n1 + " " + n2);
		for(i=2;i<=count;++i) {
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}		
	}
	
	public void pd03() 
	{
		int i,n,r,sum=0,temp;
		n=121;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
		System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
	
	public void fact04() {
		int i,fact=1,n=6;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	public void ast() {
		int a[] = {11,2,33,10,55};
		int l=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>l) {
				l=a[i];
			}
		}
		System.out.println(l);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		Jvariables jv=new Jvariables();
//		System.out.println("instace variable: "+jv.i);
//		System.out.println("static variable: "+Jvariables.s);
		jv.localVar();
		if(jv.x>jv.i) {
//			System.out.println( jv.x + " is bigger than " + jv.i);
		}
		
//		jv.fel();
//		jv.ifl();
//		jv.wl();
//		jv.iwl();
//		jv.fib();
//		jv.pns();
//		jv.factL();
//		jv.fs01();
//		jv.pd03();
//		jv.fact04();
		jv.ast();
	}
	
	

}
