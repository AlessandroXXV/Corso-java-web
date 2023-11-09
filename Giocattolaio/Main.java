package Giocattolaio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    static List<Cliente> listaClienti = new ArrayList<>();
    
    public static void main(String[] args) {
        Admin admin = new Admin("Alessandro", "12345");

       

        Cliente cliente1 = new Cliente("Alessandro", "1234"); 
        Cliente cliente2 = new Cliente("Gigio", "gigio@gmail.com"); 


        // Lista statica che memorizza il numero di clienti
        listaClienti.add(cliente1); 
        listaClienti.add(cliente2); 

       
       

        
        // Interfaccia 
        Interfaccia.accessoAlSito();


    }

    
    
}
