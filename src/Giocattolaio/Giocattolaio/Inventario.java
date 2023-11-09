package Giocattolaio.Giocattolaio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    // Tiene traccia dei giocattoli disponibili
    static List<Giocattolo> listaGiocattoli = new ArrayList<>();
    
    public Inventario() {
        listaGiocattoli.add(new Giocattolo("Pallone", 10.00, 5, 10));
        listaGiocattoli.add(new Giocattolo("Spada Laser", 25.50, 12, 1000));
        listaGiocattoli.add(new Giocattolo("Casa Barbie", 69.99, 8, 1000));
        listaGiocattoli.add(new Giocattolo("Macchinina", 15.00, 3,1000));
        listaGiocattoli.add(new Giocattolo("Puzzle", 20.00, 5, 100));
        listaGiocattoli.add(new Giocattolo("Bambola", 30.00, 5, 100));
        listaGiocattoli.add(new Giocattolo("Robot", 50.00, 5, 200));
        listaGiocattoli.add(new Giocattolo("Cucina", 100.00, 5, 250));
        listaGiocattoli.add(new Giocattolo("Lego", 40.00, 5, 300));
        listaGiocattoli.add(new Giocattolo("Treno", 80.00, 5, 700));
    }

    public static void mostraInventario()
    {
        System.out.println("Giocattoli disponibili: ");
        for (Giocattolo giocattolo : listaGiocattoli)
        {
            System.out.println(giocattolo.getNome() + " " + giocattolo.getPrezzo() + " " + giocattolo.getEtaConsigliata() + " " + giocattolo.getDisponibilita());
        }
    }


    public static void aggiungiGiocattolo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del giocattolo: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il prezzo del giocattolo: ");
        double prezzo = scanner.nextDouble();
        System.out.println("Inserisci l'età minima per giocare con il giocattolo: ");
        int etaConsigliata = scanner.nextInt();
        System.out.println("Inserisci la quantità di giocattoli: ");
        int disponibilita = scanner.nextInt();
        Giocattolo giocattolo = new Giocattolo(nome, prezzo, etaConsigliata, disponibilita);
        listaGiocattoli.add(giocattolo);
        scanner.close();
    }

    public static void rimuoviGiocattolo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del giocattolo da rimuovere: ");
        String nome = scanner.nextLine();
        for (Giocattolo giocattolo : listaGiocattoli)
        {
            if (giocattolo.getNome().equals(nome))
            {
                listaGiocattoli.remove(giocattolo);
                System.out.println("Giocattolo rimosso con successo");
                break;
            }
        }
        scanner.close();
    }
}
