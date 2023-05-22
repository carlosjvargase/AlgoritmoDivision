import java.util.Scanner;

public class AlgoritmoDivision {
    public static void main(String[] args) {
        //Divide 2 numeros sin necesidad de dividir y mostrar por pantalla.

        int num1;
        int num2;
        int res=0;

        System.out.println("Indique el numero 1: ");
        Scanner sc= new Scanner (System.in);
        num1=sc.nextInt();

        System.out.println("Indique el numero 2: ");
        num2=sc.nextInt();

        while(num1>=num2) {
            num1-=num2;
            res++;
        }

        System.out.println("El resultado de la division es: " + res + " y el residuo o resto es: " + num1);

    }
}
