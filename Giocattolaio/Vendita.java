package Giocattolaio;

import java.util.ArrayList;
import java.util.List;

public class Vendita {
    
    
    
    public static void aggiungiGiocattolo(Giocattolo giocattolo, Cliente cliente)
    {
        cliente.getGiochiCliente().add(giocattolo); 
    }

}
