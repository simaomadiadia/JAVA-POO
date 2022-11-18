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
        // TODO code application logic here
       Animal animal= new Animal();
       animal.setNome("gato");
        System.out.println(animal.getNome());
       
    }
    
}
