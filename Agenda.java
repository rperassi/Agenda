package exerciciossala;
import java.util.Scanner;
public class d3005ex003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
  
        String agenda[][] = new String[10][5];
        int i, j;
        

        for(i=0; i<2; i++)//estrutura de repetição para fazer perguntas e receber dados e armazenar dentro da matriz
        {
            System.out.printf("\nDigite seu nome: ");
            agenda[i][0] = ler.nextLine(); 
            
            
            System.out.printf("\nDigite seu endereço: ");
            agenda[i][1] = ler.nextLine();
            
            
            System.out.printf("\nDigite seu codigo postal: ");
            agenda[i][2] = ler.nextLine();
            
            
            System.out.printf("\nDigite seu bairro: ");
            agenda[i][3] = ler.nextLine();
            
            System.out.printf("\nDigite seu telefone: ");
            agenda[i][4] = ler.nextLine();
        }
        
        for(i=0; i<2; i++)
        {
            System.out.printf("\n %d", i); 
            
            for(j=0; j<5; j++)
            {
                System.out.printf(" %s,", agenda[i][j]);
            }
        }

        
        
    }
}