import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int index;
        try{
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            System.out.println("Enter the index number you want to access");
            index = s.nextInt();
            System.out.println("Element at index "+ index+" "+"is "+arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");

        }
        catch (InputMismatchException e){
            System.out.println("java.lang.InputMismatchException");
        }
        s.close();
    }
}
