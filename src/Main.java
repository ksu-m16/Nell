import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		
        int i = rnd.nextInt(12);
        
        Calendar gc = GregorianCalendar.getInstance();
        gc.set(GregorianCalendar.MONTH, i);
        System.out.println(i);
        System.out.println( GregorianCalendar.MONTH);
        


	}

}
