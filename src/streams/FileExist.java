package streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExist {
	
	public static void main(String[] args) throws IOException {
		/*
	File file = new File("C:\\Users\\Jonas\\OneDrive - BHAK BHAS HLW Reutte\\Desktop\\test2.txt");
	if (file.exists()) {
		System.out.println("Die Datei existiert");
		file.delete();
	}else {
		System.out.println("Die Datei existiert nicht");
	}
*/
	File file2 = new File("C:\\Users\\Jonas\\OneDrive - BHAK BHAS HLW Reutte\\Desktop\\RaFolder");
	if (file2.exists()) {
		System.out.println("Die ordner existiert");
		
	}else {
		System.out.println("Die ordner existiert nicht");
		file2.mkdir();
	}	
	String ka="";
	File file3 = new File("C:\\Users\\Jonas\\OneDrive - BHAK BHAS HLW Reutte\\Desktop\\RaFolder\\");
		for(int i = 1; i<11; i++) {
			File file4 = new File(file3,"test"+i+".txt");
		
                if (file4.createNewFile()) {
                    System.out.println("Datei erstellt: " + file3.getName());
                } else {
                    System.out.println("Datei existiert bereits: " + file3.getName());
                }
                ka = ka + String.valueOf(i);
    			try (FileWriter writer = new FileWriter(file3)) {
    				writer.write(ka);
    			}
		}    
		
 
	}	
}
