package book.javajs.chap04;

public class TestEx08 {

	//2x+y=10 의 모든 해
	
	public static void main(String[] args) {
		
		for(int x=0;x<=10;x++){
			for(int y=0;y<=10;y++) {
				if((2*x)+(4*y)==10) {
					System.out.println("x="+x+", y="+y);
				}
			}
		}
	}
}
