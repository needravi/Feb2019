package javaPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Samples {

	@Test // No. of words in a String  
	public void TC01_wordCount() {
		String str = "Functional Test Using Selenium WebDriver";
		String [] w = str.split(" ");
		int count = w.length;
		System.out.println(count);
		
	}
	
	@Test //(enabled=false) // Revese a String
	public void TC02_revStr() {
		String str = "FUCTIONAL";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	@Test //(enabled=false) // Print Array Elements
	public void TC03_arrs() {
		int a [] = {10,22,11,22,32,00};
		System.out.println(Arrays.toString(a));
	}
	
	@Test // Remove duplicates elements from array 
	public void TC04_arrs1() {
		int a [] = {33,10,22,11,22,32,00};
		
		Set<Object> s = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);				
		}
		System.out.println(s);	
	}
}
