 class A
  {
    void m1() 
    {
        System.out.println("i hate u.....");
    }
}

public class B extends A {
    void m1() {
        System.out.println("i love u....");
    }

    void m2() 
    {
        super.m1();
    }

    public static void main(String[] args)
     {
        B obj1 = new B();
        obj1.m1();  
        obj1.m2();  
    }
}