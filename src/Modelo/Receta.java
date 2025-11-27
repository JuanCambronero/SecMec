package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Receta extends EntradaHistorial{
    //Atributos
    private final ArrayList<String > medicamentos;

    //Constructor
    public Receta(String nombre, String dni, String email, String direccion, Medico medico, ArrayList<HistorialMedico> entradasHistorialMedico, LocalDate fecha, String idMedico, String causa, ArrayList<String > medicamentos) {
        super(nombre, dni, email, direccion, medico, entradasHistorialMedico, fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }

    //Getter Setter
    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }

    //metodo que retona receta
    public String getTipo(){
        return "Receta";
    }

    //Metodo toString()
    @Override
    public String toString() {
        return "Receta{" +
                "medicamentos=" + medicamentos +
                ", fecha=" + fecha +
                ", idMedico='" + idMedico + '\'' +
                ", causa='" + causa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
