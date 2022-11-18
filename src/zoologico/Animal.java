/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author User
 */
public class Animal {

    private String nome;
    private String especie;
    private int idade;
    
   public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	} 
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie=especie;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	
        // Criando Construtor
	
	public  Animal(String nome,String especie, int idade) {
		this.nome=nome;
		this.especie=especie;
		this.idade=idade;
	}
        
        // Sobrecarga 
	// sobrecarregando o metodo construtor
	// sobrecarga de uma classe difenciam se pela sua assibatura , assinatura(nome do metodo, e tipos de parametros)
	public  Animal(String nome, String especie) {
		this.nome=nome;
		this.especie=especie;
	}
	public  Animal(String nome,int  idade) {
		this.nome=nome;
		this.idade=idade;
	}
        
        
	public String emitirBarulho() {
		 return " Emitindo barulho";
	}
	
	
	public boolean ehAdulto() {
		return  this.idade>1;
	}

}
