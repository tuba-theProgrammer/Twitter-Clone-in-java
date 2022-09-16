import java.util.ArrayList;
public class backendWorking {

	public static ArrayList<UserDataClass> getUsersData()
	{  
		//Creating array for User data
		binaryDataStore bn= new binaryDataStore();
				ArrayList<UserDataClass> userDataHolders = bn.readUserDataFromFile();
			
				
		return userDataHolders;
	}
	
	public static ArrayList<followingClass> getUserFollowing(String username)
	{  	binaryDataStore bn= new binaryDataStore();
		//Creating array for User data
				ArrayList<followingClass> following = bn.readFollowings(username);
					
		return following;
	}
	
	
	public static ArrayList<followerClass> getUserFollower(String username)
	{  
	 	binaryDataStore bn= new binaryDataStore();
			//Creating array for User data
	 	 ArrayList<followerClass> follower= bn.readFollowers(username);
						
			return follower;
	}
	
	
	
	
	
}
