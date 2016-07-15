
public class Persona implements Comparable <Persona> {

    String DNI;
    Integer edad;
    String nombre;
    Long id;

    public int compareTo(Persona otraPersona) {
        int resultado = 0;

        if (this.edad > otraPersona.edad) {
            return 1;

        } else if (this.edad < otraPersona.edad){
            return -1;

        } else {
            return 0;
        }
    }

    public Persona(String nombre, String DNI, Integer edad, Long id)
    {
        this.nombre=nombre;
        this.DNI=DNI;
        this.edad=edad;
        this.id=id;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
