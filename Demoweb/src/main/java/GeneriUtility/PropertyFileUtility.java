package GeneriUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 */
public class PropertyFileUtility extends WebdriverUtility{

	/**
	 * this method is used to give the data which is store in the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String propertyData(String key) throws IOException{
		FileInputStream fis=new FileInputStream(Iconstant.property_path);
		Properties p=new Properties();
		p.load(fis);
		return key;
	}

}
