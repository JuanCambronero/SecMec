package Controlador;

import Modelo.Administrativo;
import Vista.Vistas;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorPrincipal {
    private Vistas vc = new Vistas();
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Administrativo> administrativos = new ArrayList<>();//Lista de admins
    public void menuPrincipal() {
        boolean continuar = true;
        while (continuar) {
            vc.mostrarMenu();
            int selecionP = sc.nextInt();
            switch (selecionP) {
                //Menu Admin
                case 1:
                    vc.mostrarMenuAdmin();
                    int selecionA = sc.nextInt();
                    //Opciones Menu Admin
                    switch (selecionA) {
                        case 1:
                            //Se piden al usuario los valores para crear un admin
                            vc.crearAdministrativo();

                            vc.pedirNombre();
                            String nombre = sc.next();

                            vc.pedirDni();
                            String dni = sc.next();

                            vc.pedirEmail();
                            String email = sc.next();

                            vc.pedirDireccion();
                            String direccion = sc.next();

                            vc.pedirUser();
                            String usuario = sc.next();

                            vc.pedirPassword();
                            String password = sc.next();

                            vc.pedirId();
                            String id = sc.next();
                            //Se crea el admin
                            Administrativo admin = new Administrativo(nombre, dni, email, direccion, usuario, password, "123456789", id);
                            //Se añade el admin a un ArrayList
                            administrativos.add(admin);
                            break;

                        case 2:
                            //Se recore el Array de admins mostrando todos sus atributos
                            for (Administrativo admins : administrativos) {
                                vc.mostrarAdministrativo(admins);
                            }
                            break;
                    }

                    break;
                    //Condición provisional de salida
                    case 2:
                        continuar = false;

            }
        }
    }


}
