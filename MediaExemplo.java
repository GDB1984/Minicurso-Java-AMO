import java.util.Scanner;

public class MediaExemplo {
 
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Digite a nota da A1");
        Double notaA1 = entrada.nextDouble();

        System.out.println("Digite a nota da A2");
        Double notaA2 = entrada.nextDouble(); 

        System.out.println("Digite a nota da A3");
        Double notaA3 = entrada.nextDouble(); 

        Double media = (notaA1 + notaA2 + notaA3);

        System.out.println("A média das notas é: "+ media);

        if(media>=70){
            System.out.println("Aprovado(a)!");
        }
            else{
                System.out.println("Elegível para a avaliação integradora."); 
            }

        entrada.close();
    }
}

