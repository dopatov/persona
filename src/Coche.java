import java.util.*;

/**
 * Created by professor on 29/06/2016.
 */
//Crear clase coche con ID,marca,modelo,añofabricación,matricula como atributos. crear 5 coches meterlos en array y
// conseguir que se ordenen segun matrícula

public class Coche implements Comparable<Coche> {

    Long ID;
    String modelo;
    String marca;
    int añoFabric;
    String matricula;


    public static void main (String[]args){

        Set<Coche> cocheSet=new TreeSet<>(new cocheAñoComparator());

        Coche coche1=new Coche(1L,"306","Peugeot",1998,"234323B");
        cocheSet.add(coche1);
        Coche coche2=new Coche(2L,"Astra", "Opel",1982,"432343C");
        cocheSet.add(coche2);
        Coche coche3=new Coche(3L,"Megane", "Renault", 2005,"345434H");
        cocheSet.add(coche3);
        Coche coche4=new Coche(4L,"PT Cruiser", "Chrysler", 2009, "435465D");
        cocheSet.add(coche4);
        Coche coche5=new Coche(5L,"Xsara", "Citroen", 2002, "235467A");
        cocheSet.add(coche5);

        System.out.println(cocheSet.toString());
    }

    public Coche(Long iD, String modelo, String marca, int añoFabric, String matricula ) {

        this.ID=iD;
        this.modelo=modelo;
        this.marca=marca;
        this.añoFabric=añoFabric;
        this.matricula=matricula;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAñoFabric() {
        return añoFabric;
    }

    public void setAñoFabric(int añoFabric) {
        this.añoFabric = añoFabric;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int compareTo(Coche otroCoche) {
        return this.matricula.compareTo(otroCoche.matricula);
        }

    @Override
    public String toString() {
        return "Coche{" +
                "ID=" + ID +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", año de fabricación=" + añoFabric +
                ", matricula='" + matricula + '\'' +
                '}';
    }

}

class cocheAñoComparator implements Comparator<Coche> {

    @Override
    public int compare(Coche coche, Coche otroCoche) {

        if (coche.getAñoFabric() > otroCoche.getAñoFabric())
        {
            return 1;
        }
        if (coche.getAñoFabric()< otroCoche.getAñoFabric())
        {
            return -1;
        }
        return 0;
    }
}
