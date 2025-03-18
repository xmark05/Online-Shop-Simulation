package subclasses;

import Interfaces.IRabattierbar;
import abstract_classes.Produkt;

public class Buch extends Produkt implements IRabattierbar {

    public Buch(int preis, String name, String kategorie) {
        super(preis, name, kategorie);
    }

    @Override
    public double berechneRabatt() {
        return getPreis() * 0.90; // 10% Rabatt
    }

    

    
}