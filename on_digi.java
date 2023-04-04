import java.util.*;

public class on_digi{
	public static void main(String[] args) {
		try {  
		int hours=0, minutes=0, seconds=0;
        String timeString="";
          while (true) {  
  		 Thread t=new Thread("demi");
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  		  System.out.println(timeString);
            System.out.println(hours+" : "+minutes+" : "+seconds);
  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
	}
}