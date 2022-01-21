package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Pawan
 *
 */
public class GetPropertyValues 

{
	/**
	 * 
	 * @param filePath
	 * @param key
	 * @return
	 */
   public static String getPropertyValue(String filePath, String key){
   Properties prop = new Properties();
   try{
	   prop.load(new FileInputStream(new File(filePath)));
   }
   catch(IOException e){
	   e.printStackTrace();
   }
   String value=prop.getProperty(key);
   return value;
   
}
}

