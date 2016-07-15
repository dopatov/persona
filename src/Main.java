import java.util.*;

public class Main {

    private static Map<Long,Persona>mapID = new HashMap<>();
    private static Map<String,Persona>mapDNI=new HashMap<>();
    private static Map<String,Persona>mapNombre=new TreeMap<>();
    private static Map<Integer,List<Persona>>mapEdad=new HashMap<>();


    public static void main(String[] args) {

        String consultaRepetir="y";
        String newLine=System.getProperty("line.separator");

        while (consultaRepetir.equalsIgnoreCase("y")) {

            generaPersonas();
            consultaPersona();

            Scanner sc = new Scanner(System.in);
            System.out.println(newLine);
            System.out.println("Quieres volver a realizar una consulta? [Y/N]");
            consultaRepetir = sc.next();

            if (consultaRepetir.equalsIgnoreCase("n"))
            {
                System.out.println("Adios");
                System.exit(1);
            }
        }
    }


    private static void generaPersonas() {

        Persona persona1=new Persona("Pepito","43221133G",25,1L);

        mapID.put(persona1.getId(),persona1);
        mapDNI.put(persona1.getDNI(),persona1);
        mapNombre.put(persona1.getNombre(),persona1);
        gestionEdad(persona1);


        Persona persona2=new Persona("Fulanito","42331144B",21,2L);

        mapID.put(persona2.getId(),persona2);
        mapDNI.put(persona2.getDNI(),persona2);
        mapNombre.put(persona2.getNombre(),persona2);
       gestionEdad(persona2);


        Persona persona3=new Persona("Menganito","34553322C",24,3L);

        mapID.put(persona3.getId(),persona3);
        mapDNI.put(persona3.getDNI(),persona3);
        mapNombre.put(persona3.getNombre(),persona3);
        gestionEdad(persona3);


        Persona persona4=new Persona("Ataúlfo","41223131B",22,4L);

        mapID.put(persona4.getId(),persona4);
        mapDNI.put(persona4.getDNI(),persona4);
        mapNombre.put(persona4.getNombre(),persona4);
        gestionEdad(persona4);

        Persona persona5=new Persona("Tomeu","34543412H",20,5L);

        mapID.put(persona5.getId(),persona5);
        mapDNI.put(persona5.getDNI(),persona5);
        mapNombre.put(persona5.getNombre(),persona5);
        gestionEdad(persona5);


        Persona persona6=new Persona("Florencio","745747474B",20,6L);

        mapID.put(persona6.getId(),persona6);
        mapDNI.put(persona6.getDNI(),persona6);
        mapNombre.put(persona6.getNombre(),persona6);
        gestionEdad(persona6);

        Persona persona7=new Persona("Gertrudis", "68797863C", 19,7L);

        mapID.put(persona7.getId(),persona7);
        mapDNI.put(persona7.getDNI(),persona7);
        mapNombre.put(persona7.getNombre(),persona7);
        gestionEdad(persona7);


        Persona persona8=new Persona("Antonio", "68786859C", 18,8L);

        mapID.put(persona8.getId(),persona8);
        mapDNI.put(persona8.getDNI(),persona8);
        mapNombre.put(persona8.getNombre(),persona8);
        gestionEdad(persona8);

        Persona persona9=new Persona("Sisinio", "8347474G", 21,9L);

        mapID.put(persona9.getId(),persona9);
        mapDNI.put(persona9.getDNI(),persona9);
        mapNombre.put(persona9.getNombre(),persona9);
        gestionEdad(persona9);


        Persona persona10=new Persona("Mariano", "872378623C",22,10L);

        mapID.put(persona10.getId(),persona10);
        mapDNI.put(persona10.getDNI(),persona10);
        mapNombre.put(persona10.getNombre(),persona10);
        gestionEdad(persona10);

    }

    private static void gestionEdad(Persona persona) {
        if (! mapEdad.containsKey(persona.getEdad()))
        {
            List<Persona> personaList = new ArrayList<>();
            mapEdad.put (persona.getEdad(),personaList);
        }
        List<Persona> personaList =  mapEdad.get(persona.getEdad());
        personaList.add(persona);

    }


    private static void consultaPersona()
    {
        Scanner sc=new Scanner(System.in);

        String newLine = System.getProperty("line.separator");

        System.out.println("¿Que valor quieres usar para buscar al alumno?");
        System.out.println(" 1-Edad" +newLine +" 2-Nombre" +newLine +" 3-DNI" +newLine +" 4-ID" +newLine +" 5-Consultar lista completa de alumnos"
        +newLine +" 6-Salir");
        System.out.println(newLine);

        Integer selector = sc.nextInt();

        switch (selector)
        {
            case 1:
            System.out.println("Introduce la edad:");

                System.out.println(newLine);
                Integer edadSelecc =sc.nextInt();
                if (!mapEdad.containsKey(edadSelecc))
                {
                    System.out.println("Edad not found");
                }else {

                    List<Persona> personaList = mapEdad.get(edadSelecc);
                    System.out.println(personaList);
                }
                break;


            case 2:
            System.out.println("Introduce el nombre:");
                System.out.println(newLine);

            String nombre = sc.next();
            Persona prsn1 = mapNombre.get(nombre);
                if(!(mapNombre.containsKey(nombre)))
                {
                    System.out.println("Nombre not found");
                }else
                {
                    System.out.println(prsn1.toString());
                }
                break;

            case 3:
            System.out.println("Introduce el DNI:");
                System.out.println(newLine);
            String dNI = sc.next();
            Persona prsn2 = mapDNI.get(dNI);
                if (!mapDNI.containsKey(dNI))
                {
                    System.out.println("DNI not found");
                }else
                {

                    System.out.println(prsn2.toString());
                }
                break;

            case 4:
            System.out.println("Introduce la ID:");
                System.out.println(newLine);
            Long iD = sc.nextLong();
            Persona prsn3 = mapID.get(iD);
                if (!mapID.containsKey(iD))
                {
                    System.out.println("ID not found");
                }else
                {
                    System.out.println(prsn3.toString());
                }
                break;
            case 5:
                System.out.println("Edades:");
                System.out.println(mapEdad.entrySet());
                System.out.println(newLine);
                System.out.println("Nombres:");
                System.out.println(mapNombre.entrySet());
                System.out.println(newLine);
                System.out.println("DNIs");
                System.out.println(mapDNI.entrySet());
                System.out.println(newLine);
                System.out.println("IDs");
                System.out.println(mapID.entrySet());
                break;
            case 6:
                System.out.println("Adios");
                System.exit(1);
                break;

            default:
                System.out.println("comor?");
                System.exit(1);
        }
    }

}
