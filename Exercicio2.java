import java.util.Scanner;

//Jefferson Pereira dos Santos RA:1430481923027

public class Exercicio2 {

    public static void main(String[] args) {
        //declarando array e variavel.
        int vetor[],i;
        
        //abertura do scan para colher os dados  
        Scanner scan=new Scanner(System.in);
        
        //instanciando o tamanho do array
        vetor =new int[10];
        
        System.out.println("Digite 10 numeros inteiros no vetor:\n");
        
        //realizando o scanner dos numeros inteiros
        for(i=0;i<10;i++){
            vetor[i]=scan.nextInt();
        }
        
        System.out.println("\nImprimindo vetor em ordem inversa:\n");        
        for(i=9;i>=0;i--){
            System.out.println(vetor[i]);
        }
        
        //Fechando o scanner.
        scan.close();
        
    }
    
}
