package es.alns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int numeros[] = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
    System.out.print("Dame 1 numero (" + (i + 1)+ "): ");
    numeros[i] = entrada.nextInt();
    }
    System.out.println();

    System.out.println("Estos son los números que me has dao: ");
    for(int i = 0; i < numeros.length; i++){
    if( numeros.length - i)


    }

}
