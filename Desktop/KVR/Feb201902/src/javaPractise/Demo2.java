package javaPractise;

import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void arrT() {
		String s[]= {"ABCD","XYZ","TEST","best"};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
