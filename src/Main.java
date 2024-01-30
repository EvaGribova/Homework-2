public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int startBalance = 200;
        int refill = 1500;
        int finalBalance;

        int percent;
        if (refill > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = refill / 100 * percent;

        System.out.println("Итоговый счет= " + (startBalance + refill + bonus));
        System.out.println("Бонусные рубли= " + (bonus));

    }
}