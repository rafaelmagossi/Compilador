/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexico;

/**
 *
 * @author RafaelMq
 */

//ID - 1
//palavra Reservada - 2
//erro - 3

/*



*/
public class TabelaPalavrasReservadas {
    
    private String tabelaPR[] = {"program","procedure","begin","var","real","read","if","integer","end","else","write","while","do","then"};
    
    private String tabelaSR[] = {"." , "," , ";" , ":" ,"<",">","=","-","+","/","(",")"};

    public int verificaPalavraReservada (String palavraAverificar, boolean erro){
        
        
        int contador = 0,tipo=10, auxI=10;
        
        
        
        while(contador < tabelaPR.length){
            if(tabelaPR[contador].equals(palavraAverificar)){
                auxI = 2;
            }
            
            contador++;
        }
        contador=0;
        while(contador < tabelaSR.length){
            if(tabelaSR[contador].equals(palavraAverificar)){
                auxI = 5;
               
            }
            
            contador++;
        }
            
        if(erro){
            tipo = 3;
        } else if(auxI==2 || auxI == 5){
            tipo = 2;
        }
        else if(erro==false){
            tipo = 1;
        }
       
        
        return tipo;
    }
    
}
