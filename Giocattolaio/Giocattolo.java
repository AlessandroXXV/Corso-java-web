package Giocattolaio;

public class Giocattolo {
    private static Integer id = 1; 
    private String nome; 
    private int prezzo; 
    private int etaConsigliata;

    public Giocattolo(int id, String nome, int prezzo, int etaConsigliata) {
        id++;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getEtaConsigliata() {
        return etaConsigliata;
    }

    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }     

    
    
}