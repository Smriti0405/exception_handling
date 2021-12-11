import java.util.InputMismatchException;
import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum =0;
        Scanner s= new Scanner(System.in);
    try{
        for(int i =0; i<5; i++)
            arr[i] =s.nextInt();

        for(int j =0; j< 5; j++){
            sum = sum + arr[j];
        }
        int avg = sum/5;
        System.out.println("The sum is: "+ sum);
        System.out.println("The average is: "+ avg);
    }
    catch (ArithmeticException e){
        System.out.println("java.lang.ArithmeticException");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("java.lang.ArrayIndexOutOfBoundsException");
    }
    catch(NumberFormatException e){
        System.out.println("java.lang.NumberFormatException");
    }
    catch (InputMismatchException e){
        System.out.println("java.lang.InputMismatchException");
    }
    s.close();
}
}
