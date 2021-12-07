import newException.InvalidAgeException;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;
        Scanner s= new Scanner(System.in);
        age = s.nextInt();
        try{
            if (age>=18 && age<60)
                System.out.println("Age is:"+" "+ age);
            else
                throw new InvalidAgeException("Age is invalid");
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
