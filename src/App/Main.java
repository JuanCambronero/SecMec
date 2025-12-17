package App;

import Controlador.ControladorPrincipal;
/**
 * Clase de entrada de la aplicación.
 * Contiene el método {@code main} que crea el controlador principal
 * y arranca la ejecución.
 */
public class Main {
    /**
     * Punto de entrada de la aplicación de consola.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal();
        controladorPrincipal.iniciar();
    }
}
