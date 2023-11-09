package Giocattolaio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    static List<Cliente> listaClienti = new ArrayList<>();
    
    public static void main(String[] args) {
        
        // Istanzio un oggetto della classe Inventario per popolare la lista di giocattoli
        Inventario inventario = new Inventario();
        
        Admin admin = new Admin("Alessandro", "12345");

        Cliente cliente1 = new Cliente("Alessandro", "1234"); 
        Cliente cliente2 = new Cliente("Gigio", "gigio@gmail.com"); 


        // Lista statica che memorizza il numero di clienti
        Cliente.getListaClienti().add(cliente1); 
        Cliente.getListaClienti().add(cliente2); 

       
       

        
        // Interfaccia 
        Interfaccia.accessoAlSito();


    }

    
    
}
