package assignment;

interface Valid {
	boolean Login(Valid_cred vs);
}

class Valid_cred {
	public boolean validPerson(String name, String pass) {
		if(name.equals("rahul") && pass.equals("rh123")) {
			return true;
		}
		else
			return false;
	}
}

public class Problem2 {

	public static void main(String[] args) {
		
		// by assuming valid user_name = rahul and password = rh123 
		
		Valid vl = (Valid_cred vs)-> vs.validPerson("rahul", "rh123");
		Valid_cred vc = new Valid_cred();
		System.out.println("valid user : "+vl.Login(vc));
	}

}
