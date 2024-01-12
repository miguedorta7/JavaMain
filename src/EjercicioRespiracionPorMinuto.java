import java.util.Scanner;

public class EjercicioRespiracionPorMinuto {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de respiracion por minuto(RPM)");
        Scanner teclado = new Scanner(System.in);
        int respiraciones = teclado.nextInt();

        if (respiraciones >= 12 && respiraciones <= 20) {
            System.out.println("La tasa de respiración esta en un rango normal");
        } else if (respiraciones < 12) {
            System.out.println("La tasa de respiración esta en un rango bajo");
        } else if (respiraciones > 20) {
            System.out.println("La tasa de respiración esta en un rango alto");
        }
    }
}
