package Vista;

import Controlador.ControladorPrincipal;
import Modelo.Administrativo;

public class Vistas {
    //Opciones del menu principal(en proceso)
    public void mostrarMenu(){
        System.out.println("---Menu Principal---");
        System.out.println("1. Administrativo");
    }

    //Menu que se muestra al selecionar en el main Admin(en proceso)
    public void mostrarMenuAdmin(){
        System.out.println("---Menu Administrativo---");
        System.out.println("1. Crear Administrativo");
        System.out.println("2. Mostrar Administrativo");
    }

    //Se muestra al seleccionar crear Admin
    public void crearAdministrativo(){
        System.out.println("---Crear Administrativo---");
    }

    //Mustra los administradores que hay
    public void mostrarAdministrativo(Administrativo admin){
        System.out.println("---Mostar Administrativo---");
        System.out.println(admin.toString());
    }





    //Vistas para las peticiones que se hagan al crear objetos
    public void pedirNombre(){
        System.out.println("Nombre: ");
    }
    public void pedirDni(){
        System.out.println("Dni: ");
    }
    public void pedirEmail(){
        System.out.println("Email: ");
    }
    public void pedirDireccion(){
        System.out.println("Dirección: ");
    }
    public void pedirUser(){
        System.out.println("Usuario: ");
    }
    public void pedirPassword(){
        System.out.println("Contraseña: ");
    }
    public void pedirId(){
        System.out.println("Id: ");
    }


}
