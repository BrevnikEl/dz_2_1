public class Main {
    public static void main(String[] args) {

        int balance = 200; //остаток на счету
        int incomingMoney = 1100; //столько положили
        if (incomingMoney >= 1000) {
            System.out.println(("Вам начислено " + (balance + incomingMoney) / 100 * 1) + " бонусов");
        } else {
            System.out.println("У вас на остатке " + (balance + incomingMoney));
        }
    }
}
