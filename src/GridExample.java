import java.text.SimpleDateFormat;
import java.util.Date;


public class GridExample {

	public static void main(String[] args) {
     Date date=new Date();
     SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
     String str=formatter.format(date);
     System.out.println(str);
    
    
		

	}

}
