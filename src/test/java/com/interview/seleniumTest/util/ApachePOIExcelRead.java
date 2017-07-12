package com.interview.seleniumTest.util;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class ApachePOIExcelRead {



    public static Object[][] getData(String FILE_NAME) {

        try {
        	 int rows=0; int index=0;
        	
        	Hashtable<String, String> table=null;
        	Hashtable<String, String> table2=null;
        	
        	table2=new Hashtable<String,String>();
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();
            Iterator<Row> iterator1 = datatypeSheet.iterator();
         
           
    	
    	 
            while (iterator1.hasNext()) 
            {
           	 iterator1.next();
             rows++;
            }
            Object testData[][]=new Object[rows][1];
            
       
            
            while (iterator.hasNext()) 
            {
              Row currentRow=iterator.next();
              Iterator<Cell> cellIterator = currentRow.iterator();
               while (cellIterator.hasNext()) 
               {
            	   Cell currentCell = cellIterator.next();
                   if (currentCell.getCellTypeEnum() == CellType.STRING) 
                   {     table=new Hashtable<String,String>();
                        System.out.print(currentCell.getStringCellValue() + "--");
                        table.put("Reg_no", currentCell.getStringCellValue());
                        
                        currentCell = cellIterator.next();
                        table.put("Make", currentCell.getStringCellValue());
                        
                        currentCell = cellIterator.next();
                        table.put("Colour", currentCell.getStringCellValue());
                        
                        
                        testData[index][0]=table;
            			index++;
                      
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "--");
                    }

                }
             
            }
      
            ;
       return testData;
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return null;

    }
}