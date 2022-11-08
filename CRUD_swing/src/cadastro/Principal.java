package cadastro;

import database.DB;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
       CadConta tela = new CadConta();       
       tela.setLocationRelativeTo(null);//Define a posição como null, centro da tela
       tela.setResizable(false);//Não permite o usuário redimencionar a tela
       tela.setVisible(true);//Apresenta a tela      
    }
    
}
