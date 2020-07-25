package com.constructor;
class b{
	int i =10;
	boolean b = false;
	b()
	{
		System.out.println("from b()");//from b()
		System.out.println(i);//10
		System.out.println(b);//false
		System.out.println(this);//b@100
		System.out.println(this.i);//10
		System.out.println(this.b);//false
	}
	b(int x,boolean y)
	{
		System.out.println("from b(int)");//from b(int)
		System.out.println(i);//10
		System.out.println(b);//false
		System.out.println(this.b);//false
		this.i = x;
		this.b = y;
		System.out.println(this.i);//123
		System.out.println(this.b);//false

	}
	public static void main(String[] args) {
		{
			b ob1 = new b();
			System.out.println(ob1.i);//10
			System.out.println(ob1.b);//false
			System.out.println(ob1);//b@100
			
			b ob2 = new b(123,false);
			System.out.println(ob2.i);//123
			System.out.println(ob2.b);//false
			System.out.println(ob2);//b@200
		}
	}

}
