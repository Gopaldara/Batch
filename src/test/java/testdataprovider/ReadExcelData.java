package testdataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import constants.ApplicationConstants;
import utils.ExcelUtil;



public class ReadExcelData implements ApplicationConstants {

	@DataProvider(name="registerdata") 
	public String[][] registerdata() throws IOException{
		ExcelUtil.loadExcel(excelpath, excelsheet);
		
		int rows = ExcelUtil.getLastRow();
		int cells = ExcelUtil.getLastCell(0);
		
		String [][] data = new String [rows+1][cells]; 
		
		for (int r=0; r<=rows; r++) {
			for(int c=0;  c <cells; c++) 
			{
				data[r][c] =ExcelUtil.getCellData(r, c);
			}
		}
		ExcelUtil.closeExcel(); 
		return data;
	}
	
	

}
