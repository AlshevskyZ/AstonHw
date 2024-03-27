import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true)
        {
            System.out.print("Введите номер задания(1-14) или stop для выхода:");
            Scanner scan = new Scanner(System.in);
            var taskId = scan.nextLine();
            if(taskId.equals("stop"))
                {
                    break;
                }
            else
                switch (taskId)
                {
                    case "1":
                        printThreeWords();
                        break;
                    case "2":
                        checkSumSign();
                        break;
                    case "3":
                        printColor();
                        break;
                    case "4":
                        compareNumbers();
                        break;
                    case "5":
                        int a = 5;
                        int b = 7;
                        System.out.println(checkSumRange(a, b));
                        break;
                    case "6":
                        checkNumberSign(5); // "Число положительное"
                        checkNumberSign(-2); // "Число отрицательное"
                        checkNumberSign(0); // "Число положительное"
                        break;
                    case "7":
                        int number = -5;
                        System.out.println(isNegativeNumber(number)); // true
                        break;
                    case "8":
                        repeatString("Привет!", 5);
                        break;
                    case "9":
                        int year = 2024;
                        System.out.println(isLeapYear(year)); // true
                        break;
                    case "10":
                        int[] arrayTask10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
                        for (int i = 0; i < arrayTask10.length; i++) {
                            if (arrayTask10[i] == 0) {
                                arrayTask10[i] = 1;
                            } else
                                arrayTask10[i] = 0;
                        }
                        for (int element : arrayTask10) {
                            System.out.print(element+ " ");
                        }
                        System.out.print("\n");
                        break;
                    case "11":
                        int[] arrayTask11;
                        arrayTask11 = new int[100];
                        for (int i = 0; i < arrayTask11.length; i++) {
                            arrayTask11[i] = i + 1;
                        }
                        break;
                    case "12":
                        int[] arrayTask12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                        for (int i = 0; i < arrayTask12.length; i++) {
                            arrayTask12[i] = arrayTask12[i] < 6 ? arrayTask12[i] * 2 : arrayTask12[i];
                        }
                        for (int element : arrayTask12) {
                            System.out.print(element+ " ");
                        }
                        System.out.print("\n");
                        break;
                    case "13":
                        int size = 5;
                        int[][] arrayTask13 = new int[size][size];
                        for (int i = 0; i < size; i++) {//проходим по главной диагонали сверху вниз
                            for (int j = 0; j < size; j++) {
                                if (i == j) {
                                    arrayTask13[i][j] = 1;
                                }
                            }
                        }
                        for (int i = size-1; i >=0; i--) {//проходим по побочной диагонали снизу вверх
                            for (int j = 0; j < size; j++) {
                                if (i + j==size-1) {
                                    arrayTask13[i][j] = 1;
                                }
                            }
                        }
                        for (int i = 0; i < size; i++) {
                            for (int j = 0; j < size; j++) {
                                System.out.print(arrayTask13[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case "14":
                        for (int element : createArray(10, 5)) {
                            System.out.print(element+ " ");
                        }
                        System.out.print("\n");
                        break;
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
            }
        }
    }
    private static void printThreeWords() {
        String[] fruits  = {"Orange","Apple","Banana"};
        for( String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a = 10,b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }
    public static boolean isNegativeNumber(int number) {
        return number < 0;
    }
    public static void repeatString(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}