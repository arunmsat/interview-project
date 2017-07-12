package com.interview.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

//import com.interview.directoryscan.Directory;
import com.interview.directoryscan.DirectoryScanForSupportedFiles;
import com.interview.seleniumTest.util.ApachePOIExcelRead;
import com.interview.seleniumTest.util.PropertyReader;
import java.util.Map.Entry;

public class Test_Directory 
{
	
	public static void main(String[] args) throws IOException 
	{
	
		Object[][] hashObj ;
		Hashtable<String, String> table2=new Hashtable<String,String>();
	
		ArrayList<String> filename=new ArrayList<String> ();
		
		String directoryPath= new PropertyReader().readProperty("directory_to_scan");

		ArrayList<String> fileInformation=DirectoryScanForSupportedFiles.listFiles(directoryPath);
		//ArrayList<String> fileInformation=Directory.listFiles("C:\\Users\\ARSA\\Downloads");
		
		System.out.println("Displaying supported files of type csv and xlsx in directory: "+directoryPath+"\n");
		for(int i=0;i<fileInformation.size();i++)
		System.out.println(fileInformation.get(i));	
		
		   
	    }
	}


