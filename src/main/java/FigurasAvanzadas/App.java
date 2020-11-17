package FigurasAvanzadas;

import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;


public class App {
    /**
     * Esta clase es de utilidad para ejecutar el programa como
     * un todo. No se la utiliza dentro de BlueJ.
     */
    public static void main(String[] args) throws Exception {
        GestorFiguras g = new GestorFiguras();

        g.crearFigurasAleatoriamente(5);

        System.out.println("Lista con 5 figuras");
        g.listarFigurasColeccionadas();

        System.out.println("Lista las figuras ordenadas");
        g.listarFigurasOrdenadas();


        System.out.println(g.alMenosUnoMayorA(10000));
        // System.out.println(g.ningunoMayorA(100000));
        // g.listarFigurasOrdenadas();

        // g.listarFigurasSegunDistanciaAlOrigen();

        // Generar una figura geometrica al azar y mostrarla
        // System.out.println(g.getAzar().getFiguraAleatoria());

        // ejemploDeConjuntos();
        // ejemploDeMapas();
    }


    // Colecciones tipo Conjunto y tipo Mapa

    // Set es un interface parametrizable que no acepta
    // objetos duplicados (usa equals() para comparar)
    // Vamos a usar las clase TreeSet y HashSet
    // TreeSet -> ordena por orden natural (compareTo)
    // HashSet -> ordena por valor de hash (digesto)

    public static void ejemploDeConjuntos () {
        //Ejemplo simple para mostrar toString por defecto
        
        // Set<String> conjunto = new TreeSet<>();
        // Set<String> conjunto = new HashSet<>();
        // conjunto.add("Hola");
        // conjunto.add("Zorro");
        // conjunto.add("Abeja");
        // conjunto.add("Hola");
        // conjunto.add("Zorro");

        Set<Rectangulo> conjunto = new TreeSet<>() ;
        // Set<Rectangulo> conjunto = new HashSet<>() ;
        conjunto.add(new Rectangulo(100));
        conjunto.add(new Rectangulo(150, 120));
        System.out.println("\n\n" + conjunto);
        System.out.println(">> Size = " + conjunto.size());

        conjunto.add(new Rectangulo(100));
        conjunto.add(new Rectangulo(80, 45));

        System.out.println("\n\n" + conjunto);
        System.out.println(">> Size = " + conjunto.size());
        for (Rectangulo rect : conjunto) {
            System.out.println("  --> " + rect);
        }
    }


    // Los mapas asocian una clave con un valor

    public static void ejemploDeMapas () {
        // Map<String,Rectangulo> mapa = new HashMap<>();
        Map<String,Rectangulo> mapa = new TreeMap<>();
        // Map<Integer,Rectangulo> mapa = new TreeMap<>();
        // Map<Integer,Rectangulo> mapa = new HashMap<>();

        System.out.println("\n\n" + mapa);

        mapa.put("primero", new Rectangulo(150));
        // mapa.put(Integer.valueOf(1), new Rectangulo(150));
        System.out.println("\n\n" + mapa);
        System.out.println(">> Size = " + mapa.size());

        mapa.put("segundo", new Rectangulo(120, 110));
        mapa.put("tercero", new Rectangulo(50));
        mapa.put("cuarto", new Rectangulo(150, 100));
        // mapa.put(Integer.valueOf(5), new Rectangulo(120, 110));
        // mapa.put(Integer.valueOf(3), new Rectangulo(50));
        // mapa.put(Integer.valueOf(4), new Rectangulo(150, 100));
        System.out.println(mapa);
        System.out.println(">> Size = " + mapa.size());

        System.out.println("\n....| " + mapa.get("cuarto"));
        System.out.println("\n....| " + mapa.get("segundo"));
        System.out.println("\n....| " + mapa.get("sexto"));

        // Recorro la coleccion completa utilizando las claves
        // keySet() devuelve el conjunto (Set) de las claves
        for (String clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + " -> Valor: " + mapa.get(clave));
        }

        // Recorro la coleccion directamente sobre los valores
        // values() devuelve la lista (Collection) con los valores
        for (Rectangulo r : mapa.values()) {
            System.out.println("++++> Valor: " + r);
        }
    }

}
