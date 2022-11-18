/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import zoologico.Animal;
/**
 *
 * @author User
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       /* Passando paramentros ao objectos por intermedio 
		 * Construtor criado dentro da classe 
		acessorias criados  devido ao encapsulamento*/
		Animal animal= new Animal("Gato","pelido",2);
                
                /*imprimindo as informacoes do objecto 
		*atraves dos metodos acessorios set */
		System.out.println(animal.getNome());
		System.out.println(animal.getEspecie());
		System.out.println(animal.getIdade());
		System.out.println();
    }
    
}
