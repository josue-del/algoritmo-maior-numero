package maiornumero;

import java.util.Scanner;

/**
 * @author josue
 * Algoritmo que verifica qual o maior número
 */
public class MaiorNumero {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int valor1, valor2, valor3;
        char opcao ='n';
        do{ 
        System.out.print("Entre com o primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.print("Entre com o segundo valor: ");
        valor2 = sc.nextInt();
        System.out.print("Entre com o terceiro valor: ");
        valor3 = sc.nextInt();
        
        if (valor1 > valor2 && valor1 > valor3){
            System.out.println("O maior valor é: "+valor1);
        }
        else if (valor2 > valor3){
            System.out.println("O maior valor é: "+valor2);
        }
        else{
            System.out.println("O maior valor é: "+valor3);
        }
            System.out.print("Continuar? Sim [S] Não [N]: ");
            opcao = sc.next().charAt(0);
        }while (opcao !='n');
        System.out.println("Finalizado pelo usuário.");
        
     }
}
