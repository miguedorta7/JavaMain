import java.util.Arrays;
import java.util.Scanner;

public class ejercicioFrecCardiaca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = teclado.nextInt();

        System.out.println("Ingrese su nivel de actividad:");
        System.out.println("1) Sedentario");
        System.out.println("2) Moderado");
        System.out.println("3) Activo");
        int nivelActividad = teclado.nextInt();

        System.out.println("Ingrese su sexo:");
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");
        int sexo = teclado.nextInt();

        boolean esHombre = sexo == 1;

        int frecMaxima;
        if (esHombre){
            frecMaxima = 220 - edad;
        } else{
            frecMaxima = 226 - edad;
        }
        System.out.println("Frecuencia cardiaca máxima: " + frecMaxima);

        float rangoMinimo = 0f;
        float rangoMaximo;

        //"final" transforma a la variable en una constante
        final int SEDENTARIO = 1;
        final int MODERADO = 2;
        final int ACTIVO = 3;

        if (nivelActividad == SEDENTARIO){
            rangoMinimo = frecMaxima * 0.5f;
        }  else if (nivelActividad == MODERADO){
            rangoMinimo = frecMaxima * 0.6f;
        } else if (nivelActividad == ACTIVO){
            rangoMinimo = frecMaxima * 0.7f;
        }
        rangoMaximo = frecMaxima * 0.85f;

        System.out.println("Su rango objetivo de frecuencia cardiaca " + "es entre"
                + rangoMinimo + "a" + rangoMaximo + " latidos por minuto.");

        System.out.println("sistema de modificacion de datos para poder acceder al curso ");

    }
}
