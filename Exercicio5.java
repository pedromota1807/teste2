import java.util.Scanner;

//Jefferson Pereira dos Santos RA:1430481923027
public class Exercicio5 {

    public static void main(String[] args) {
        
        //declaração de variáveis
        int m,n,soma,i;
        
        //abertura do scan para colher os dados
        Scanner scan=new Scanner(System.in);
        
        //inicializando variáveis para laço e armazenar valores
        i=0;
        soma=0;
        
        System.out.println("Digite os numeros M e N para realizar a soma entre os pares:");
        
        //iniciando o laço do código
        while(i==0){
            System.out.println("Numero M:");
            m=scan.nextInt();
            
            //realizando validação de dados caso tenha sido digitado negativo
            while(m<0){
                System.out.println("Você não pode digitar numeros negativos!");
                System.out.println("Digite novamente:");
                m=scan.nextInt();
            }
            
            System.out.println("Numero N:");
            n=scan.nextInt();           
            
            //realizando validação de dados caso tenha sido digitado negativo
            while(n<0){
                System.out.println("Você não pode digitar numeros negativos!");
                System.out.println("Digite novamente:");
                n=scan.nextInt();
            }
            
            //realizando o armazenamento de dados digitados.
            soma=soma+m+n;
            
            //condicionando variável a parar a execução do laço caso não satisfaça a lógica            
            if(m<n){
                //Condicionando as variáveis para cada vez que um numero par for digitado, ele imprimir a soma entre variáveis.
                if(m%2==0 && n%2==0){
                    System.out.println("Soma dos valores entre M e N até agora:"+soma);
                }
                else if(m%2==0){
                    System.out.println("Soma dos valores entre M e N até agora:"+soma);
                }
                else if(n%2==0){
                    System.out.println("Soma dos valores entre M e N até agora:"+soma);
                }
                else{
                    soma=soma+0;
                }
            }
            else{
                //realização da quebra do laço após não satisfazer a condição
                i=1;
            }
        }
        
        System.out.println("\nFim de digitação, você inseriu o numero do M maior ou igual ao numero do N");
        System.out.println("A soma entre os pares digitados foi: "+soma); 
       
        //Fechando o scanner.
        scan.close(); 
        
    }
    
}
