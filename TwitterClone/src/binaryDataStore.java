import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class binaryDataStore {
	public binaryDataStore() {
		
	}
	
	
	public void WriteUserData(String name,String Username,String gender,String pass,String EntryDate,int age,boolean Accountstatus,String photoAdd) {
		try {
		    // create a writer
		    FileOutputStream fos = new FileOutputStream(new File("./Resources/users.twc"),true);
	
	        DataOutputStream dout=new DataOutputStream(fos);
		    name= name+",";
		    Username=Username+",";
		    gender=gender+",";
		    pass=pass+",";
		    EntryDate= EntryDate+",";
		    String ageVal=Integer.toString(age)+",";
		    String status= new Boolean(Accountstatus).toString()+",";
		    photoAdd=photoAdd+",";
		    
		    // write data to file
		    dout.write(name.getBytes());
		    dout.write(Username.getBytes());
		    dout.write(gender.getBytes());
		    dout.write(pass.getBytes());
		    dout.write(EntryDate.getBytes());
		    dout.write(ageVal.getBytes());
		    dout.write(status.getBytes());
		    dout.write(photoAdd.getBytes());
		    dout.write("\n".getBytes());
		    File f1 = new File("./Resources/"+Username);  
		      //Creating a folder using mkdir() method  
		      boolean bool = f1.mkdir();  
		      if(bool){  
		         System.out.println("Folder is created successfully");  
		         File file1 = new File(f1+"/followers.twc");
		         File file2 = new File(f1+"/tweets.twc");
		         File file3 = new File(f1+"/followings.twc");
		         if (file1.createNewFile()&&file2.createNewFile()&&file3.createNewFile()) {
		           System.out.println("File created: " + file1.getName());
		           System.out.println("File created: " + file2.getName());
		           System.out.println("File created: " + file3.getName());
		         } else {
		           System.out.println("File already exists.");
		         }
		      }else{  
		         System.out.println("Error Found!");  
		      }  
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
		    InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.US_ASCII);

		    // read one byte at a time
		    int ch;
		    while ((ch = reader.read()) != -1) {
		        System.out.print((char) ch);
		    }

		    // close the reader
		    reader.close();
		    System.out.println((char)ch);

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<TweetsDataHolder> getTweetsData(String username){
	    ArrayList<TweetsDataHolder> getAllTweets = new ArrayList<TweetsDataHolder>();
		try {
		    
		    BufferedReader bufReader = new BufferedReader(new FileReader("./Resources/"+username+"/tweets.twc"));
		    String line = bufReader.readLine();
		    
		
		    
		    while (line != null) { 
		    	   String[] res = line.split("[,]", 0);
		    	   ArrayList<String> hashList = new ArrayList<String>();
		    	   ArrayList<String> mentions = new ArrayList<String>();
		    	  
		    	   for(int i=3;i<res.length;i++) {
		    		   if(res[i].charAt(0)=='#') {
		    			   hashList.add(res[i]); 
		    		   }else  if(res[i].charAt(0)=='@'){
		    			   mentions.add(res[i]);
		    		   }
		            	 
		              }
		         
		              getAllTweets.add(new TweetsDataHolder(res[0],res[1],res[2],hashList,mentions));
		          
		    	line = bufReader.readLine();
		    	
		    	} 
		    
		    
		    bufReader.close();

		 

		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		
		
		
		return getAllTweets;
	}
	
	
	public void createTweets(String username,String content,String Time, ArrayList<String> hashList) {
		
		try {
		    // create a writer
		    FileOutputStream fos = new FileOutputStream(new File("./Resources/"+username+"/tweets.twc"),true);
	
	        DataOutputStream dout=new DataOutputStream(fos);
		    username= username+",";
		    content=content+",";
		    Time=Time+",";
		   
		    
		    // write data to file
		    dout.write(username.getBytes());
		    dout.write(content.getBytes());
		    dout.write(Time.getBytes());
		    
		    for(int i=0;i<hashList.size();i++) {
		    	String val= hashList.get(i)+",";
		    	  dout.write(val.getBytes());
		    }
		    
		    dout.write("\n".getBytes());
		    
		    
		  
		    // close the writer
		    fos.close();
		
		} catch (IOException ex) {
		    ex.printStackTrace();
		}

		
	}
	
	
	
	
	
}
