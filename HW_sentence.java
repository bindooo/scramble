
public class HW_sentence {
	
	public static String mix(String text){

		String txt=text;
		
		if(txt==null || txt.isEmpty()) return "0";
		
		String result="";
		String word="";
		
		txt = txt.replaceAll("[^a-zA-Z0-9 ]", "");
		String[] strs = txt.split("\\s+");
		
		int length;
		char s,e;

		for(int i=0;i<strs.length;i++) {
		
			if(strs[i].length()==1 || strs[i].length()==2 || strs[i].length()==3) {
				result = result + strs[i] + " ";
				continue;
			}

			length=strs[i].length();			

			s=strs[i].charAt(0);
			e=strs[i].charAt(length-1);
		
			word= s  + new StringBuilder(strs[i].substring(1,length-1)).reverse().toString()  + e;
		
			result = result + word + " ";
		
		}

		return result;

		}

		public static void main(String[] args) {
			String text=mix("An apple a day, keeps the doctor away!");
			if(text.equals("0")) System.out.println("Empty string!");
			else System.out.println(text);

		}

}
