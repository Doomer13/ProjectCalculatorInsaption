package com.company;

public class CalculatorTest {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        double one;
        double two;
        int action;

        do {
            System.out.println("Арабские или Римские числа ?");
            String choose = readClass.redNextString ();
            if (choose.equals("Римские")) {
                System.out.print("Введите превое число: ");
                String a = readClass.redNextString();
                System.out.print("Введите второе число: ");
                String b = readClass.redNextString();
                one = Convert.romanToDecimal(a);
                two = Convert.romanToDecimal(b);
            }
            else {
                System.out.print("Введите первое число: ");
                one = readClass.readNextDouble();
                System.out.print("Введите второе число: ");
                two = readClass.readNextDouble();
            }
            Calculator calculator = new Calculator(one, two);

            System.out.println("Выберите действие:");
            System.out.println("1 Сложить");
            System.out.println("2 Вычесть");
            System.out.println("3 Умножить");
            System.out.println("4 Разделить");
            System.out.println("0 Выход");
            System.out.println("Введите номер пункта:");

            action = (int) readClass.readNextDouble();
            switch (action) {
                case 1:
                    System.out.println(calculator.add());
                    break;
                case 2:
                    System.out.println(calculator.subs());
                    break;
                case 3:
                    System.out.println(calculator.multi());
                    break;
                case 4:
                    System.out.println(calculator.div());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Выбор неверного пункта");
            }
        } while (action != 0);
    }
}
