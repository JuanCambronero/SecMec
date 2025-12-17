package Modelo;

import java.util.ArrayList;
/**
 * Representa el historial médico de un paciente.
 * Contiene una lista de entradas de historial (recetas y pruebas médicas).
 */
public class HistorialMedico {
    //Atributos
    private ArrayList<EntradaHistorial> entradasHistorialMedico;


    public HistorialMedico() {
        this.entradasHistorialMedico = new ArrayList<>();
    }

    public ArrayList<EntradaHistorial> getEntradasHistorialMedico() {
        return new ArrayList<>(entradasHistorialMedico);
    }
    /**
     * Añade una nueva entrada al historial médico.
     *
     * @param entrada Entrada de historial a registrar.
     */
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
