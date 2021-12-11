import newException.NegativeValuesException;
import newException.ValuesOutOfRangeException;

import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        String stu1, stu2;
        int sum1, sum2;
        int eng1, eng2;
        int maths1, maths2;
        int sc1,  sc2;

        Scanner s = new Scanner(System.in);
        stu1 = s.next();
        eng1 = s.nextInt();
        maths1 = s.nextInt();
        sc1 = s.nextInt();
        stu2 = s.next();
        eng2 = s.nextInt();
        maths2 = s.nextInt();
        sc2 = s.nextInt();
        try {
            if (eng1 > 100 || eng2 > 100 || maths1 > 100 || maths2 > 100 || sc1 > 100 || sc2 > 100)
                throw new ValuesOutOfRangeException();
            else {
                sum1 = eng1 + maths1 + sc1;
                sum2 = eng2 + maths2 + sc2;
            }
        }
        catch(ValuesOutOfRangeException e){
            System.out.println(e.getMessage());
        }
        try{
            if(eng1 <0 || eng2<0 || maths1<0 || maths2<0 || sc1<0 || sc2<0)
                throw new NegativeValuesException();
            else
                System.out.println("The range is right.");
            }
        catch(NegativeValuesException e){
            System.out.println(e.getMessage());
        }

    }
}
