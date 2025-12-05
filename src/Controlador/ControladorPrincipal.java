package Controlador;

import Modelo.*;
import Vista.Vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ControladorPrincipal {
    Vistas vs = new Vistas();
public void iniciar (){
    vs.printear("Pruebas v 1.0 - Version Simple");

    //Crear Usuarios
    Medico m1 = new Medico("Dr.Hoo","74653729L","doctHooo@gmail.com","C/Poligono Chacon 6º","hoo","contaseña","01", Medico.Especialidad.NEUROLOGO);
    Administrativo admin1 = new Administrativo("Charo","948468328Ñ","charitolg@gmail.com","C/Foso 12º","charito","constraseña","Admin-01");

    vs.printear("---Usuarios Creados---");
    vs.printear(m1.toString());
    vs.printear(admin1.toString());

    //Crear Paciente
    Paciente p1 = new Paciente("Juan","723847470O","juancambronero@gmail.com","C/Moreras 5º");
    vs.printear("---Paciente Creado---");
    vs.printear(p1.toString());

    //Asignar medico a paciente
    admin1.asignarMedico(p1,m1);
    vs.printear("---Medico Asignado---");
    vs.printear(p1.toString());


    //Pruebas de historial
    Receta r1 = new Receta(LocalDate.now().minusDays(2),m1.getNumColegiado(),"Dolor de cabeza", (ArrayList<String>) Arrays.asList("Paracetamol 1g","Agua"));
    PruebaMedica pm1 = new PruebaMedica (LocalDate.now().minusDays(2),m1.getNumColegiado(),"Dolor de codo", PruebaMedica.TipoPrueba.RAYOS,"Rotura Parcial");


    vs.printear("---Historial Medico---");
    p1.getHistorialMedico().agregarEntrada(r1);
    admin1.asignarPruebaMed(p1,pm1);

    vs.printear(p1.getHistorialMedico().toString());
}






















//    private Vistas vc = new Vistas();
//    private Scanner sc = new Scanner(System.in);
//    private Medico medico2 = new Medico("Juan","7474t6H","Juan@haem","s gd","juan","Juana38h93","12345678", Medico.Especialidad.NEUROLOGO);
//    private Paciente paciente = new Paciente("Pepe","45504838J","juan@ha","C/Juabsd");
//    private PruebaMedica pruebaMedica = new PruebaMedica(LocalDate.of(2025, 12, 1),"01","Dolor en codo", PruebaMedica.TipoPrueba.RAYOS,"Rotura de Codo");
//    private Administrativo admin;
//    private ArrayList<Administrativo> administrativos = new ArrayList<>();//Lista de admins
//
//
//
//
//
//    public void menuPrincipal() {
//        boolean continuar = true;
//        while (continuar) {
//            vc.mostrarMenu();
//            int selecionP = sc.nextInt();
//            switch (selecionP) {
//                //Menu Admin
//                case 1:
//                    vc.mostrarMenuAdmin();
//                    int selecionA = sc.nextInt();
//                    //Opciones Menu Admin
//                    switch (selecionA) {
//                        case 1:
//                            //Se piden al usuario los valores para crear un admin
//                            vc.crearAdministrativo();
//
//                            vc.pedirNombre();
//                            String nombre = sc.next();
//
//                            vc.pedirDni();
//                            String dni = sc.next();
//
//                            vc.pedirEmail();
//                            String email = sc.next();
//
//                            vc.pedirDireccion();
//                            String direccion = sc.next();
//
//                            vc.pedirUser();
//                            String usuario = sc.next();
//
//                            vc.pedirPassword();
//                            String password = sc.next();
//
//                            vc.pedirId();
//                            String id = sc.next();
//                            //Se crea el admin
//                            admin = new Administrativo(nombre, dni, email, direccion, usuario, password, id);
//                            //Se añade el admin a un ArrayList
//                            administrativos.add(admin);
//                            break;
//
//                        case 2:
//                            //Se recore el Array de admins mostrando todos sus atributos
//                            for (Administrativo admins : administrativos) {
//                                vc.mostrarAdministrativo(admins);
//                            }
//                            break;
//
//                        case 3:
//                            admin.asignarMedico(paciente,medico2);
//                            vc.cambiarMedico(paciente);
//                            break;
//
//                        case 4:
//                         //Asignar Prueba
//                            admin.asignarPruebaMed(paciente, pruebaMedica);
//                            vc.mostrarPrueba(paciente);
//                            break;
//                    }
//
//                    break;
//                    //Condición provisional de salida
//                    case 2:
//                        continuar = false;
//
//            }
//        }
//    }


}
