package Vista;

import Controlador.ControladorPrincipal;
import Modelo.Administrativo;
import Modelo.Paciente;
/**
 * Clase de vista para la aplicación de consola.
 * Encapsula las operaciones de salida por pantalla y deja preparados
 * métodos para menús y peticiones de datos al usuario.
 */
public class Vistas {
    /**
     * Imprime un mensaje en la consola.
     *
     * @param ms Mensaje a mostrar.
     */
    public void printear (String ms) {
        System.out.println(ms);
    }



//    //Opciones del menu principal(en proceso)
//    public void mostrarMenu(){
//        System.out.println("---Menu Principal---");
//        System.out.println("1. Administrativo");
//    }
//
//    //Menu que se muestra al selecionar en el main Admin(en proceso)
//    public void mostrarMenuAdmin(){
//        System.out.println("---Menu Administrativo---");
//        System.out.println("1. Crear Administrativo");
//        System.out.println("2. Mostrar Administrativo");
//        System.out.println("3. Cambiar Medico");
//        System.out.println("4. Asiganar Prueba Medica");
//    }
//
//    //Se muestra al seleccionar crear Admin
//    public void crearAdministrativo(){
//        System.out.println("---Crear Administrativo---");
//    }
//
//    //Mustra los administradores que hay
//    public void mostrarAdministrativo(Administrativo admin){
//        System.out.println("---Mostar Administrativo---");
//        System.out.println(admin.toString());
//    }
//
//    //Muestra el mensaje de que se cambio el medico
//    public void cambiarMedico(Paciente p){
//        System.out.println(p.getNombre() + " su nuevo medico es " + p.getMedico());
//    }
//
//    //Muestra la prueba asiganda al paciente
//    public void mostrarPrueba(Paciente p){
//        System.out.println("Su historial medico es: " + p.getHistorialMedico());
//    }
//
//
//
//
//
//    //Vistas para las peticiones que se hagan al crear objetos
//    public void pedirNombre(){
//        System.out.println("Nombre: ");
//    }
//    public void pedirDni(){
//        System.out.println("Dni: ");
//    }
//    public void pedirEmail(){
//        System.out.println("Email: ");
//    }
//    public void pedirDireccion(){
//        System.out.println("Dirección: ");
//    }
//    public void pedirUser(){
//        System.out.println("Usuario: ");
//    }
//    public void pedirPassword(){
//        System.out.println("Contraseña: ");
//    }
//    public void pedirId(){
//        System.out.println("Id: ");
//    }


}
