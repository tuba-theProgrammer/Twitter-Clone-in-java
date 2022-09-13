import java.util.ArrayList;
public class Main {
	static ArrayList<UserDataClass> UserDataHolder;
   public static void main(String args[]) {
	   UserDataHolder= backendWorking.getUsersData();
	   new WelcomeScreen();
   }
}
