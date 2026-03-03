package testutils;

import java.io.FileInputStream;
import java.io.IOException;

public class Properties {

	public static String getProperties(String keyForTheProperty)
	{

		try {
			java.util.Properties propertyObject = new java.util.Properties();
			FileInputStream fileInputStreamofProperty = new FileInputStream(System.getProperty("user.dir") +
					"/src/test/resources/settings.properties");
			propertyObject.load(fileInputStreamofProperty);

            return propertyObject.getProperty(keyForTheProperty);

		} catch (IOException e) {
			//
		}
		return null;

	}

}

