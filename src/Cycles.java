public class Cycles {
    private int percent;
    private int sumFinal;
    private int sumStart;
    private float temp;
    private int month;
    private int years;

    public void task1() {
        // В задаче не сказано откладываем под процент или нет, поэтому если без процентов надо, подставьте в percent 0
        System.out.println("Задача 1");
        sumStart = 0;
        sumFinal = 2_459_000;
        percent = 8;
        month = 0;
        int monthDeferMoney = 15_000;
        temp = (percent / 12f + 100f) / 100f; // расчитываем коэффицент для данного процента
        while (sumStart < sumFinal) {
            sumStart = (int) ((sumStart + monthDeferMoney) * temp);
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + sumStart + " рублей\n");
    }

    public void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public void task3() {
        System.out.println("Задача 3");
        int bornPeople = 17;
        int deathPeople = 8;
        int peopleAll = 12_000_000;
        years = 10;
        for (int i = 1; i <= years; i++) {
            float temp = (bornPeople - deathPeople) * peopleAll / 1000f;
            peopleAll += (int) temp;
            System.out.println("Год " + i + ", численность населения составляет " + peopleAll);
        }
        System.out.println();
    }

    public void task4() {
        System.out.println("Задача 4");
        sumStart = 15_000;
        sumFinal = 12_000_000;
        percent = 7;
        month = 0;
        temp = (1f + percent / 100f);
        while (sumStart < sumFinal) {
            sumStart *= temp;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sumStart + " рублей");
        }
        System.out.println();
    }

    public void task5() {
        System.out.println("Задача 5");
        sumStart = 15_000;
        sumFinal = 12_000_000;
        percent = 7;
        month = 0;
        temp = (1f + percent / 100f);
        while (sumStart < sumFinal) {
            sumStart *= temp;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sumStart + " рублей");
            }
        }
        System.out.println();
    }

    public void task6() {
        System.out.println("Задача 6");
        sumStart = 15_000;
        percent = 7;
        years = 9;
        month = 0;
        temp = (1f + percent / 100f);
       for(int i = 0; i <= years * 12; i++) {
            sumStart *= temp;
            month++;
            if (month % 6 == 0) {
                System.out.println("Сумма накоплений " + sumStart + " рублей за " + month + " месяцев");
            }
        }
        System.out.println();
    }

    public void task8() {
        System.out.println("Задача 8");
        int yearFrom = 1823;
        int yearTo = 2123;
        for (int i = 0; i <= yearTo; i += 79) {
            if (i > yearFrom) {
                System.out.println("Год пролета кометы: " + i);
            }
        }
        System.out.println();
    }
}
