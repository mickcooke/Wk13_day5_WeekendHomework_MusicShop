package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getStockSize(){
        return this.stock.size();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }

    public double getTotalPotentialProfit(){
        double totalProfit = 0;
        for (ISell item : this.stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;

    }
}
