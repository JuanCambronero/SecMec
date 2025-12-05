package Modelo;

public class Medico extends PersonalSanitario{
    //Atributos
    public enum Especialidad {NEUROLOGO,TRAUMATOLOGO,GINECOLOGO};
    private Especialidad especialidad;

    //Constructor
    public Medico(String nombre, String dni, String email, String direccion, String username, String passwordHash, String numColegiado, Especialidad especialidad ) {
        super(nombre, dni, email, direccion, username, passwordHash, numColegiado);
        this.especialidad = especialidad;
    }

    //Getter y Setter
    public Especialidad getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
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
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
