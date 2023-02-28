import java.util.Arrays;
public class OperationArray {
    public static void main(String[] args) {
        Integer[] objectArray = { 3, 5, 2, 5, 14, 4 };
        int getIndex = Arrays.asList(objectArray).get(5);
        System.out.println(getIndex);
    }
}