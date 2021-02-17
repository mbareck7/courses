package courses;

import java.util.TooManyListenersException;

import courses.exceptions.TooOldExcpetion;
import courses.exceptions.TooYoungException;

public class C1{
    public static void main(String[] args) {
        
        try {
            float res =   5/0;
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("Error");
        }

        //float res =   5/0;

        System.out.println("Continue....");

        try {
            checkAge(7);
        } catch (TooYoungException e) {
            System.out.println(e.getMessage());
        }catch(TooOldExcpetion e){
            System.out.println(e.getMessage());
        }
        
    }

    public static void checkAge(int age) throws TooOldExcpetion,TooYoungException{
        if(age < 18)
            throw new TooYoungException("your age is just " + age + ", too  young");
        if(age > 40)
            throw new TooOldExcpetion("your age is " + age + ", too  old");
        System.out.println("Age " + age + ", Okay");

    }
}
