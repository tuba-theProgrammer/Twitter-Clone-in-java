import java.util.ArrayList;
public class backendWorking {

	public static ArrayList<UserDataClass> getUsersData()
	{  
		//Creating array for User data
				ArrayList<UserDataClass> userDataHolders = new ArrayList<UserDataClass>();
				binaryDataStore bn= new binaryDataStore();
				userDataHolders =bn.readUserDataFromFile();
				for(int i=0;i<userDataHolders.size();i++) {
					System.out.println(userDataHolders.get(i));
				}
				
		return userDataHolders;
	}
	
	public static ArrayList<UserDataClass> getUserFollowers(String username)
	{  
		//Creating array for User data
				ArrayList<UserDataClass> userDataHolders = new ArrayList<UserDataClass>();
				for(int i=0;i<userDataHolders.size();i++) {
				
				}
				
				binaryDataStore bn= new binaryDataStore();
				bn.readUserDataFromFile();
				
		return userDataHolders;
	}
	
	
	public static ArrayList<UserDataClass> getUserFollowings()
	{  
		//Creating array for User data
				ArrayList<UserDataClass> userDataHolders = new ArrayList<UserDataClass>();
				binaryDataStore bn= new binaryDataStore();
				bn.readUserDataFromFile();
				
		return userDataHolders;
	}
	
	
	
	
	
}
