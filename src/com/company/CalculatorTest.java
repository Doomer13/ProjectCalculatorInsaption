package com.company;

public class CalculatorTest {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        double one;
        double two;
        int action;

        do {
            System.out.print("Введите первое число: ");
            String a = readClass.redNextString();
            System.out.print("Введите второе число: ");
            String b =  readClass.redNextString();
            try {
                one = Double.parseDouble(a);
                two = Double.parseDouble(b);
            }
            catch(NumberFormatException exception) {
                one = Convert.romanToDecimal(a);
                two = Convert.romanToDecimal(b);
                if(one==0||two==0){
                    System.out.print("Введите целые арабские или римские числа");
                    break;
                }
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
