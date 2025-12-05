package Modelo;

public class Paciente extends Persona{
    //Atributos
    private Medico medico;
    private HistorialMedico historialMedico;



    //Constructor
    public Paciente(String nombre, String dni, String email, String direccion) {
        super(nombre, dni, email, direccion);

    }



    //Getter y Setter
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "\n Nombre ='" + nombre  +
                "\n dni ='" + dni +
                "\n email ='" + email +
                "\n Dirección ='" + direccion +
                "\n Medico Asignado =" + medico +
                "\n Historial Medico =" + historialMedico +
                '}';
    }
}
