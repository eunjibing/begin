package codinglife.c18Method;

public class MethodDemo05 {

	public static String numbering(int init, int limit) {
		int i=init;
		
		String output = "";
		
		while(i<limit) {
			output += i;
			i++;
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		String result  = numbering(1,10);
		
		System.out.println(result);
	}
}
