class RBI {
    void interestrate() {
        System.out.println("Bank provides interest");
    }
}

class SBI extends RBI {
    @Override
    void interestrate() {
        System.out.println("SBI interest rate = 6.5%");
    }
}

class ICICI extends RBI {
    @Override
    void interestrate() {
        System.out.println("ICICI interest rate = 7.5%");
    }
}

class HDFC extends RBI {
    @Override
    void interestrate() {
        System.out.println("HDFC interest rate = 7.0%");
    }
}

public class BANK {
    public static void main(String[] args) {

        RBI obj1 = new SBI();
        obj1.interestrate();

        RBI obj2 = new ICICI();
        obj2.interestrate();

        RBI obj3 = new HDFC();
        obj3.interestrate();
    }
}
