package packages.Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;


public class dataDriven {
	
	
	//public static void main - where we run our methods !//////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws IOException {
		
	}
	
	
	

	//Method - "getData"//////////////////////////////////////////////////////////////////////////////////////////////////////////
	public ArrayList<String> getData(String testCaseName) throws IOException {

		ArrayList<String> a = new ArrayList<String>();
		
		
		// TODO Auto-generated method stubop
		FileInputStream fis = new FileInputStream("/Users/almaz/Documents/DataDrivenTest.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				//Identify TestCases Column by Scunning the entire 1st row
				Iterator<Row> rows = sheet.iterator();
			
				Row firstRow = rows.next();
				Iterator<Cell> cel = firstRow.cellIterator();
				
				int k=0;
				int column = 0;
				while(cel.hasNext()) {
					Cell value = cel.next();
					if(value.getStringCellValue().equalsIgnoreCase(testCaseName)){
						column=k;
					}
					k++;
				}
				System.out.println(column);
				
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv = r.cellIterator();
						//after you grab purchase testcase row = pull all the data of that row and feed into test
						while(cv.hasNext()) {
							Cell c = cv.next();
							if(c.getCellTypeEnum()==CellType.STRING) {
								a.add(c.getStringCellValue());
							}else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								
							}
						
						}
					}
				
				}
			}
			
			
			
		}
		return a;
	}


}
