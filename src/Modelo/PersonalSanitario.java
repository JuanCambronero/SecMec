package Modelo;

public abstract class PersonalSanitario extends Usuario{
    //Atributos
    protected String numColegiado;

    //Constructor
    public PersonalSanitario(String nombre, String dni, String email, String direccion, String username, String passwordHash, String salt, String numColegiado) {
        super(nombre, dni, email, direccion, username, passwordHash, salt);
        this.numColegiado = numColegiado;
    }

    //Getter y Setter
    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "PersonalSanitario{" +
                "numColegiado='" + numColegiado + '\'' +
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
