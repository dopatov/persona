import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by professor on 29/06/2016.
 */



public class Ordenapersonas {
    public static void main (String[]args){

        List<Persona> personaList = new ArrayList<>();

        Persona persona1=new Persona("Pepito","43221133G",25,1L);
        personaList.add(persona1);

        Persona persona2=new Persona("Fulanito","42331144B",21,2L);
        personaList.add(persona2);

        Persona persona3=new Persona("Menganito","34553322C",24,3L);
        personaList.add(persona3);

        Persona persona4=new Persona("Ataúlfo","41223131B",22,4L);
        personaList.add(persona4);

        Persona persona5=new Persona("Tomeu","34543412H",20,5L);
        personaList.add(persona5);

        Persona persona6=new Persona("Florencio","745747474B",20,6L);
        personaList.add(persona6);

        Collections.sort(personaList);

        for (Persona persona:personaList)
        {
            System.out.println(persona);
        }





    }
}
