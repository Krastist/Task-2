public class Main {
    public static void main(String[] args) {

        int balance = 100; //Начальная сумма счета
        System.out.println("Начальная сумма счета: " + balance);
        int depositAmount = 1130; //Сумма пополнения
        System.out.println("Сумма пополнения: " + depositAmount);
        int bonusPrice= 100; //Цена одного бонуса
        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / bonusPrice;
        } else {
            bonus = 0;
        }
        System.out.println("Количество начисленных бонусов: " + bonus);
    }
}
