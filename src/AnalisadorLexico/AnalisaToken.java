/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexico;

import java.util.ArrayList;


/**
 *
 * @author RafaelMq
 */



public class AnalisaToken {
    
        //erro -1 ou true
    //final 0
    
     public ArrayList<Cadeia> arrayCadeiasAnalisadas = new ArrayList<>();
     TabelaPalavrasReservadas palavraReservada = new TabelaPalavrasReservadas();
    Cadeia objCadeia = new Cadeia();


     
    int [][]MatrixAutomato = {           //     { 1,	1,	2,	21,	5,	-1,	22,	23,	20,	7,	9,	12,	10,	15,	16,	17,	18,	19},
//                                               { 1,	1,	1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1},
//                                               { -1,	-1,	2,	3,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1},
//                                               { -1,	-1,	4,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1},
//                                               { -1,	-1,	4,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1},
//                                               { 5,	5,	5,	5,	5,	6,	5,	5,	5,	5,	5,	5,	5,	5,	5,	5,	5,	5},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { -1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	8,	-1,	-1,	-1,	-1,	-1,	-1,	-1},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { -1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	11,	-1,	-1,	-1,	-1,	-1,	-1,	-1},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { -1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	-1,	13,	-1,	14,	-1,	-1,	-1,	-1,	-1},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
//                                               { 0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},


                                                
                               
     

{1, 3,  0   ,   20  ,  19   ,   7   ,   5   ,   0   ,   22  ,   23  ,   9   ,   12  ,   10  ,   15  ,   16  ,   17  ,  18},
{1,	1,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	2,	3	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	4,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	4,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	6	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	8	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	11	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	13	,	0	,	14	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},
{0,	0,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0	,	0},

 };
     
    public Cadeia consomeCaractere(String token, boolean parada, int posicao){
         
         
         int contadorChar=posicao;
        int estadoAtual=0;
        int  q, valorEstado=0, tipoCadeia;
         
         String cadeia="";

        boolean estadoDeParada = parada;
        estadoDeParada = parada;
         
            while(contadorChar < token.length()){

                if(estadoDeParada){
                    System.out.println("Contador de Char = "+contadorChar + "  Tamanho Token = " + token.length()+ "  ");
                    break;
                }


                switch(token.charAt(contadorChar)){
                   
                    
                    case ' ':
                        if(estadoAtual != 5) {
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia, tipoCadeia);
                            //System.out.println("Cadeia = " +objCadeia.getToken() +" " + "Tipo =" +objCadeia.getTipo());
                            estadoDeParada = true;
                            //estadoAtual = 0;
                            cadeia = "";

                        }
                            contadorChar++;
                            break;
                                            
                    case '.':
                        if( estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);

                            if (estadoAtual == 0 ) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                              //  System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                //System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
                            estadoAtual = 0;
                            cadeia = "";
                            }    
                        }
                        contadorChar++;
                    break;

                        
                    case ',':
                        if( estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                //System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
//                            cadeia = "";
//                            cadeia += token.charAt(contadorChar);
//                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
//                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                           //     System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                            estadoAtual = 0;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    case ';':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                               // System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
//                            cadeia = "";
//                            cadeia += token.charAt(contadorChar);
//                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
//                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                               // System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
                            estadoAtual = 0;
                            cadeia = "";
                            }
                        }
                        //contadorChar++;
                    break;
                        
                    case ':':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                               // System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    case '{':
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][6];
                        estadoAtual = valorEstado; 
                        contadorChar++; 
                    break; 
                        
                    case '}':
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][7];
                        estadoAtual = valorEstado; 
                        contadorChar++;  
                    break;
                        
                    case '(':
                        if(estadoAtual!=5){    
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                               // System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }
                        contadorChar++;
                    break;
                        
                    case ')':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                //System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                //System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    case '=':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                //System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                              //  System.out.println("Cadeia ="+objCadeia.getToken() + "Tipo ="+objCadeia.getTipo());
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    case '<':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                        
                    case '>':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    case '+':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }        
                        contadorChar++;
                    break;
                        
                    case '-':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                                objCadeia.classificaCadeia(cadeia,tipoCadeia);
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    case '*':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    case '/':
                        if(estadoAtual!=5){
                        q = estadoAtual;
                        valorEstado = MatrixAutomato[q][4];
                        estadoAtual = valorEstado;
                        cadeia += token.charAt(contadorChar);
                            if (estadoAtual == 0) {
                            cadeia = cadeia.substring(0, cadeia.length() - 1);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoDeParada = true;
                            cadeia = "";
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                            estadoAtual = 0;
                                estadoDeParada = true;
                            cadeia = "";
                            }
                        }    
                        contadorChar++;
                    break;
                        
                    default:

                        if (Character.isLetter(token.charAt(contadorChar)) && estadoAtual!=5) { //se For Letra

                            
                            q = estadoAtual;
                            valorEstado = MatrixAutomato[q][0];                            
                            estadoAtual = valorEstado;
                            cadeia += token.charAt(contadorChar);
                            
                            
                            if (estadoAtual == 0) {
                                cadeia = cadeia.substring(0, cadeia.length() - 1);
                                tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                                objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                cadeia = "";
                                cadeia += token.charAt(contadorChar);
                                tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                                objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoAtual = 0;
                                estadoDeParada = true;
                                cadeia = "";
                            }

                                contadorChar++; 
                                
                        }else if (Character.isDigit(token.charAt(contadorChar)) && estadoAtual!=5) { // Se for Numero
                            q = estadoAtual;
                            valorEstado = MatrixAutomato[q][1];
                            estadoAtual = valorEstado;
                            cadeia += token.charAt(contadorChar);
                                if (estadoAtual == 0) {
                                    
                                    cadeia = cadeia.substring(0, cadeia.length() - 1);
                                tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                                objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                    estadoDeParada = true;
                                cadeia = "";
                                cadeia += token.charAt(contadorChar);
                                tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, false);
                                objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoAtual = 0;
                                    estadoDeParada = true;
                                cadeia = "";
                                    

                                }
                                contadorChar++;  
                        }else{ 
                            if(estadoAtual!=5){
                            cadeia += token.charAt(contadorChar);
                            tipoCadeia = palavraReservada.verificaPalavraReservada(cadeia, true);
                            objCadeia.classificaCadeia(cadeia,tipoCadeia);
                                estadoDeParada = true;
                            cadeia = "";
                            estadoAtual = 0;
                            }
                            contadorChar++;
                            
                        }
                    break;
                
            }

        }
        objCadeia.setPosicao(contadorChar);
        return objCadeia;

    }

}
    
    



