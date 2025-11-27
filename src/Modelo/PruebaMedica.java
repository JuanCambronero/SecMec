package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class PruebaMedica extends EntradaHistorial {
    //Atributos
    private enum TipoPrueba{RAYOS,TAC,RESO}
    private TipoPrueba tipoPrueba;
    private String resultado;

    //Constructor
    public PruebaMedica(String nombre, String dni, String email, String direccion, Medico medico, ArrayList<HistorialMedico> entradasHistorialMedico, LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(nombre, dni, email, direccion, medico, entradasHistorialMedico, fecha, idMedico, causa);
        this.resultado = resultado;
        this.tipoPrueba = tipoPrueba;
    }


    //Getters
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    public String getResultado() {
        return resultado;
    }
    //metodo que retona prueba medica
    @Override
    public String getTipo() {
        return "Prueba Medica";
    }

    //Metodo toString()
    @Override
    public String toString() {
        return "PruebaMedica{" +
                "resultado='" + resultado + '\'' +
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
