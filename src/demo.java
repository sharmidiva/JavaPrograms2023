

	public class demo {
		//try cstch
	    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
	    	
	    	int i=2;
	  // 	int i=0;
	    	int j=0;
	    	
	    	int nums[]=new int[5];
	    	String str=null;
	    	
	    	try
	    	{
	    		j=18/0;
	    		System.out.println(str.length());
	    		System.out.println(nums[1]);
	    		System.out.println(nums[5]);
	    	}
	    	catch(Exception e)
	    	{
	  
	    		System.out.println("Something went wrong."+e);
	    	}
	    	/*catch(Exception e)
	    	{
	  
	    		System.out.println("Something went wrong."+e);
	    	}*/
	    	System.out.println(j);
	    	System.out.println("Bye");
	    }
	}


