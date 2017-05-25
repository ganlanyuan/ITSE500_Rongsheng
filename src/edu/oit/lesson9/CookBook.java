package edu.oit.lesson9;

import java.util.Arrays;
import java.util.List;

public enum Cookbook {
    YUXIANGROUSI, DISANXIAN, MUXUROU, ZIRANNIUROU, SHUIZHUYU;
    
    private Meat meat;
    private List<Vegetable> vegetable;
    
    public static void main(String[] args) {
        Cookbook.YUXIANGROUSI.setMeat(Meat.FISH);
        Cookbook.YUXIANGROUSI.setVegetable(Arrays.asList(Vegetable.ONION, Vegetable.PEPPER));
        Cookbook.DISANXIAN.setVegetable(Arrays.asList(Vegetable.POTATO, Vegetable.PEPPER));
        Cookbook.MUXUROU.setMeat(Meat.PORK);
        Cookbook.MUXUROU.setVegetable(Arrays.asList(Vegetable.ONION, Vegetable.FUNGUS, Vegetable.CARROT));
        Cookbook.ZIRANNIUROU.setMeat(Meat.BEEF);
        Cookbook.ZIRANNIUROU.setVegetable(Arrays.asList(Vegetable.ONION));
        Cookbook.SHUIZHUYU.setMeat(Meat.FISH);
        Cookbook.SHUIZHUYU.setVegetable(Arrays.asList(Vegetable.CABBAGE, Vegetable.PEPPER));
        
        for (Cookbook item : Cookbook.values()) {
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
