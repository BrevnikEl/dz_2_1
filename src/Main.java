public class Main {
    public static void main(String[] args) {

        int o = 200; //остаток на счету
        int i = 1100; //столько положили
        if (i>=1000) {
            System.out.println(("Вам начислено " + (o+i)/100 * 1) + " бонусов");
        } else {
            System.out.println("У вас на остатке " + (o+i));
        }
    }
}
