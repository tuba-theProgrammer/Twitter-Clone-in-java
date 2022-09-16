
public class followerClass {
	private String name;
	private boolean status;
	   public followerClass(String name,boolean status) {
		   this.setName(name);
		   this.setStatus(status);
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
