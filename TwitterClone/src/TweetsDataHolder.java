import java.util.ArrayList;

public class TweetsDataHolder {
	private String username;
	private String Content;
	private ArrayList<String> hashTag;
	private String Createtime;
	private ArrayList<String> mentions;
	    public TweetsDataHolder(String username,String Content,String Createtime,ArrayList<String> hashTag,ArrayList<String> mentions) {
	    	this.setContent(Content);
	    	this.setCreatetime(Createtime);
	    	this.setHashTag(hashTag);
	    	this.setUsername(username);
	    	this.setMentions(mentions);
	    
	    }
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getContent() {
			return Content;
		}
		public void setContent(String content) {
			Content = content;
		}
		public ArrayList<String> getHashTag() {
			return hashTag;
		}
		public void setHashTag(ArrayList<String> hashTag) {
			this.hashTag = hashTag;
		}
		public String getCreatetime() {
			return Createtime;
		}
		public void setCreatetime(String createtime) {
			Createtime = createtime;
		}
		public ArrayList<String> getMentions() {
			return mentions;
		}
		public void setMentions(ArrayList<String> mentions) {
			this.mentions = mentions;
		}

}
