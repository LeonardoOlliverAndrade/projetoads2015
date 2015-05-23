package jogodavelha;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class JogoDaVelha {

       
        
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
