//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int i = 27897;
        System.out.println("Значение переменной i с типом int равно " + i);
        byte b = 67;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 569;
        System.out.println("Значение переменной s с типом short равно " + s);
        long l = 987678965549L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 2.786f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 27.12;
        System.out.println("Значение переменной d с типом double равно " + d);

        System.out.println("Задание 2");

        float a = 27.12f;
        long c = 987678965549L;
        double e = 2.786;
        short r = 569;
        short g = -159;
        short k = 27897;
        byte q = 67;

        System.out.println("Задание 3");
        byte lp = 23;
        System.out.println("У Людмилы Павловны " + lp + " ученика");
        byte as = 27;
        System.out.println("У Анны Сергеевны " + as + " учеников");
        byte ea = 30;
        System.out.println("У Екатерины Андреевны " + ea + " учеников");
        short total = 480;
        System.out.println("Всего листов бумаги купили " + total);
        byte uch = (byte) (lp + as + ea);
        System.out.println("1. " + lp + "+" + as + "+" + ea + "=" + uch + " всего учеников");
        byte paper = (byte) (total / uch);
        System.out.println("2. " + total + "/" + uch + "=" + paper + " листов");
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

        System.out.println("Задание 4");

        byte performanceIn2Minutes = 16;
        byte performanceIn1Minutes = (byte) (performanceIn2Minutes / 2);
        System.out.println("Машина производит за минуту " + performanceIn1Minutes + " бутылок");
        byte min = 20;
        int productivity = performanceIn1Minutes * min;
        System.out.println("За " + min + " минут машина произвела " + productivity + " штук бутылок");
        byte hour = 60;
        byte day = 24;
        int productivityday = performanceIn1Minutes * hour * day;
        System.out.println("За сутки машина произвела " + productivityday + " штук бутылок");
        byte day3 = 3;
        int performanceIn3days = productivityday * day3;
        System.out.println("За 3 дня машина произвела " + performanceIn3days + "штук бутылок");
        byte month = 30;
        int productivityMonth = productivityday * month;
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");

        System.out.println("Задание 5");
        byte totalcans = 120;
        byte white2 = 2;
        byte brown4 = 4;
        int class1 = white2 + brown4;
        System.out.println("Всего банок на 1 класс потребуется " + class1 + " шт");
        int classes = totalcans / class1;
        System.out.println("Всего в школе " + classes + " классов");
        int white = classes * white2;
        System.out.println("Белой краски потребуется " + white + " шт");
        int brown = classes * brown4;
        System.out.println("Коричневой краски потребуется " + brown + " шт");
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        System.out.println(" Задача 6");

        int banana = 80 * 5;
        System.out.println("Вес бананов составляет " + banana + " гр.");
        int milk = 105 * 2;
        System.out.println("Вес молока составляет " + milk + " гр.");
        int iceCream = 100 * 2;
        System.out.println("Вес мороженного составляет " + iceCream + " гр.");
        int eggs = 70 * 4;
        System.out.println("Вес яиц составляет " + eggs + " гр.");
        int allIngredients = banana + milk + iceCream + eggs;
        System.out.println("Общий вес продуктов составляет " + allIngredients + " гр.");
        float kg = allIngredients / 1000f;
        System.out.println("Или же " + kg + " кг.");

        System.out.println("Задача 7");

        int gr = 7 * 1000;
        System.out.println("7 кг =" + gr + " граммов");
        int minGr = gr / 250;
        System.out.println("Похудеет спортсмен за " + minGr + " дней при потере 250гр.");
        int maxGr = gr / 500;
        System.out.println("Похудеет спортсмен за " + maxGr + " дней при потрере 500гр.");
        int averageValue = (minGr + maxGr) / 2;
        System.out.println("Может потребоваться " + averageValue + " день в среднем, чтобы добиться результата похудения");

        System.out.println("Задача 8");

        int salaryMasha = 67760;
        int yearSalaryMasha = salaryMasha * 12;
        System.out.println("Получит Маша за год без надбавок " + yearSalaryMasha + " рублей за год");
        int premiumMasha = salaryMasha / 100 * 10;
        System.out.println("10% от зарплаты Маши составляет " + premiumMasha);
        int salarySupplement = salaryMasha + premiumMasha;
        System.out.println("Зарплата Маши с надбавкой составляет " + salarySupplement);
        int yearSalarySupplement = salarySupplement * 12;
        System.out.println("Зарплата Маши с надбавкой за год составит " + yearSalarySupplement);
        int salaryDifference = yearSalarySupplement - yearSalaryMasha;
        System.out.println("Маша теперь получает " + salarySupplement + " рублей. Годовой доход вырос на " + salaryDifference + " рублей");

        int salaryDenis = 83690;
        int yearSalaryDenis = salaryDenis * 12;
        System.out.println("Получит Денис без надбавок " + yearSalaryDenis + " рублей за год");
        int premiumDenis = salaryDenis / 100 * 10;
        System.out.println("10% от зарплаты Дениса составляет " + premiumDenis);
        int salarySupplement1 = salaryDenis + premiumDenis;
        System.out.println("Зарплата Дениса с надбавкой составит " + salarySupplement1);
        int yearSalarySupplement1 = salarySupplement1 * 12;
        System.out.println("Зарплата Дениса с надбавкой за год составляет " + yearSalarySupplement1);
        int salaryDifference1 = yearSalarySupplement1 - yearSalaryDenis;
        System.out.println("Денис теперь получает " + salarySupplement1 + " рублей. Годовой доход вырос на " + salaryDifference1 + " рублей");

        int salaryKris = 76230;
        int yearSalaryKris = salaryKris * 12;
        System.out.println("Получит Кристина без надбавок " + yearSalaryKris + " рублей за год");
        int premiumKris = salaryKris / 100 * 10;
        System.out.println("10% от зарлаты Кристины составляет " + premiumKris);
        int salarySupplement2 = salaryKris + premiumKris;
        System.out.println("Зарплата Кристины с надбавкой составляет " + salarySupplement2);
        int salaryDifference2 = yearSalarySupplement1 + salarySupplement2;
        System.out.println("Кристина теперь получает " + salaryDifference2 + " рублей. Годовой доход вырос на " + salaryDifference2 + " рублей");
    }
}
