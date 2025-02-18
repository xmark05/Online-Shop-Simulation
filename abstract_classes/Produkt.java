package abstract_classes;

public abstract class Produkt {

    private int preis;
    private String name;
    private String kategorie;

    public Produkt(int preis, String name, String kategorie) {
        this.preis = preis;
        this.name = name;
        this.kategorie = kategorie;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }
    

    public abstract double berechneRabatt();
}