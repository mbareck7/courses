
package tp5;
import java.util.*;



public class Test {


    public static Testclass testclass = null;
    public String name = null;

	public static void main(String args[])
	{


        LinkedList<String> names = new LinkedList<>();


        testclass = new Testclass();
        testclass.name = "Mohamed";

        prints(testclass.name);


        // names.add("Mbaba");
        // names.add("Mohamed");
        // names.add("Mohamed343");
        // names.add("Mohamed43");
        // names.add("Mohame43d");
        // names.add("Mohame4334d");

        // for (String bla : names) {
        //     prints(bla);
        // }


        // prints(names.getLast());
    }




    public static void prints(String s){
        System.out.println(s);
    }
}