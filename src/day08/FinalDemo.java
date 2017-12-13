package day08;

class Aa{
	final  int num;
	public Aa(){
		num = 10;
	}
	final void  show(final int x){
		System.out.println("show");
	}
}
public class FinalDemo extends Aa {
	final int num = 10;
	
	public void method(){
//		num = 20;
		final int x = 10;
//		x = 100;
	}
	public static void main(String[] args) {
		FinalDemo f = new FinalDemo();
		f.show(10);
		f.show(20);
	}
}
