/**
 * Created by professor on 29/06/2016.
 */
public class Stringcomparable {
    public static void  main (String[]args)
    {

        Persona ivan= new Persona("ivan","22", 22, 1L);
        Persona marcos=new Persona("marcos","23", 23, 2L);
        int result=ivan.compareTo(marcos);
        System.out.println(result);
    }
}
