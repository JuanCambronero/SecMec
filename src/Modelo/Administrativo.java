package Modelo;

public class Administrativo extends Usuario{
    //Atributos
    private String idAdministrativo;

    //Constructor
    public Administrativo(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String idAdministrativo) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
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


    //Metodo toString
    @Override
    public String toString() {
        return "Administrativo{" +
                "idAdministrativo='" + idAdministrativo + '\'' +
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
