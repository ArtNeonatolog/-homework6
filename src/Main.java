public class Main {
    public static void main(String[] args) {
        part1task1();
        part1task2();
        part1task3();
        part1task4();
        part2task1();
        part2task2();
        part2task3();
        part3task1();
        part3task2();
    }




    private static void part3task2() {
        System.out.println("Задание 9");
        int salary = 29000;
        int totalSalary = 0;
        for (int i = 1; i <= 12; i ++){
            salary = salary + salary / 100;
        totalSalary = salary + totalSalary;
        System.out.println("Месяц " + i + ",сумма накоплений равна " + totalSalary + " рублей");
    }

    }

    private static void part3task1() {
        System.out.println("Задание 8");
        int salary = 29000;
        int totalSalary = 0;
        for(int i = 1; i <= 12; i++){
            totalSalary = salary + totalSalary;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + totalSalary + " рублей");
        }
    }

    private static void part2task3() {
        System.out.println("Задание 7");
        for (int i = 1; i >= 1 && i <= 512; i = i * 2) {
            System.out.println(i + "");
        }
    }

    private static void part2task2() {
        System.out.println("Задание 6");
        for(int i = 7; i >= 7 && i <= 98; i = i + 7) {
            System.out.println(i + " ");
        }
    }

    private static void part2task1() {
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }


    private static void part1task4() {
        System.out.println("Задание 4");
        for(int i = 10; i <=10 && i >= -10; i --){
            System.out.println(+ i);
        }
    }

    private static void part1task3() {
        System.out.println("Задание 3");
        for (int i = 2; i % 2 == 0 && i < 17; i ++){
            System.out.println(+ i ++);
        }
    }

    private static void part1task2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i --){
            System.out.println(+ i);
        }

    }

    private static void part1task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(+ i);
        }
    }
}


