package methodChainingConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> frnames=Arrays.asList("Apple","Orange");
		System.out.println("Before adding=="+frnames);
		
		List<String> afteradding = new ArrayList<>();
		for(String s:frnames) {
			String newname=s+" fruit";
			afteradding.add(newname);
		}
		System.out.println("After adding fruit=="+afteradding);
		

	}

}
