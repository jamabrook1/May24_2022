package interview;



public class IsVowel {
	public static boolean isVowel(char ch) {
	 return ch == 'a' ||ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o' ||
				ch == 'A' ||ch == 'E' || ch == 'U' || ch == 'I' || ch == 'O' ;
		
			
	}
	
	
	
				
	public static void main(String [] args) {
			String str="Java";
			int count=0;			
			
			for(int i=0; i<str.length(); i++) {
				if(isVowel(str.charAt(i))) {
					count++;
				}
			}		System.out.println(count);
	}}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		
		
	
	