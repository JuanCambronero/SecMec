package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Representa una receta médica asociada a un paciente.
 * Incluye la lista de medicamentos prescritos, la causa y la fecha.
 */
public class Receta extends EntradaHistorial{
    //Atributos
    private final ArrayList<String > medicamentos;

    public Receta(LocalDate fecha, String idMedico, String causa, ArrayList<String> medicamentos) {
        super(fecha, idMedico, causa);
        this.medicamentos = medicamentos;
    }


    //Constructor
    /**
     * Devuelve la lista de medicamentos prescritos en la receta.
     *
     * @return Lista de medicamentos.
     */
    //Getter Setter
    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }
    /**
     * Devuelve el tipo de entrada.
     *
     * @return Siempre "Receta".
     */
    //metodo que retona receta
    public String getTipo(){
        return "Receta";
    }

    //Metodo toString()
    @Override
    public String toString() {
        return "Receta: " +
                "Medicamentos = " + medicamentos.toString() + "; " +
                "Causa = " + causa + "; " +
                "Fecha = " + fecha + "; ";
    }
}
