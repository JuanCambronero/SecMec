package Modelo;
/**
 * Representa a un médico de la clínica.
 * Incluye un número de colegiado y una especialidad médica.
 */
public class Medico extends PersonalSanitario{
    //Atributos
    /**
     * Especialidades médicas disponibles para el médico.
     */
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
        return "Medico {" +
                "\n  Nombre: " + nombre +
                "\n  DNI: " + dni +
                "\n  Email: " + email +
                "\n  Dirección: " + direccion +
                "\n  Usuario: " + username +
                "\n  Nº Colegiado: " + numColegiado +
                "\n  Especialidad: " + especialidad +
                "\n}";
    }

}
