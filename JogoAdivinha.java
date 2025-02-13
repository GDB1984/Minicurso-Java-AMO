import java.util.Scanner;

public class JogoAdivinha {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        int palpite;

        System.out.println("Digite um número inteiro entre 0 e 100");
        palpite = entrada.nextInt();

        if(palpite == 15){
            System.out.println("Você acertou!");

        }else if(palpite < 15){
            System.out.println("Seu palpite está abaixo.");
        }else{
            System.out.println("Seu palpite está acima.");
        }
        entrada.close();
        }

    }
