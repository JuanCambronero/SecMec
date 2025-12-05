package Modelo;

import java.util.ArrayList;

public class HistorialMedico {
    //Atributos
    private ArrayList<HistorialMedico> entradasHistorialMedico;


    public HistorialMedico() {}

    public ArrayList<HistorialMedico> getEntradasHistorialMedico() {
        return entradasHistorialMedico;
    }

    public void agregarEntrada(EntradaHistorial entrada) {
        entradasHistorialMedico.add(entrada);
    }

    @Override
    public String toString() {
        return "HistorialMedico{" +
                "entradasHistorialMedico=" + entradasHistorialMedico.toString() +
                '}';
    }
}
