package com.store.helper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.store.entity.Product;

public class CSVHelper 
{
	public static String TYPE = "text/csv";
	static String[] HEADERs = {"pid","pname","pimage","pdesc","pprice","pstock"};
	
	public static boolean hasCVFormat(MultipartFile file) {
		if(!TYPE.equals(file.getContentType())) {
			return false;
		}
		return true;
	}
	
	public static List<Product> csvToProduct(InputStream is){
		
		try(BufferedReader fileReader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
				
				CSVParser csvparser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim();)
				
				)
		
		
		
		return null;
		
	}
}
