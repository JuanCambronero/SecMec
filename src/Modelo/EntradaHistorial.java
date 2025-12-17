package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Clase abstracta para cualquier entrada del historial médico.
 * Define fecha, identificador de médico y causa de la consulta.
 */
public abstract class EntradaHistorial {
    //Atributos
    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;

    //Constructor
    public EntradaHistorial(LocalDate fecha, String idMedico, String causa) {
        this.fecha = fecha;
        this.idMedico = idMedico;
        this.causa = causa;
    }

    //Getters
    public LocalDate getFecha() {
        return fecha;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public String getCausa() {
        return causa;
    }
    /**
     * Devuelve el tipo de entrada (por ejemplo, "Receta" o "Prueba Medica").
     *
     * @return Tipo de la entrada como cadena.
     */
    //Metodo abstracto
    public abstract String getTipo();
}
