import java.util.HashMap;

public class IDandPasswords {

HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Soumya","1234abcd");
		logininfo.put("StarBucks","Burger");
		logininfo.put("Flipkart","SALE");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
	

}
