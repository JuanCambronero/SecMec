package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Receta extends EntradaHistorial{
    //Atributos
    private final ArrayList<String > medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, ArrayList<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }


    //Constructor

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
                '}';
    }
}
