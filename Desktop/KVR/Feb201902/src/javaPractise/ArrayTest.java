package javaPractise;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class ArrayTest {
	
	@Test(enabled=false) // remove duplicates
	public void arr() {
		int a [] = {11,10,20,30,11,30};
		
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<a.length;i++) {
		s.add(a[i]);
		}
		System.out.println(s);
	}
	
	@Test(enabled=false) // largest element in an array
	public void largEle() {
		int a [] = {10,20,11,1,21,33,55};
		int lar = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>lar);
				lar=a[i];
		}
		System.out.println(lar);		
	}
	
	@Test(enabled=false) //lowest value in an array
	public void lowest() {
		int a [] = {10,2,22,11,5,1};
		int least = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<least)
				least=a[i];
		}
		System.out.println(least);
	}
	
	
	@Test(enabled=false) // sum of array elements
	public void sum() {
		int a[]={10,20,11,};
		int sum=0; 
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of arry ele" + sum);
	}
	
	@Test(enabled=false)// word count 
	public void wc() {
		String s = "Functional Testing with Selenium WebDriver";
		String a[] = s.split("");
		int count = a.length;
		System.out.println(count);
		
	}
	
	@Test(enabled=false)
	public void revStr() {
		String s = "TESTING";
		String rev = " ";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	@Test
	public void fel() {
		int a[]= {11,22,5,14};
		for(int i:a) {
			System.out.println(i);
		}
		
	}
		
/*	public static void main(String[] args) {
		System.out.println("main method");
	}*/
	
	
}
