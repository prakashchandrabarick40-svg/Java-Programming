interface MPC {
    void bsscs();
}

class ABACUS implements MPC {
    public void bsscs() {
        System.out.println("we all are happy.....");
    }
}

class Main {
    public static void main(String[] args) {
        MPC obj1 = new ABACUS();
        obj1.bsscs();
    }
}
