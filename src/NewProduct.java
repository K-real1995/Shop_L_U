import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class NewProduct {

    public static HashMap<String, String> getProduct(){
        HashMap<String, String> newProduct = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название товара: ");
        String name = in.nextLine();
        newProduct.put("name",name);
        System.out.println("Введите стоимость товара: ");
        String price = in.nextLine();
        newProduct.put("price",price);
        System.out.println("Введите количество товара: ");
        String count = in.nextLine();
        newProduct.put("count",count);
        return newProduct;
    }


    public static void removeProduct(LinkedList<HashMap<String, String>> wareHouse){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название товара который вы хотите удалить: ");
        String name = in.nextLine();
        for (int i = 0; wareHouse.size() > i; i++) {
            if(wareHouse.get(i).containsValue(name)){
                wareHouse.remove(i);
            }
        }
    }

    public static void changeCount(LinkedList<HashMap<String, String>> wareHouse){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название товара который вы хотите изменить: ");
        String name = in.nextLine();
        for (HashMap<String, String> stringStringHashMap : wareHouse) {
            if (stringStringHashMap.containsValue(name)) {
                Scanner input = new Scanner(System.in);
                System.out.println("Введите нужное количество товара: ");
                String count = input.nextLine();
                stringStringHashMap.replace("count", stringStringHashMap.get("count"), count);
            }
        }
    }
}
