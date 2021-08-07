import java.util.Scanner;

//Jefferson Pereira dos Santos RA:1430481923027

public class Exercicio4 {
      

    public static void main(String[] args) {
        //declaração de variáveis
        int i;
        
        //declarando array 
        int[] dia=new int[2];
        int[] mes=new int[2];
        int[] ano=new int[2];
        
        //abertura do scan para colher os dados        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Descubra qual data é maior!\n");

            //Inicialização do laço para colher os dados digitados dentro dos 3 arrays.
            for(i=0;i<2;i++){
                System.out.println("Digite o dia da data: "+(i+1));
                dia[i]=scan.nextInt();
                    //Validando dado caso digite o dia de forma incorreta.
                    while(dia[i]<=0 ||dia[i]>31){
                        System.out.println("Você não pode digitar dia negativo ou maior que 31");
                        System.out.println("Digite novamente:\n");
                        dia[i]=scan.nextInt();
                    }
                System.out.println("Digite o mes da data: "+(i+1));
                mes[i]=scan.nextInt();
                    //Validando dado caso digite o mês de forma incorreta.
                    while(mes[i]<=0 ||mes[i]>12){
                        System.out.println("Você não pode digitar mes negativo ou maior que 12");
                        System.out.println("Digite novamente:\n");
                        mes[i]=scan.nextInt();
                    }
                System.out.println("Digite o ano da data: "+(i+1));
                ano[i]=scan.nextInt();
                    //Validando dado caso digite o ano de forma incorreta.
                    while(ano[i]<0){
                        System.out.println("Você não pode digitar ano negativo");
                        System.out.println("Digite novamente:\n");
                        mes[i]=scan.nextInt();
                    }                    
            }
            
            //Fechando o scanner.
            scan.close();
           
                //Realização da condicional para definir a data maior cronológicamente.
                if(ano[0]==ano[1] && mes[0]==mes[1]&& dia[0]==dia[1] ){
                    System.out.println("A data: "+dia[0]+"/"+mes[0]+"/"+ano[0]+" é maior que a data: "+dia[1]+"/"+mes[1]+"/"+ano[1]); 
                }
                else if(ano[0]==ano[1] && mes[0]==mes[1] && dia[0]>dia[1]){
                    System.out.println("A data: "+dia[0]+"/"+mes[0]+"/"+ano[0]+" é maior que a data: "+dia[1]+"/"+mes[1]+"/"+ano[1]);
                }
                else if(ano[0]==ano[1] && mes[0]==mes[1] && dia[0]<dia[0]){
                    System.out.println("A data: "+dia[1]+"/"+mes[1]+"/"+ano[1]+" é maior que a data: "+dia[0]+"/"+mes[0]+"/"+ano[0]);
                }
                else if(ano[0]==ano[1] && mes[0]>mes[1]){                  
                    System.out.println("A data: "+dia[0]+"/"+mes[0]+"/"+ano[0]+" é maior que a data: "+dia[1]+"/"+mes[1]+"/"+ano[1]);
                }
                else if(ano[0]==ano[1] && mes[0]<mes[1]){
                    System.out.println("A data: "+dia[1]+"/"+mes[1]+"/"+ano[1]+" é maior que a data: "+dia[0]+"/"+mes[0]+"/"+ano[0]); 
                }
                else if(ano[0]>ano[1]){
                    System.out.println("A data: "+dia[0]+"/"+mes[0]+"/"+ano[0]+" é maior que a data: "+dia[1]+"/"+mes[1]+"/"+ano[1]); 
                }
                else{
                   System.out.println("A data: "+dia[1]+"/"+mes[1]+"/"+ano[1]+" é maior que a data: "+dia[0]+"/"+mes[0]+"/"+ano[0]); 
                }
        }          

}

        


    

