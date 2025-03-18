package subclasses;

import Interfaces.IRabattierbar;
import abstract_classes.Produkt;

public class Kleidung extends Produkt implements IRabattierbar {

    public Kleidung(int preis, String name, String kategorie){
        super(preis,name,kategorie);
    }

    @Override
    public double berechneRabatt() {
        return getPreis() * 0.95; // 5% Rabatt
        
    }

    
}