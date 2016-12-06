import java.util.ArrayList;
public class Presidents {
	public static void main (String[] args){
		
		String[] names = {"Obama", "Trump", "Bush", "Clinton"};
		ArrayList <String> Long = new ArrayList<String> ();
		
			for(int i = names.length; i >= 0; i--){
				if(names.length > 4)
					Long.add(names[i]);
			
			Long.remove(2);
			
			System.out.println(Long);
					
			}
				
				
		
	}

}
