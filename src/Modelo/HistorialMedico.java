package Modelo;

import java.util.ArrayList;

public class HistorialMedico {
    //Atributos
    private ArrayList<EntradaHistorial> entradasHistorialMedico;


    public HistorialMedico() {
        this.entradasHistorialMedico = new ArrayList<>();
    }

    public ArrayList<EntradaHistorial> getEntradasHistorialMedico() {
        return new ArrayList<>(entradasHistorialMedico);
    }

    public void agregarEntrada(EntradaHistorial entrada) {
        entradasHistorialMedico.add(entrada);
    }

    @Override
    public String toString() {
        String entradas = "";
        if (entradasHistorialMedico.isEmpty()) {
            entradas = " Historial medico vació";
        }else {
            for(int i = 0 ; i < entradasHistorialMedico.size(); i++){
                entradas += entradasHistorialMedico.get(i).toString() + "\n";
            }
        }
        return entradas + " ";
    }
}
