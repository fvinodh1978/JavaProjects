package com.collections.java;

abstract class AbsractParent
{
	//absract method
	abstract void show();

	//concreate method
	
	void disp()
	{
		System.out.println("This is absract method");
	}
}

class AbsractChild extends AbsractParent
{
	void show()
	{
		System.out.println("This method acting like as parent child");
	}

	public static void main(String args[])
	{
			AbsractChild ac=new AbsractChild();
			ac.show();//here child class point of view show method;
			ac.disp();
		//AbsractParent ap=new AbsractParent();
		//AbsractChild ac =(AbsractChild)new AbsractParent();
		
		AbsractParent ap=new AbsractChild();
		ap.disp();
		ap.show();
	}
}