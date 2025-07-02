package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *  This class consist of generic methods related to selenium
 *  Nandhini V
 */
public class JavaUtility {
	

	/**
	 * This method will capture the current System date and return to caller
	 * 
	 * @return
	 */
	public String getSystemDate()// ScreenShot name,report name
	{
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		String date = s.format(d);
		return date;

	}
}
