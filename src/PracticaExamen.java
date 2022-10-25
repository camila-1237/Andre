import java.util.Scanner;
public class PracticaExamen {

    public static void main(String[] args) {
        System.out.println("Ingrese su edad:");
        int edad = new Scanner(System.in).nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Usted es menor");
        }
        System.out.println("Fin");
    }

}
