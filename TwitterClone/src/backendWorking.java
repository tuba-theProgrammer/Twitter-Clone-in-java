import java.util.ArrayList;
public class backendWorking {

	public static ArrayList<UserDataClass> getUsersData()
	{  
		//Creating array for User data
				ArrayList<UserDataClass> userDataHolders = new ArrayList<UserDataClass>();
				binaryDataStore bn= new binaryDataStore();
				bn.readUserDataFromFile();
				
		return userDataHolders;
	}
	
	
	
	
	
}
