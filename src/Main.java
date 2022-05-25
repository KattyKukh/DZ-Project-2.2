public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialAmount = 100;
        int payment = 1001;
        int bonusRate = 100;
        int bonus;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (payment > 1000) {
            bonus = payment / bonusRate;
        } else {
            bonus = 0;
        }

        System.out.println("Бонус за платеж: " + bonus);
        System.out.println("Средств на счете клиента: " + (initialAmount + payment + bonus));
    }
}
