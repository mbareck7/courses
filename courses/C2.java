package courses;

import courses.heritage.animals.*;
import courses.heritage.peopels.Etudiant;

public class C2 {
static int count=0;
public int number = 0;

//static variables
//    public void increment()
//    {
//        count++;
//    }


    static int age;
    static String name;
    //This is a Static Method
    static void disp(){
      prints("Age is: "+age);
      prints("Name is: "+name);
  }


   public static void main(String args[])
   {
    //    C2 obj1=new C2();
    //    C2 obj2=new C2();
    //    C2 obj3 = new C2();

    //    obj1.increment();
    //    obj2.increment();
    //    obj3.increment();

    //    prints("Obj1: number is="+obj1.count);
    //    prints("Obj2: number is="+obj2.count);
    //    prints("Obj2: number is="+obj3.count);


  
    //    obj1.number =7;

    //    prints("Obj1: number is="+obj1.number);
    //    prints("Obj2: number is="+obj2.number);
    //    prints("Obj2: number is="+obj3.number);



       //static variable accessible within static methods
    //    age = 30;
    //    name = "Steve";
    //    disp();//show error when it isn't static
   
        //super constructer
        // Etudiant e1 = new Etudiant("Mbaba",32233223);
        // prints(e1.getNom());
        //  e1.info();
        // e1.show();
        // e1.show("Hi");



    //polymorphisem
    // Animal myAnimal = new Animal();  // Create a Animal object
    // Animal myPig = new Pig();  // Create a Pig object
    // Animal myDog = new Dog();  // Create a Dog object
    // myAnimal.animalSound();
    // myPig.animalSound();
    // myDog.animalSound();
    
    }



   public static void prints(String msg){
       System.out.println(msg);
   }
}
