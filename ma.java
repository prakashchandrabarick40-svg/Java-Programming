class Student {
    private int rollno;
    private String name;

    public void setRollno(int r) {
        rollno = r;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class ma {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setRollno(64);
        obj1.setName("Prakash");

        System.out.println("roll no = " + obj1.getRollno());
        System.out.println("name = " + obj1.getName());
    }
}
