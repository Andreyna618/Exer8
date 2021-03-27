
package exer8;

import java.util.Scanner;

public class Exer8 {

    
    public static void main(String[] args) {
        Scanner leia;
        leia = new Scanner (System.in);
        

        float pi ;
        float raio;
        float resultado;
        System.out.println("Digite o valor do raio do circulo");
        raio = Float.parseFloat(leia.nextLine());
        
        System.out.println("Digite o valor de π ");
        pi = Float.parseFloat(leia.nextLine());
        resultado = pi * raio *raio;
        System.out.println("A área do círculo é"+ "="+ resultado);
        
    }
    
}
