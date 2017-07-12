package com.interview.directoryscan;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.interview.util.PropertyReader;

public class DirectoryScanForSupportedFiles {

		
		public static ArrayList<String> listFiles(String directoryName) throws IOException 
		{
	        File directory = new File(directoryName);
	        //get all the files from a directory
	        File[] fList = directory.listFiles();
	        String fileName=null; String fileMimeType=null; long fileSize; String fileExtension=null;
	        ArrayList<String> fileInfoList = new ArrayList<String>();
	        for (File file : fList) 
	        {    if (file.isFile())
	             {  //Excel(xlsx) and CSV are the supported files configured in the Properties file
	            	String supportedFiles=new PropertyReader().readProperty("supported_files");
	            	String fileType[]=supportedFiles.split(",");
	                if(file.getName().endsWith(fileType[0]) || file.getName().endsWith(fileType[1])) 
	                {
	                	fileName=file.getName();
	                	fileSize=file.length();
	                    String filepath=directoryName.concat("\\")+file.getName();
	                    Path source = Paths.get(filepath);
	                    //Get file MIME type
	                    fileMimeType=Files.probeContentType(source);
	                    if(fileName.endsWith(".xlsx"))
	                     fileExtension="xlsx";
	                    else if(fileName.endsWith(".csv"))
	                     fileExtension="csv";
	                    
	                    String fileInformation="FileName: "+fileName+"  "+"File_MIME_Type: "+fileMimeType+"  "+"File_Size_in_Bytes: "+fileSize+"  "+"File_Extension: "+fileExtension; 
	                    
	                    fileInfoList.add(fileInformation);
	                    
	                  
	            }
	          }
	        }
	        
	        if(fileInfoList.isEmpty())
			fileInfoList.add("No files found or File types are unsupported");
	        
	        return fileInfoList;
	    }

		
		
		
		
		

}
