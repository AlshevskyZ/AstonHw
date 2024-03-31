import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true)
        {
            System.out.print("Введите номер задания(1-14) или stop для выхода:");
            Scanner scan = new Scanner(System.in);
            var taskId = scan.nextLine();
            if(taskId.equals("stop")) {
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
                        System.out.println(checkSumRange(a,b));
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
                        changeElement(arrayTask10);
                        break;
                    case "11":
                        int[] arrayTask11 = new int[100];
                        fillArray(arrayTask11);
                        break;
                    case "12":
                        int[] arrayTask12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                        modifyArray(arrayTask12);
                        break;
                    case "13":
                        int size = 5;
                        fillMatrix(size);
                        break;
                    case "14":
                        for (int element : createArray(10, 5)) {
                            System.out.print(element + " ");
                        }
                        System.out.print("\n");
                        break;
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
            }
        }
    }
    private static void printThreeWords() {// 1
        String[] fruits  = {"Orange","Apple","Banana"};
        for( String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
    public static void checkSumSign() {//2
        int a = 10;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {//3
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {//4
        int a = 10,b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static boolean checkSumRange(int a, int b) {//5
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void checkNumberSign(int number) {//6
        if (number >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegativeNumber(int number) {//7
        return number < 0;
    }
    public static void repeatString(String str, int n) {//8
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year) {//9
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
    public static void changeElement(int[] array) {//10
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void fillArray(int[] array) {//11
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
    public static void modifyArray(int[] array) {//12
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < 6 ? array[i] * 2 : array[i];
        }
        for (int element : array) {
            System.out.print(element+ " ");
        }
        System.out.print("\n");
    }
    public static void fillMatrix(int size) {//13
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
    }
    public static int[] createArray(int len, int initialValue) {//14
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}