/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilador;
import AnalisadorLexico.Cadeia;
import ManipulaIO.ManipulaArquivo;
import ManipulaIO.Token;
import AnalisadorLexico.AnalisaToken;



/**
 *
 * @author RafaelMq
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String tokenInteiro="";
        ManipulaArquivo arquivo = new ManipulaArquivo();
        AnalisaToken AnalisadorLexico = new AnalisaToken();
        Cadeia objCadeia = new Cadeia();
         
         int linha=0,nl,n2;
         
         
          //  while(linha != arquivo.getNumeroDeLinhas()){
                 tokenInteiro = arquivo.arrayTokens.get(2).getTokenDaLinha();

        System.out.println(tokenInteiro);
                 //String[] token = tokenInteiro.split(" ");
                 
                //for(int i=0;i<token.length;i++){
                  //  System.out.println(token[i]);    
               // AnalisadorLexico.consomeCaractere(token[i]);


       objCadeia =  AnalisadorLexico.consomeCaractere(tokenInteiro,false, 0);
        if(objCadeia.getToken() != null){
            System.out.println("Token: "+objCadeia.getToken() +" Tipo: "+objCadeia.getTipo());
        }

        objCadeia =  AnalisadorLexico.consomeCaractere(tokenInteiro,false, objCadeia.getPosicao());
        if(objCadeia.getToken() != null){
            System.out.println("Token: "+objCadeia.getToken() +" Tipo: "+objCadeia.getTipo());
        }

        objCadeia =  AnalisadorLexico.consomeCaractere(tokenInteiro,false, objCadeia.getPosicao());
        if(objCadeia.getToken() != null){
            System.out.println("Token: "+objCadeia.getToken() +" Tipo: "+objCadeia.getTipo());
        }

        objCadeia =  AnalisadorLexico.consomeCaractere(tokenInteiro,false, objCadeia.getPosicao());
        if(objCadeia.getToken() != null){
            System.out.println("Token: "+objCadeia.getToken() +" Tipo: "+objCadeia.getTipo());
        }


        //}
                

                
               
//                 for(int i=0; i<token.length ; i++){
//                     
//                    if(palavra.verificaPalavraReservada(token[i])){
//                        System.out.println("Token: " + token[i] +" --- " + "Verificador:  Reservada");
//                     }else{
//                        System.out.println("Token: " + token[i] +" --- " + "Verificador:  Nao Reservada");
//                     }
//                     
//                    
//                 }
                 
               // linha++;
         //   }
        
//         for(int i=0;i<AnalisadorLexico.arrayCadeiasAnalisadas.size();i++){
//          System.out.println(AnalisadorLexico.arrayCadeiasAnalisadas.get(i).getToken()+" - "+AnalisadorLexico.arrayCadeiasAnalisadas.get(i).getTipo());}
    }
    
}
