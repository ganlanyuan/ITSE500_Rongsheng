package edu.oit.lesson9;

import java.util.Arrays;
import java.util.List;

public enum CookBook {
    YUXIANGROUSI, DISANXIAN, MUXUROU, ZIRANNIUROU, SHUIZHUYU;
    
    private Meat meat;
    private List<Vegetable> vegetable;
    
    public static void main(String[] args) {
        CookBook.YUXIANGROUSI.setMeat(Meat.FISH);
        CookBook.YUXIANGROUSI.setVegetable(Arrays.asList(Vegetable.ONION, Vegetable.PEPPER));
        CookBook.DISANXIAN.setVegetable(Arrays.asList(Vegetable.POTATO, Vegetable.PEPPER));
        CookBook.MUXUROU.setMeat(Meat.PORK);
        CookBook.MUXUROU.setVegetable(Arrays.asList(Vegetable.ONION, Vegetable.FUNGUS, Vegetable.CARROT));
        CookBook.ZIRANNIUROU.setMeat(Meat.BEEF);
        CookBook.ZIRANNIUROU.setVegetable(Arrays.asList(Vegetable.ONION));
        CookBook.SHUIZHUYU.setMeat(Meat.FISH);
        CookBook.SHUIZHUYU.setVegetable(Arrays.asList(Vegetable.CABBAGE, Vegetable.PEPPER));
        
        for (CookBook item : CookBook.values()) {
            System.out.printf("%-12s %s %-5s %s %s\n", item.name(), " ==> meat: ", item.meat, "vegetables: ", item.vegetable);
        }
    }
    
    public Meat getMeat() {
        return meat;
    }
    public void setMeat(Meat meat) {
        this.meat = meat;
    }
    public List<Vegetable> getVegetable() {
        return vegetable;
    }
    public void setVegetable(List<Vegetable> vegetable) {
        this.vegetable = vegetable;
    }
    
}
