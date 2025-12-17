package Modelo;

import java.time.LocalDate;

/**
 * Representa una prueba médica realizada a un paciente.
 * Guarda el tipo de prueba, el resultado, la causa y la fecha.
 */
public class PruebaMedica extends EntradaHistorial {
    //Atributos
    /**
     * Tipos de prueba médica disponibles.
     */
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
    /**
     * Devuelve el tipo de prueba médica.
     *
     * @return Tipo de prueba.
     */
    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }
    /**
     * Devuelve el resultado de la prueba.
     *
     * @return Resultado de la prueba.
     */
    public String getResultado() {
        return resultado;
    }
    /**
     * Devuelve el tipo de entrada.
     *
     * @return Siempre "Prueba Medica".
     */
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
