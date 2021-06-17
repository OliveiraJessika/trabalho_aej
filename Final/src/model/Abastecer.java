
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Jessika Silva
 */
public class Abastecer extends Carro{
    
    public double combustivelRecomendado;
    public static final double abastecimentoMaximo = 50;
    
    public Abastecer(){
    }
    
    public Abastecer(String nome){
        super(nome);
    }
    
    
    public Abastecer(double combustivelRecomendado, String nome){
    super(nome);
    this.combustivelRecomendado = combustivelRecomendado;
    }
    
    
    public Abastecer(double combustivelRecomendado, String nome, double preco, String cor){
    super(nome,preco,cor);
    this.combustivelRecomendado = combustivelRecomendado;
    }
    
    @Override
    public void excluir(){
        this.zerar();
        System.out.println("Modelo do carro" + nome + "excluido");
    }
    
    @Override
    public void zerar(){
     //   this.setCor();
        }
    
    @Override
    public void mostrar(){
        String texto = "Nome: " + nome + "\nPreço: " +   preco + "\nCor: " + cor + "\nCombustivel Recomendado: " + combustivelRecomendado;
        JOptionPane.showMessageDialog(null,texto);
    }
    
    @Override
    public String getInformacoes(){
        return "{ 'nome: '" + nome + "' , " 
                + " 'preco:' " + preco + " , "
                + " 'cor: " + cor + " , "
                + " 'combustivelRecomendado': " + combustivelRecomendado + " } ";
    }

    }
    
    
    
    
    
