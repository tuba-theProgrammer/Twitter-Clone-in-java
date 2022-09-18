import java.util.ArrayList;
public class backendWorking {

	public static ArrayList<UserDataClass> getUsersData()
	{  
		//Creating array for User data
		binaryDataStore bn= new binaryDataStore();
				ArrayList<UserDataClass> userDataHolders = bn.readUserDataFromFile();
			    
			
				
		return userDataHolders;
	}
	
	
	
	
}
