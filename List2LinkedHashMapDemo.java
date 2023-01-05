import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class List2LinkedHashMapDemo {
    public static void main(String[] args) {
        List<Item> itemList = Arrays.asList(
            new Item("broom", 1200, "a-company"),
            new Item("dustpan", 800, "a-company"),
            new Item("bucket", 2000, "z-company")
        );
        itemList.stream().forEach(System.out::println);

        // Stream API
        LinkedHashMap<String, Integer> itemMap = itemList.stream()
            .collect(Collectors.toMap(
                Item::getName, Item::getPrice, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(itemMap);
    }

    public static class Item {
        String name;
        int price;
        String maker;

        public Item(String name, int price, String maker) {
            setName(name);
            setPrice(price);
            setMaker(maker);
        }

        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getMaker() {
            return maker;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        @Override
        public String toString() {
            return "name=" + this.getName() + ", price=" + this.getPrice() + ", maker=" + this.getMaker();
        }
    }
}
