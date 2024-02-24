package com.testing;

public interface DataFile {

	String projectPath = System.getProperty("user.dir");
	Xls_Reader 	d = new Xls_Reader(projectPath + "\\Project_Data\\Selenium_Jar\\testData.xlsx");
	
	public String URL = d.getCellData("URL", 1, 1);

	public String invalid= d.getCellData("SearchData", 1, 2);
	public String valid= d.getCellData("SearchData", 1, 3);
	public String invalidpass= d.getCellData("SearchData", 2, 2);
	public String validpass= d.getCellData("SearchData", 2, 3);
	
	
	
}