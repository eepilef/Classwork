
public class PresidentRunner {
	public static void main (String[] args){
		President pres = new President();
		
		pres.setName("Trump");
		pres.setAddress("White House");	
		pres.voteCount(2000);
		System.out.println(pres.runVote());
		
		
		
		
	}
}
