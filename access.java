class demo
{
			
	int b=20;
			
	private
			int a=10;
			
	protected
			int d=40;
			
	demo()
	{
		System.out.println("a="+a+" ..a is private field is  access only in same class of same package.");	
		System.out.println("b="+b+" ..b is default field is  access only in all class of same package.");	
	}
	

}

class child extends demo
{
			
	child()
	{
		System.out.println("d="+d+" ..b is protected field is access in all child class of all package.");	
	}
}

class test
{
	public 
			int c=30;
	test()
	{
		System.out.println("c="+c+" ..c is public field is access in all class of all package.");	
	}
	public static void main(String args[])
	{
		child c =new child();
		test t=new test();
	}
}