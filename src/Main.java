public class Main {

  public static void definingALeapYear(int year) {
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

    if (Os == 0 && DeviceYear < 2015) {
      System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (Os == 0 && DeviceYear >= 2015) {
      System.out.println("Установите версию приложения для iOS по ссылке");
    }
    if (Os == 1 && DeviceYear < 2015) {
      System.out.println("Установите облегченную версию приложения для андроид по ссылке");
    } else if (Os == 1 && DeviceYear >= 2015) {
      System.out.println("Установите версию приложения для андроид по ссылке");
    }
  }

  public static void deliver(int distance) {

    int day = 0;
    if (distance >= 100) {
      System.out.println("доставки нет");
      return;
    }
    if (distance < 20) {
      day = 1;
      System.out.println("потребуется " + day + " дней доставки");
    }
    if (distance >= 20 && distance < 60) {
      day = 2;
      System.out.println("потребуется  " + day + " дня доставки");
    }
    if (distance >= 60 && distance < 100) {
      day = 3;
      System.out.println("потребуется  " + day + " дня доставки");
    }
  }


  public static void main(String[] args) {
    int year = 1988;
    definingALeapYear(year);

    int os = 0;
    int deviseYear = 2010;
    definingTheVersion(os, deviseYear);

    int distance = 150;
    deliver(distance);

  }

}






