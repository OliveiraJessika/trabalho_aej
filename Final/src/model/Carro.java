package model;

/**
 *
 * @author Jessika Silva
 */

import java.util.List;


public abstract class Carro {


    public String nome;
    protected double preco;
    public String cor;
    
    public Carro(){
    }
        
    public Carro(String nome){
        this.nome = nome;
       }
    
    public Carro(double preco){
        this.preco = preco;
    }
    
    public Carro(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
     
    
    public Carro(String cor, String nome){
    this.nome = nome;
    this.cor = cor;
    }
    
    public Carro(String nome, double preco, String cor){
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
    }
        
    
    public abstract void excluir();
    
    protected abstract void zerar();
    
    public abstract void mostrar();
    
    public String getInformacoes(){
        return "{ 'nome': '" + nome + "' , 'preco': " +preco+ " ,  'cor': " + cor + " }";
    }
    
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public double getPreco(){
        return preco;
    }
    
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    
    public String getCor(){
        return cor;
    }
    
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    
    
    
}


    

