import java.util.Random;

public class President {
	
	Random rand = new Random();
	
	private String name = "Obama";
	private String address = "123 Jalan";
	
	public President(){
	}
	
	public void setName(String name){
	}
	
	public void setAddress(String address){
	}
	
	public int voteCount(int i){
		return voteCount();
		}
	
	public String runVote(){
		if(voteCount() > 1750)
			System.out.println(name + " won!");
		else
			System.out.println(name + " lost.");
		return runVote();
	}
	
	public String setNow(){
		
	}
	

	
			
	}
