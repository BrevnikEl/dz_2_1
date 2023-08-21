public class Main {
    public static void main(String[] args) {

        int balance = 200; //остаток на счету
        int incoming_money = 1100; //столько положили
        if (incoming_money >= 1000) {
            System.out.println(("Вам начислено " + (balance + incoming_money) / 100 * 1) + " бонусов");
        } else {
            System.out.println("У вас на остатке " + (balance + incoming_money));
        }
    }
}
