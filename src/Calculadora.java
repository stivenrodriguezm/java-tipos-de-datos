import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // Lectura del valor de 2 variables enteras por consola:
        System.out.println("Ingrese el número 1");
        int numero1 = lector.nextInt();
        double numeroUno = 0;
        System.out.println("Ingrese el número 2");
        int numero2 = lector.nextInt();
        System.out.println("Ingrese la operación (+, -, *, /, %, p)");
        char operacion = lector.next().charAt(0);

        switch (operacion) {
            case '+' :
                // Operación suma:
                int suma = numero1 + numero2;
                System.out.println("La suma es " + suma);
                break;
            case '-' :
                // Operación resta:
                int resta = numero1 - numero2;
                System.out.println("La resta es " + resta);
                break;
            case '*' :
                // Operación multiplicación:
                int multiplicacion = numero1 * numero2;
                System.out.println("La multiplicación es " + multiplicacion);
                break;
            case '/' :
                // Operación división:
                /* Es necesario que uno de los números que intervienen en la división sea double
                para que el resultado decimal sea aproximado correctamente. **/
                double division = (double) numero1 / numero2;
                System.out.println("La división es " + division);
                break;
            case '%':
                // Operación mod:
                /* Es necesario que uno de los números que intervienen en la división sea double
                para que el resultado decimal sea aproximado correctamente. **/
                int mod = numero1 % numero2;
                System.out.println("El mod es " + mod);
                break;
            case 'p':
                // Operación mod:
                /* Es necesario que uno de los números que intervienen en la división sea double
                para que el resultado decimal sea aproximado correctamente. **/
                numeroUno = (double) numero1;
                double exponente = Math.pow(numeroUno, numero2);
                System.out.println("El exponente es " + exponente);
                break;
            default:
                System.out.println("Operación inválida");
        }
    }
}
