package FigurasAvanzadas;

public class App {
    /**
     * Esta clase es de utilidad para ejecutar el programa como
     * un todo. No se la utiliza dentro de BlueJ.
     */
    public static void main(String[] args) throws Exception {
        GestorFiguras g = new GestorFiguras();

        g.crearFigurasAleatoriamente(10);

        g.listarFigurasColeccionadas();

        g.listarFigurasOrdenadas();

        g.listarFigurasSegunDistanciaAlOrigen();

        // Generar una figura geometrica al azar y mostrarla
        // System.out.println(g.getAzar().getFiguraAleatoria());
    }
}
