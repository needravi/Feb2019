package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class wc {
	
	

	@Test(enabled = false)  // word count in a String
	public void wordcount () {
		String str = "Automation using JAVA";
		String [] count = str.split(" ");
		int wc1 = count.length;
		System.out.println(wc1);
	}
	
	@Test (invocationCount=2) // Reverse a String
	public void revString() {
		String str = "TESTING";
		String rev = " ";
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
	
	@Test // largest element of an array
	public void arrays() {
		int a [] = {10,20,22,11,10};
		int largest = a[0];
		System.out.println(a.length);  
		for(int i=0;i<a.length;i++) {
			if(a[i]<largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);
		
	}
	
	@Test(dependsOnMethods = "arrElem") // sum of Array elements
	public void arraysADD() {
		int a [] = {10,20,22,11,10};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		
	}
	
	@Test(priority=3) // to print array elements
	public void arrElem() {
		int a [] = {10,20,22,11,10};
		
		System.out.println(Arrays.toString(a));
		
		for(int ae:a) {
			System.out.println(ae);
		}
	
	}
	
	@Test() // remove duplicate elements in an array
	public void removduplic() {
		int a [] = {11,22,10,11,30,22};
		
		Set s1 = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			s1.add(a[i]);	
		}
						
	}
}
