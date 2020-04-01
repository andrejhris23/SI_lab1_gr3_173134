package Item.java
import java.util.LinkedList;
import java.util.List;


public class Receipt {
    List<Item> itemList;

    public Receipt(List itemList){
        itemList = new List<>();
    }

    void addItem(Item item){
        itemList.add(item);
    }

    void removeItem(Item item){
        itemList.remove(item);
    }

    void calculatePrice() {
        int total;
        for(Item i: itemList) {
            total+= i.getPrice();
        }
    }

}