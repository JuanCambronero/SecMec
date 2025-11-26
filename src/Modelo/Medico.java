package Modelo;

public class Medico extends PersonalSanitario{
    //Atributos
    private String especialidad;

    //Constructor
    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numColegiado, String especialidad) {
        super(nombre, dni, email, direccion, username, passwordHash, salt, numColegiado);
        this.especialidad = especialidad;
    }

    //Getter y Setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Medico{" +
                "especialidad='" + especialidad + '\'' +
                ", numColegiado='" + numColegiado + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", salt='" + salt + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
