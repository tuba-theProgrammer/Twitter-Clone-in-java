import java.util.ArrayList;

public class UserDataClass {
	private String name;
	private String Username;
	private String gender;
	private String pass;
	private String EntryDate;
	private int age;
	private boolean Accountstatus;
	private String photoAdd;
	private ArrayList<followingClass> followings;
	private ArrayList<followerClass> follwers;
	public UserDataClass(String name,String Username,String gender,String pass,String EntryDate,int age,boolean Accountstatus,String photoAdd,ArrayList<followingClass> followings,ArrayList<followerClass> follwers) {
		 this.setAccountstatus(Accountstatus);
		 this.setAge(age);
		 this.setEntryData(EntryDate);
		 this.setGender(gender);
	
		this.setPass(pass);
		this.setPhotoAdd(photoAdd);
		this.setUsername(Username);
	    
		 this.setFollwers(follwers);
		 this.setFollowings(followings);
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEntryData() {
		return EntryDate;
	}
	public void setEntryData(String entryData) {
		EntryDate = entryData;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAccountstatus() {
		return Accountstatus;
	}
	public void setAccountstatus(boolean accountstatus) {
		Accountstatus = accountstatus;
	}
	public String getPhotoAdd() {
		return photoAdd;
	}
	public void setPhotoAdd(String photoAdd) {
		this.photoAdd = photoAdd;
	}
	public ArrayList<followingClass>  getFollowings() {
		return followings;
	}
	public void setFollowings(ArrayList<followingClass> followings) {
		this.followings = followings;
	}
	public ArrayList<followerClass> getFollwers() {
		return follwers;
	}
	public void setFollwers(ArrayList<followerClass> follwers) {
		this.follwers = follwers;
	}

}
