class Parent1{
    void msg()
    {
        System.out.println("I am Parent Class' method");
    }
    void override()
    {
        System.out.println("I contain False COde");

    }
}
class Child1 extends Parent1{
    void override()
    {
        System.out.println("I contain Real Code and Logic and I am the method of Child Class");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Parent1 obj = new Child1(); //upcasting
        obj.msg(); //it will call the method of parent class
        obj.override(); //it will call the method of child class but the control will be in Parent class
    }
}
