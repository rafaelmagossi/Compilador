/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManipulaIO;

/**
 *
 * @author RafaelMq
 */
public class Token {
    
    private int numeroLinha;
    private String tokenDaLinha;

            public int getNumeroLinha() {
                return numeroLinha;
            }

            public String getTokenDaLinha() {
                return tokenDaLinha;
            }

            public Token (int numeroLinha, String tokenDaLinha) {
            this.numeroLinha = numeroLinha;
            this.tokenDaLinha = tokenDaLinha;
            }
    
}
