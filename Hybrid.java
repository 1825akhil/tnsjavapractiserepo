package com.tns.inheritance;
class AA{
	String A = "This is variable of A";
	void a() {
		System.out.println("This is Classs A");
	}
	
	}
class BB extends AA{
	void b() {
		
		System.out.println("This is Classs B");
		
	}
}
class CC extends AA{
	void c() {
		
		System.out.println("This is Classs C");
		
	}
}
class DD extends CC{
	void d() {
		
		System.out.println("This is Classs D");
		
	}
}
public class Hybrid {


	public static void main(String[] args) {
		BB obj1 = new BB();
		DD obj2 = new DD();
		System.out.println(obj1.A);
		obj1.b();
		obj1.a();
		obj2.c();
		obj2.d();
		obj2.a();
	}

}
