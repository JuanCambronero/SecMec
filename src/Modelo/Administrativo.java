package Modelo;

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

    //Metodo asignarMedico
    public void asignarMedico( Paciente p,Medico m ){
        p.setMedico(m);
    }

    //Metodo para asignar Prueba Med
    public void asignarPruebaMed( Paciente p, PruebaMedica pm){
        p.setHistorialMedico(pm);
    }


    //Metodo toString
    @Override
    public String toString() {
        return "Administrativo{" +
                "idAdministrativo='" + idAdministrativo + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
