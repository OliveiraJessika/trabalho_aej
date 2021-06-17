
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Abastecer;

/**
 *
 * @author Jessika Silva
 */
public class Main {

    private static String cor;

    
    public static void main(String[] args) {
        
    String opcao = "s";    
    
    
    List<Abastecer> listaAbastecer = new ArrayList<>(); 
    
    while(! opcao.equalsIgnoreCase("0")){
        String texto = "Digite sua opção: \n" +
                "1 - Adiciona Carro \n " +
                "2 - Remove Carro \n " +
                "3 - Mostra Carro \n " +
                "0 - Sair ";
    
        opcao = JOptionPane.showInputDialog(texto);
        
        switch (opcao){
            case "1":
                
                Abastecer a = new Abastecer();
                String nome = JOptionPane.showInputDialog("Nome do carro é: ");
                a.setNome(nome);
                
                String preco = JOptionPane.showInputDialog("Preço do carro é: " + nome);
                preco =  preco.replace(",",".");
                a.setPreco( Double.valueOf( preco ) );
                
                String cor = JOptionPane.showInputDialog("A cor do carro é: " + nome);
                a.setCor(cor);
                
                listaAbastecer.add(a);
                break;
                
            
            case "2":
                int posicao = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover"));
                listaAbastecer.remove(posicao -1);
            break;
            
            
            case "3":
                String conteudo = "";
                for(Abastecer abastecer : listaAbastecer){
                    conteudo += abastecer.getInformacoes() + "\n";
                }
        
            JOptionPane.showMessageDialog(null, conteudo);
            break;
            
            
            case "0":
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "opção invalida");
        }
        
    }
    
    }
    
}
