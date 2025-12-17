package Modelo;
/**
 * Representa a un usuario administrativo del sistema.
 * Permite asignar médicos y pruebas médicas a los pacientes.
 */
public class Administrativo extends Usuario{
    //Atributos
    private String idAdministrativo;

    //Constructor
    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash);
        this.idAdministrativo = idAdministrativo;
    }

    //Getter y Setter
    public String getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(String idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }
    /**
     * Asigna un médico a un paciente.
     *
     * @param p Paciente al que se asigna el médico.
     * @param m Médico que se asigna al paciente.
     */
    //Metodo asignarMedico
    public void asignarMedico( Paciente p,Medico m ){
        p.setMedico(m);
    }
    /**
     * Asigna una prueba médica a un paciente añadiéndola a su historial.
     *
     * @param p  Paciente al que se asigna la prueba.
     * @param pm Prueba médica que se registra en el historial.
     */
    //Metodo para asignar Prueba Med
    public void asignarPruebaMed( Paciente p, PruebaMedica pm){
           p.getHistorialMedico().agregarEntrada(pm);

    }


    //Metodo toString
    @Override
    public String toString() {
        return "Administrativo {" +
                "\n  Nombre: " + nombre +
                "\n  DNI: " + dni +
                "\n  Email: " + email +
                "\n  Dirección: " + direccion +
                "\n  Usuario: " + username +
                "\n  ID Administrativo: " + idAdministrativo +
                "\n}";
    }

}
