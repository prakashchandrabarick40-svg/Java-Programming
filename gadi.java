public abstract  class gadi
{
    abstract void start();
    void thar()
    {
        System.out.println("black color then");
    }

}
class bike extends gadi
{
    void start()
    {
        System.out.println("bike start with key");

    }
}
class cycle extends gadi
{
    void start()
    {
System.out.println("cycle start with key");
    }
 }   
 class Mainclass{
    public static void main(String[]args)
 {
gadi obj1=new bike();
obj1.thar();
obj1.start();
gadi obj2= new cycle();
obj2.thar();
obj2.start();
 }
}

