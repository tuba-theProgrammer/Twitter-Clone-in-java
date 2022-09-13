import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class binaryDataStore {
	public binaryDataStore() {
		
	}
	
	
	public void WriteUserData(String name,String Username,String gender,String pass,String EntryDate,int age,boolean Accountstatus,String photoAdd) {
		try {
		    // create a writer
		    FileOutputStream fos = new FileOutputStream(new File("./Resources/users.twc"));
            
		    name= name+",";
		    Username=Username+",";
		    gender=gender+",";
		    pass=pass+",";
		    EntryDate= EntryDate+",";
		    String ageVal=Integer.toString(age)+",";
		    String status= new Boolean(Accountstatus).toString()+",";
		    photoAdd=photoAdd+",";
		    
		    // write data to file
		    fos.write(name.getBytes());
		    fos.write(Username.getBytes());
		    fos.write(gender.getBytes());
		    fos.write(pass.getBytes());
		    fos.write(EntryDate.getBytes());
		    fos.write(ageVal.getBytes());
		    fos.write(status.getBytes());
		    fos.write(photoAdd.getBytes());

		    // close the writer
		    fos.close();
		
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
	}
	
	
	public String readUserDataFromFile() {
		
		try {
		    // create a reader
		    FileInputStream fis = new FileInputStream(new File("./Resources/users.twc"));
		    
		    // specify UTF_16 characer encoding
		    InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_16);

		    // read one byte at a time
		    int ch;
		    while ((ch = reader.read()) != -1) {
		        System.out.print((char) ch);
		    }
		    System.out.println((char)ch);
		    // close the reader
		    reader.close();

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		return null;
	}
}
