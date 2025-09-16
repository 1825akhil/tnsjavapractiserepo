package com.tns.inheritance;

class A{
	String A = "Variable of Class A";
	void a(){
		System.out.println("This is Class A");
	}
	
}
class B extends A{
	void b() {
		System.out.println("This is Class B extends Class A");
	}
	
}
class C extends A{
	void c() {
		System.out.println("This is Class C extends Class A");
	}
	
}
class D extends A{
	void d() {
		System.out.println("This is Class D extends Class A");
	}
	
}
public class Herierachal {

	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
		D obj3 = new D();
		obj1.a();
		obj1.b();
		obj2.a();
		obj2.c();
		obj3.a();
		obj3.d();

	}

}
