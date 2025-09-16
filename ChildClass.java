package com.tns.inheritance;

class ParentClass {
    public void displayMessage() {
        System.out.println("Message from ParentClass");
    }
}

class ChildClass extends ParentClass {
    @Override
    public void displayMessage() {
        // Call the displayMessage() method of the immediate parent class
        super.displayMessage(); 
        System.out.println("Message from ChildClass");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.displayMessage();
    }
}