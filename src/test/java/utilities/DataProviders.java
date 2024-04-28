package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="RegistrationTest")
	public String [][] getData() throws IOException
	{
		String path=".\\testData\\NopEcommerceApplicationTestCases.xlsx";//taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("TestData");	
		int totalcols=xlutil.getCellCount("TestData",1);
				
		String regestration[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				regestration[i-1][j]= xlutil.getCellData("TestData",i, j);  //1,0
			}
		}
	return regestration;//returning two dimension array
				
	}
	
	
}
