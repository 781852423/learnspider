package com.panda;

class Base
{
	public Base()
	{
		test();
	}
	
	public void test()
	{
		System.out.println("将被子类重写的方法");
	}
}

public class Sub extends Base{

	private String name;
	public void test()
	{
		System.out.println("子类重写父类的方法" + "其name字符串长度=" + name.length());
	}
	
	public static void main(String[] args)
	{
		 // Sub a = new Sub(); // 将会引起空指针异常
//		String boolStr = String.valueOf(true);
//		String dbStr = String.valueOf(7.99);
//		String ftStr = String.valueOf(7.55f);
//		System.out.println(boolStr);
//		System.out.println(dbStr);
//		System.out.println(ftStr);
		
/*		Integer a = new Integer(6);
		System.out.println("6的包装类实例大于5吗？" + (a > 5.0));*/
		
//		System.out.println("比较两个包装类的实例是否相等：" + (new Integer(2) == new Integer(2)));
		
		String s1 = "疯狂JAVA";
		String s2 = "疯狂";
		String s3 = "JAVA";
		
		String s4 = "疯狂" + "JAVA";
		String s5 = "疯" + "狂" + "JAVA";
		
		String s6 = s2 + s3;
		String s7 = new String("疯狂JAVA");
		System.out.println(s1 == s4);
		System.out.println(s6 == s7);
		
	}
}
