import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.Map;

public class CocheMultiMap {

    static ListMultimap<Integer,Coche> multimapCoches= ArrayListMultimap.create();

    public static void  main (String[]args) {
        Coche coche1=new Coche(1L,"306","Peugeot",1998,"234323B");
        Coche coche2=new Coche(2L,"Astra", "Opel",1998,"432343C");
        Coche coche3=new Coche(3L,"Megane", "Renault", 2005,"345434H");
        Coche coche4=new Coche(4L,"PT Cruiser", "Chrysler", 2009, "435465D");
        Coche coche5=new Coche(5L,"Xsara", "Citroen", 2002, "235467A");

        multimapCoches.put(1998,coche1);
        multimapCoches.put(1998,coche2);
        multimapCoches.put(2005,coche3);
        multimapCoches.put(2009,coche4);
        multimapCoches.put(2002,coche5);

        System.out.println(multimapCoches.get(1998));
    }
}
