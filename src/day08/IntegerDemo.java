package day08;

public class IntegerDemo {
	public static void main(String[] args) {
		int num = Integer.parseInt("123");
		System.out.println(num);
		boolean flag = Boolean.parseBoolean("true");
		System.out.println(Integer.toBinaryString(6)); //10 ---》2
		System.out.println(Integer.parseInt("110", 2)); //其他进制---->10
	
//		Integer in = new Integer(123);
//		int a = in.intValue();
//		a = a + 10;
//		System.out.println(a);
		
		Integer in = 123; //自动装箱
		int a = in + 10;  //自动拆箱
		System.out.println(a);
		
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		System.out.println(i == j);//false 比较的引用地址值
		
		Integer x = 128; // -128 ---127 内存开一个空间
		Integer y = 128;
		System.out.println(x == y);
		
	}
}
