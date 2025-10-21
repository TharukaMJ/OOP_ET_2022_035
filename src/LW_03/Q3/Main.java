package LW_03.Q3;

public class Main {
    public static void main(String[] args) {

        Bicycle b1 = new Bicycle("THARUKA", "0701412111");
        System.out.println(b1);

        Bicycle b2 = new Bicycle();
        b2.setOwnerDetails("CHANOD", "0719488899");
        System.out.println(b2);
    }
}