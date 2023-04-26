import java.util.Arrays;

public class FindMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
		    int n = array.length + 1;
		    int expectedSum = n * (n + 1) / 2;
		    int actualSum = Arrays.stream(array).sum();
		    int missingNumber = expectedSum - actualSum;
		    System.out.println("Missing number: " + missingNumber);
		  }

	}


