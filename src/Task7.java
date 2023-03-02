
/*
* Решил написать программу которая будет чуть сложнее работать.
* Суть которой в том, что мы передаем с какого года и месяца по какой год и месяц надо вывести пятницы,
* а программа выводит даты всех пятниц в этом диапозоне.
* Даты пятниц совпадают с реальным календарем за любой год.
* */

public class Task7 {
    private int yearsFrom;
    private int yearsTo;
    private int monthFrom;
    private int monthTo;
    private int days = 5; // так как 1 день 0 года была пятница
    private int dayOfWeek;

    public Task7(int yearsFrom, int yearsTo, int monthFrom, int monthTo) {
        this.yearsFrom = yearsFrom;
        this.yearsTo = yearsTo;
        this.monthFrom = monthFrom;
        this.monthTo = monthTo;
    }

    public boolean isCorrectInput() {
        return yearsFrom <= yearsTo && monthFrom <= monthTo && monthTo <= 12 && monthTo > 0;
    }

    public void task7() {
        System.out.println("Задача 7");
        if (isCorrectInput()) {
            numberDayOfWeekStart();
            do {
                dayOfMonthAll();
                for (int i = 1; i <= days; i++) {
                    if (dayOfWeek == 7) {
                        dayOfWeek = 0;
                    }
                    if (dayOfWeek == 5) {
                        System.out.println("Дата пятницы: " + i + "." + monthFrom + "." + yearsFrom + "г");
                    }
                    dayOfWeek++;
                }
                monthFrom++;
                if (monthFrom == 13) {
                    monthFrom = 1;
                    yearsFrom++;
                }
            } while (yearsFrom < yearsTo || monthFrom <= monthTo);
            System.out.println();
        } else {
            System.out.println("Ввели некорректное значение");
        }
    }

    public int numberDayOfWeekStart() {
        for (int i = 0; i <= yearsFrom; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                days += 366;
            } else {
                days += 365;
            }
        }
        dayOfWeek = days % 7;
        return dayOfWeek;
    }

    public int dayOfMonthAll() {
        switch (monthFrom) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if ((yearsFrom % 4 == 0 && yearsFrom % 100 != 0) || (yearsFrom % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 9:
            case 11:
            case 6:
                days = 30;
                break;
        }
        return days;
    }
}
