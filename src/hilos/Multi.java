package hilos;

/* Clase que crea tres instancias de la clase Hilo y los ejecuta 
 * para representar el comportamiento de los Hilos en JAVA.
 */

public class Multi {

    public static void main(String args[]) {

        Hilos t1, t2, t3;

        // Creación de los threads con parámetro tiempo aleatorio
        t1 = new Hilos("Hilo 1", (int) (Math.random() * 20));
        t2 = new Hilos("Hilo 2", (int) (Math.random() * 100));
        t3 = new Hilos("Hilo 3", (int) (Math.random() * 2000));

        // Arrancamos los threads con el método start
        t1.start();
        t2.start();
        t3.start();
    }

}
