package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EntradaHistorial  extends HistorialMedico{
    //Atributos
    protected LocalDate fecha;
    protected String idMedico;
    protected String causa;

    //Constructor
    public EntradaHistorial(String nombre, String dni, String email, String direccion, ArrayList<HistorialMedico> entradasHistorialMedico, LocalDate fecha, String idMedico, String causa) {
        super(nombre, dni, email, direccion, entradasHistorialMedico);
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

    //Metodo abstracto
    public abstract String getTipo();
}
