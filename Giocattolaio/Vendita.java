package Giocattolaio;

import java.util.ArrayList;
import java.util.List;

public class Vendita {
    
    List<Giocattolo> giocattoli = new ArrayList<>(); 
    
    public void aggiungiGiocattolo(Giocattolo giocattolo)
    {
        giocattoli.add(giocattolo); 
    }

}
