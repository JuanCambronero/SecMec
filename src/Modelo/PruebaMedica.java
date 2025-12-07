package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class PruebaMedica extends EntradaHistorial {
    //Atributos
    public enum TipoPrueba{RAYOS_X ,TAC,RESO}
    private TipoPrueba tipoPrueba;
    private String resultado;

    //Constructor
    public PruebaMedica(LocalDate fecha, String idMedico, String causa, TipoPrueba tipoPrueba, String resultado) {
        super(fecha, idMedico, causa);
        this.tipoPrueba = tipoPrueba;
        this.resultado = resultado;
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
        return "PruebaMedica: " +
                "Causa = " + causa + "; " +
                "Tipo de Prueba= " + tipoPrueba + "; "+
                "Resultado= " + resultado + "; " +
                "Fecha= " + fecha + "; "
                ;
    }
}
