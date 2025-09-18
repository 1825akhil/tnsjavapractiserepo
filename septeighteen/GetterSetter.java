package com.tns.septeighteen;

class sample{
 private int Age;
 private String Name;
 public int getAge() {
	 return Age;
 }
 public void setAge(int a) {
	 Age=a;
 }
 public String getName() {
	 return Name;
 }
 public void setName(String n) {
	 Name = n;
 }
}
public class GetterSetter {

	public static void main(String[] args) {
		sample obj = new sample();
		obj.setAge(21);
		obj.setName("Akhil");
		System.out.println(obj.getName()+" "+obj.getAge());
	}

}
