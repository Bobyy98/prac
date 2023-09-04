class Parent36 {
    int parentField = 10;

    void parentMethod() {
        System.out.println("This is a method from the parent class.");
    }
}

class Child36 extends Parent36 {
    int childField = 20;

    void childMethod() {
        System.out.println("This is a method from the child class.");
    }

    void accessParentField() {
        // Using 'super' to access the parent class field
        System.out.println("Value of parentField in the parent class: " + super.parentField);
    }
}

public class SuperDemo36 {
    public static void main(String[] args) {
        Child36 childObj = new Child36();

        // Accessing fields and methods of the child class
        System.out.println("Value of childField in the child class: " + childObj.childField);
        childObj.childMethod();

        // Accessing fields and methods of the parent class using 'super'
        System.out.println("Value of parentField in the child class: " + childObj.parentField);
        childObj.parentMethod();

        // Accessing the parent class field using 'super'
        childObj.accessParentField();
    }
}
