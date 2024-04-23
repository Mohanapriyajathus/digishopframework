package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public static String getProperty(String key) {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("./src/main/resource/CommonData.propperties");
		}catch(FileNotFoundException e) {
					//TODO Auto=generated catch block
				e.printStackTrace();
			
		}
		//step 2: Create the object of Properties class
		Properties pObj=new Properties();
		
		//step 3: Load key the object of properties class
		
		try {
			pObj.load(fis);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//step4:get the property
		return pObj.getProperty(key);
		
		
		
	}

}
