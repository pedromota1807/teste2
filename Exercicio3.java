import java.util.Scanner;

//Jefferson Pereira dos Santos RA:1430481923027

public class Exercicio3 {

    public static void main(String[] args) {
        //declaração de variáveis
        int idade,mes,dia,real_idade;
        
        //abertura do scan para colher os dados   
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Digite a sua idade:");
        idade=scan.nextInt();
        
        //validação de dados para que não digite a idade negativa. 
        while(idade<0){
          System.out.println("Você não pode digitar a idade negativa\n"); 
          System.out.println("Digite novamente a sua idade:");
          idade=scan.nextInt();
        }
        
        System.out.println("Digite os meses de idade:");
        mes=scan.nextInt();
        
        //validação de dados para que não digite mês acima de 11(pois 12 é 1 ano de idade) e numero negativo. 
        while(mes<0||mes>11){
          System.out.println("Você não pode digitar mes maior que 11 ou negativo\n"); 
          System.out.println("Digite novamente o mes de idade:");
          mes=scan.nextInt();
        }
        
        System.out.println("Digite os dias de idade:");
        dia=scan.nextInt();

        //validação de dados para que não digite dia acima de 30 e numero negativo.
        while(dia<0||dia>30){
          System.out.println("Você não pode digitar dia maior que 30\n"); 
          System.out.println("Digite novamente os dias de idade:");
          dia=scan.nextInt();
        }
        
        //Fechando o scanner.
        scan.close();
        
        //Realizando o calculo.
        real_idade=(idade*365)+(mes*30)+dia;
        
        //Apresentando o resultado do calculo.
        System.out.println("Você tem: "+real_idade+" dias de nascido");
    }
    
}
