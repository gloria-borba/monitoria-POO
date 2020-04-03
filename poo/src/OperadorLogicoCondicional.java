import java.util.Scanner;

public class OperadorLogicoCondicional {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        //Operadores condicionais

        /**
         *  if (condição){
         *  instrução ou bloco de instruções;
         *  }else{
         *  instrução ou bloco de instruções;
         *  }
         */

        //Operador lógico de igualdade ==
        if (a == b) {
            System.out.println("O valor é igual");
        } else {
            System.out.println("O valor é diferente");
        }

        //Operador lógico de diferença !=
        if (a != b) {
            System.out.println("O valor é igual");
        } else {
            System.out.println("O valor é diferente");
        }

        //Operador lógico de maior e menor que
        if (a > b) {
            System.out.println( a + " é maior que " + b);
        //Utilizando else if
        } else if(a >= b) {
            System.out.println( a + " é maior/igual que " + b);
        }else if(a < b) {
            System.out.println( a + " é menor que " + b);
        }else if(a <= b) {
            System.out.println( a + " é menor/igual que " + b);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Dividir");
        System.out.println("4 - multiplicar");
        //scanner usado para obter o número digitado no console
        int escolha = scanner.nextInt();

        //Switch case
        switch (escolha) {
            case 1:
                //caso o numero digitado for 1 executará esse bloco de código
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a / b);
                break;
            case 4:
                System.out.println(a * b);
                break;
            default:
                break;
        }

    }
}
