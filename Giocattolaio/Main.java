package Giocattolaio;

public class Main {
    public static void main(String[] args) {
        Giocattolo giocattolo1 = new Giocattolo("Spada Laser", 25.50, 12, 1000);
        Giocattolo giocattolo2 = new Giocattolo("Casa Barbie", 69.99, 8, 1000);

        Cliente cliente1 = new Cliente("Alessandro", "ale@gmail.com"); 

        cliente1.acquistaGioco(giocattolo2, cliente1);
    }

    
    
}
