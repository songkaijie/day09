package day08;

public class IntegerDemo {
	public static void main(String[] args) {
		int num = Integer.parseInt("123");
		System.out.println(num);
		boolean flag = Boolean.parseBoolean("true");
		System.out.println(Integer.toBinaryString(6)); //10 ---��2
		System.out.println(Integer.parseInt("110", 2)); //��������---->10
	
//		Integer in = new Integer(123);
//		int a = in.intValue();
//		a = a + 10;
//		System.out.println(a);
		
		Integer in = 123; //�Զ�װ��
		int a = in + 10;  //�Զ�����
		System.out.println(a);
		
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		System.out.println(i == j);//false �Ƚϵ����õ�ֵַ
		
		Integer x = 128; // -128 ---127 �ڴ濪һ���ռ�
		Integer y = 128;
		System.out.println(x == y);
		
	}
}
