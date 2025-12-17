package Modelo;
/**
 * Representa a un usuario del sistema que puede autenticarse.
 * Amplía {@link Persona} añadiendo nombre de usuario y hash de contraseña.
 */
public class Usuario extends Persona {
    //Atributos
    protected String username;
    protected String passwordHash;
//    protected String salt ;

    //Constructor
    public Usuario(String nombre, String dni, String email, String direccion, String username, String passwordHash) {
        super(nombre, dni, email, direccion);
        this.username = username;
        this.passwordHash = passwordHash;
//        this.salt = salt;
    }

    //Getter y Setter
//    public String getSalt() {
//        return salt;
//    }
//
//    public void setSalt(String salt) {
//        this.salt = salt;
//    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
