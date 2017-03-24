package com.panda;

public class FinalVariableTest {

	final int a = 4;
	final String str;
	final int c;
	final static double d;	
	final char ch;
	
	{// 初始化块
		str = "Hello";
		 // a = 9; 不合法，因为之前定义时候已经指定了值
		c = 6;
	}
	
	static
	{
		d = 7.00;
	}
	
	public FinalVariableTest()
	{
		ch ='陈';
	}
	
	public void  changeFinalValue()
	{
		// c = 100; 不能修改final的值
	}
	
	public static void main(String[] args)
	{
		FinalVariableTest ft = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(FinalVariableTest.d);
	}
}
