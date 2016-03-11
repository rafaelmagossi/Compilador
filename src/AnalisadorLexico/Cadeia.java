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
public class Cadeia {
    
    private String tipo;
    private String token;
    private int posicao;
    
    public String getTipo() {
        return tipo;
    }

    public String getToken() {
        return token;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getPosicao() {
        return posicao;
    }
    
    public void classificaCadeia(String token, int id){
        this.token = token;
        switch(id){
            case 1: this.tipo = "id"; break;  
            case 2: this.tipo = token; break;
            case 3: this.tipo = "erro"; break;
            case 4: this.tipo = "Final"; break;
            case 5: this.tipo = "Comentario"; break;


        }
    }
    
}
