package jogodavelha;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class JogodaVelha {

       
        
    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
        JV jogo = new JV ();
        String posicao;
        int valido = 0, jogadas = 0;
       
          
          
        while (true){
            System.out.println("**** Jogo da Velha *****");
            jogo.Mostrar();
            
            do{// jogador 1 inicia************************************
                
                
               
                 System.out.println(" jogador 1, informe uma posição :"); 
                posicao = scan.next();


               
 while(!jogo.valido(posicao)){
                    System.out.println(" jogada invalida, tente novamente!");
                    System.out.println(" jogador 1, informe uma posição :"); 
                posicao = scan.next();
                valido = 0;
                }

                jogo.Jogada(posicao, "x");
                valido = 1;
            }


while(valido == 0);     //fim jogador 1
               jogadas++;
               valido = 0;
               jogo.Mostrar();
               if(!jogo.Ganhou(jogadas).equals("null")){
                   break;
               }
               do{// jogador 2 inicia
               System.out.println(" jogador 2, informe uma posição :"); 
                posicao = scan.next();
              
  while(!jogo.valido(posicao)){
                    System.out.println(" jogada invalida, tente novamente!");
                    System.out.println(" jogador 2, informe uma posição :"); 
                posicao = scan.next();
                valido = 0;
                }
                jogo.Jogada(posicao, "o");
                valido = 1;
            }

while(valido == 0);          //fim jogador 2***********************
                  jogadas++;
               valido = 0;
               jogo.Mostrar();
               if(!jogo.Ganhou(jogadas).equals("null")){
                   break;
               }
        }
            System.out.println( "o "+jogo.Ganhou(jogadas)+" venceu !");
}
}
                
            
    

