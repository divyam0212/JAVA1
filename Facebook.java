public class Facebook implements IFacebook{
	public void registerUser(String userName,String password,String email,long phone){
		System.out.println(userName+" Has Logged In");
	}
	public void signIn(String userName,String password){
		System.out.println(userName+" Has Signed In");
	}
	public void likePost(String userName,String password){
		System.out.println(userName+" Has Liked the Post");
	}
	public void commentPost(String userName,String password){
		System.out.println(userName+" Has Commented the Post");
	}
	public void sharePost(String userName,String password){
		System.out.println(userName+" Has Shared the Post");
	}
	public void viewTimeline(String userName,String password){
		System.out.println(userName+" Has Posted on Timeline");
	}
	public static void print(){
		System.out.println("FACEBOOK");
	}
}