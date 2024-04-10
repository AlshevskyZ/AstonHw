public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j){
        super("Невозможно преобразовать элемент строки " + (i+1) + " под номером " + (j+1));
    }
}
