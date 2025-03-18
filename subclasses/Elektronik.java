package subclasses;

import Interfaces.IRabattierbar;
import abstract_classes.Produkt;

public class Elektronik extends Produkt implements IRabattierbar{

    public Elektronik(int preis, String name, String kategorie) {
        super(preis, name, kategorie);
    }
    
    @Override
    public double berechneRabatt() {
        return getPreis() * 0.80; // 20% Rabatt
    }

    
}