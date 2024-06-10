class Parent{
    int a=10,b=20;
    void add()
    {
        System.out.println("Adding two Numbers in Parent Class");
        System.out.println(a+b);
    }
}
class Child extends Parent{
    void mul()
    {
        System.out.println("Multiplying two numbers in Child Class");
        System.out.println(a*b);
    }
}
public class Day02 {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.add();
        obj.mul();
    }
}

