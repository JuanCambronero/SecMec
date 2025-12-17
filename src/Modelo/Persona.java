package Modelo;
/**
 * Clase base abstracta que representa a una persona de la clínica.
 * Contiene datos de identificación y contacto (nombre, DNI, email y dirección).
 */
public abstract class Persona {
    //Atributos
    protected String nombre;
    protected String dni;
    protected String email;
    protected String direccion;


    //Constructor
    public Persona(String nombre, String dni, String email, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}