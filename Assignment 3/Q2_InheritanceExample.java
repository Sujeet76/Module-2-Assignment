class ParentClass {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class ChildClass extends ParentClass {
    @Override
    public void display() {
        System.out.println("This is the child class.");
    }
}

public class Q2_InheritanceExample {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        parent.display(); // Calls the display() method of the parent class
        child.display(); // Calls the display() method of the child class
    }
}
