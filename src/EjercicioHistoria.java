import java.util.Scanner;

public class EjercicioHistoria {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del personaje pricipal:");
        String nombrePersonaje = teclado.nextLine();
        System.out.println("Ingrese el nombre del segundo personaje de la historia:");
        String personajeDos = teclado.nextLine();

        String cuento ="En un bosque encantado, vivía un duende llamado " + nombrePersonaje + ". " + nombrePersonaje + " era conocido por su amor por las plantas y su jardín mágico, donde cultivaba flores de todos los colores y tamaños.\n" +
                "\n" +
                "Un día, una sequía golpeó el bosque y todas las plantas empezaron a marchitarse. " + nombrePersonaje + " se preocupó mucho por sus flores, pero por más que intentaba, no podía encontrar una solución para traer la lluvia de vuelta.\n" +
                "\n" +
                "Decidió emprender un viaje en busca de ayuda. En su camino, conoció a una hada del agua llamada " + personajeDos + ". Ella le contó sobre una antigua fuente mágica custodiada por el Espíritu del Agua que podría traer la lluvia de regreso al bosque.\n" +
                "\n" +
                "Juntos, " + nombrePersonaje + " y " + personajeDos + " se embarcaron en una aventura, superando desafíos y resolviendo enigmas para llegar a la fuente. Allí, se encontraron con el sabio Espíritu del Agua, quien les reveló que la lluvia volvería al bosque si lograban despertar al Gigante Durmiente, cuyos ronquidos traían la lluvia.\n" +
                "\n" +
                "Con ingenio y trabajo en equipo, " + nombrePersonaje + " y " + personajeDos + " hicieron reír tanto al Gigante Durmiente con sus historias y travesuras, que este despertó entre risas, trayendo consigo una suave lluvia que revitalizó el bosque.\n" +
                "\n" +
                "El agua alimentó el jardín mágico de " + nombrePersonaje + ", devolviendo la vitalidad a sus flores y plantas. El bosque volvió a llenarse de colores y vida, y " + nombrePersonaje + " aprendió que, en ocasiones, la solución a los problemas más grandes puede encontrarse con la ayuda de amigos inesperados y un poco de ingenio.";

        System.out.println(cuento);
    }
}

