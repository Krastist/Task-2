public class Main {
    public static void main(String[] args) {

        int x = 100; //Начальная сумма счета
        System.out.println("Начальная сумма счета: " + x);
        int y = 1130; //Сумма пополнения
        System.out.println("Сумма пополнения: " + y);
        int z = 100; //Цена одного бонуса
        int bonus;
        if (y >= 1000) {
            bonus = y / z;
        } else {
            bonus = 0;
        }
        System.out.println("Количество начисленных бонусов: " + bonus);
    }
}
