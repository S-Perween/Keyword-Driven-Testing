package keywordtesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import keyword.keywordpageclass;
import utility.readexceldata;

public class testcase1 {

	@Test
	public static void framework() throws EncryptedDocumentException, IOException, InterruptedException {

		keywordpageclass obj = new keywordpageclass("https://register.rediff.com/register/register.php?FormName=user_details");
		String Path = "./keyword.xlsx";
		readexceldata.readexcel(Path, "Sheet1");

		for (int i = 1; i <= 13; i++) {

			String keys = readexceldata.getData(i, 1);
			System.out.println(keys);

			if (keys.equalsIgnoreCase("openbrowser")) {

				obj.openbrowser();

			}

			else if (keys.equalsIgnoreCase("navigate")) {

				obj.navigate();
			}

			else if (keys.equalsIgnoreCase("searchfullname")) {
				obj.searchfullname();
			}

			else if (keys.equalsIgnoreCase("searchrediffid")) {
				obj.searchrediffid();

			} else if (keys.equalsIgnoreCase("enterpassword")) {
				obj.enterpassword();
			}

			else if (keys.equalsIgnoreCase("retypepassword")) {
				obj.retypepassword();
			}

			else if (keys.equalsIgnoreCase("enteremail")) {
				obj.enteremail();
			}

			else if (keys.equalsIgnoreCase("entermobileno")) {
				obj.entermobileno();
			}

			else if (keys.equalsIgnoreCase("enterdob")) {
				obj.enterdob();
			}

			else if (keys.equalsIgnoreCase("entergender")) {
				obj.entergender();
			}

			else if (keys.equalsIgnoreCase("entercountry")) {
				obj.entercountry();
			}

			else if (keys.equalsIgnoreCase("clickcreatemyaccount")) {
				obj.clickcreatemyaccount();
			}

			else if (keys.equalsIgnoreCase("closebrowser")) {
				obj.closebrowser();
			}
		}

		System.out.println("executed successfully");
	}
}
