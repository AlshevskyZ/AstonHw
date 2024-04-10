public class Main {
    public static void main(String[] args) {
        String[][] array1 = new String[][]{{"1", "2", "3", "4"},
                                           {"5", "6", "7", "8"},
                                           {"9", "10", "11", "12"},
                                           {"13", "14", "15", "16"},
                                           {"17","18","19","20"}};
        String[][] array2 = new String[][]{{"1", "2", "3", "4"},
                                           {"5", "6", "7", "8"},
                                           {"9", "10", "11", "12"},
                                           {"13", "!!!!!!!", "15", "16"}};
        String[][] array3 = new String[][]{{"1", "2", "3", "4"},
                                           {"5", "6", "7", "8"},
                                           {"9", "10", "11", "12"},
                                           {"13", "14", "15", "16"}};
        String[][][] arrays = new  String[][][]{array1, array2, array3};
        for(String[][] arr : arrays){
            try {
                System.out.println("Сумма элементов массива: " + calculateArray(arr));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int calculateArray(String[][] array) throws MyArraySizeException,MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}