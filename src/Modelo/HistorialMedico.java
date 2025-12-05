package Modelo;

import java.util.ArrayList;

public class HistorialMedico extends Paciente {
    //Atributos
    private ArrayList<HistorialMedico> entradasHistorialMedico;


    public HistorialMedico(String nombre, String dni, String email, String direccion, ArrayList<HistorialMedico> entradasHistorialMedico) {
        super(nombre, dni, email, direccion);
        this.entradasHistorialMedico = entradasHistorialMedico;
    }

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
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
