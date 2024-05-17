import java.time.LocalDate;

public class Main {

  public static void definingLeapYear(int year) {
    int beginning = 1584;
    if (year < beginning) {
      System.out.println("тогда ещё не учитывались високосные года");
    } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("год " + year + " високосный");
    } else {
      System.out.println("год " + year + " не високосный");
    }
  }
  public static void definingTheVersion(int Os, int DeviceYear) {
    int currentYear = LocalDate.now().getYear();

    if (Os == 0 && DeviceYear < currentYear) {
      System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (Os == 0 && DeviceYear >= currentYear) {
      System.out.println("Установите версию приложения для iOS по ссылке");
    }
    if (Os == 1 && DeviceYear < currentYear) {
      System.out.println("Установите облегченную версию приложения для андроид по ссылке");
    } else if (Os == 1 && DeviceYear >= currentYear) {
      System.out.println("Установите версию приложения для андроид по ссылке");
    }
  }


  public static int deliver(int distance) {

    int day = 1;
    if (distance >= 100) {
      System.out.println("доставки нет");
    }
    if (distance < 20) {
      System.out.println("потребуется " + day + " дней доставки");
    }
    if (distance >= 20 && distance < 60) {
      day = day + 1;
      System.out.println("потребуется  " + day + " дня доставки");
    }
    if (distance >= 60 && distance < 100) {
      day = day + 2;
      System.out.println("потребуется  " + day + " дня доставки");
    }
    return day;
  }

  public static void definingTheVersion(int os1) {
    switch (os1) {
      case 0:
        System.out.print("установите приложение для ios,");
        break;
      case 1:
        System.out.print("установите приложение для аndroid,");
        break;
    }
  }

  public static void definitionTheYear(int deviseYear1) {
    int currentYear1 = LocalDate.now().getYear();
    if (deviseYear1 < currentYear1) {
      System.out.print(" облегчённую версию ОС по ссылке");
    } else {
      System.out.print(" обычную версию ОС по ссылке");
    }
  }

  public static void main(String[] args) {
    int year = 1988;
    definingLeapYear(year);

    int os = 1;
    int deviseYear = 2024;
    definingTheVersion(os, deviseYear);

    int distance = 90;
    deliver(distance);

    int os1 = 0;
    int deviseYear1 = 2019;
    definingTheVersion(os1);
    definitionTheYear(deviseYear1);
    System.out.println();
  }
}











