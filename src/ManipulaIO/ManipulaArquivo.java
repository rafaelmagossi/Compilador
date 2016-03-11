/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipulaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author RafaelMq
 */
public class ManipulaArquivo {
    
    public ArrayList<Token> arrayTokens = new ArrayList<Token>(); 
    private int numeroDaLinha=1;

    public int getNumeroDeLinhas() {
        return numeroDaLinha-1;
    }

    public ManipulaArquivo() { // metodo que le o arquivo texto  



        try {  
            BufferedReader buffer = new BufferedReader(new FileReader("teste.txt"));  
            String linha;
                while ((linha = buffer.readLine()) != null) {  
                        arrayTokens.add(new Token(numeroDaLinha,linha));
                        numeroDaLinha++;
                }  
            buffer.close();     

            }
            catch (IOException e){
                e.printStackTrace();  
            } 

        for(int k=0;k<arrayTokens.size();k++){
           // System.out.println("Array Token["+k+"]: " + arrayTokens.get(k).getTokenDaLinha());
           // System.out.println("Array Linha["+k+"]: " + arrayTokens.get(k).getNumeroLinha());
           // System.out.println(); 
        }
    }
    
}
