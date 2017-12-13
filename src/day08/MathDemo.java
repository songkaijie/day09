package day08;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.ceil(-3.14));
		//double 返回大于等于参数的最小整数
		System.out.println(Math.floor(-3.14));
		//double 返回小于等于参数的最大整数
		
		System.out.println(Math.max(2, 3));
		System.out.println(Math.min(2, 3));
		System.out.println(Math.pow(2, 3)); //double
		System.out.println(Math.round(3.54));//四舍五入 int
	}
}
