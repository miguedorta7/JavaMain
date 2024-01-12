import java.util.Scanner;

public class CoversorMillaAKm {
        public static void main(String[] args) {
            System.out.println("Ingrese la distancia en millas:");
            Scanner teclado = new Scanner(System.in);
            double milla = teclado.nextInt();
            double kilometro = milla * 1.60934;
            System.out.println("La distancia en kilometros es de: " + kilometro +" km" );
        }
    }
