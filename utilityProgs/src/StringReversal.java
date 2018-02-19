

public class StringReversal {
	
	
	
	
 private static String aaaa(String text){
	 String[] NewText= text.split(" ");
	 String temp=null;
	 for(int i=NewText.length-1;i>=0;i--){
		 
		 temp+= NewText[i] + " ";
	 }
	 
	return temp;
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "0123456789 abcd mnbvc qwertyui nkiopl";
		char[] aa = a.toCharArray();
		String b = null;
		String c;
		for (int i = aa.length - 1; i >= 0; i--) {
			b += aa[i];
		}
		//System.out.println("basic string reversal" + b);

		System.out.println(aaaa(a));
	
	}

}
