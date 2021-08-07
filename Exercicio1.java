
import java.util.Scanner;

//Jefferson Pereira dos Santos RA:1430481923027

public class Exercicio1 {

    public static void main(String[] args) {
        //Declaração de variáveis
        int a,b,c;
        
        //abertura do scan para colher os dados  
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Digite 3 numeros:");
        System.out.println("\n1º:");
            a=scan.nextInt();
        System.out.println("\n2º:");
            b=scan.nextInt();
        System.out.println("\n3º:");
            c=scan.nextInt();
        
        //Condicionando variáveis para execução.
        if(c<a && c>b){
            System.out.println("\nO maior numero é: "+a+" e o menor é: "+b);
        }
        else if(a<b && a>c){
           System.out.println("\nO maior numero é: "+b+" e o menor é: "+c); 
        }
        else{
           System.out.println("\nO maior numero é: "+c+" e o menor é: "+a);
        }
        
        //Fechando o scanner.
        scan.close();
        
        
    }
    
}
