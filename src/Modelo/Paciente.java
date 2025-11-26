package Modelo;

public class Paciente extends Persona{
    //Atributos
    private Medico medico;



    //Constructor
    public Paciente(String nombre, String dni, String email, String direccion, Medico medico) {
        super(nombre, dni, email, direccion);
        this.medico = medico;
    }

    //Getter y Setter
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
