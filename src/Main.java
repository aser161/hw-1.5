public class Main {
    public static void main(String[] args) {
// Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear <= 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 400 ==0) {
            System.out.println( year+ " год является високосным");
        }  else if (year % 4 ==0 && year % 100 !=0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int time = 1;
        int time1 = 2;
        int time2 = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + time);
        }
        if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется дней: " + time1);
        }
        if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + time2);
        }


        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}