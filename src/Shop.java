import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        LinkedList<HashMap<String, String>> wareHouse = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        String menu = """
                ____МЕНЮ____
                1.Добавить товар
                2.Вывести все товары
                3.Удалить товар
                4.Изменить количество товара
                5.Выход
                """;
        int choice;

        while (true){
            System.out.println(menu);
            try{
                choice = in.nextInt();
                switch (choice) {
                    case 1 -> wareHouse.add(NewProduct.getProduct());
                    case 2 -> {
                        if (wareHouse.size() == 0) {
                            System.out.println("Склад пуст");
                        }
                        else System.out.println(wareHouse);
                    }
                    case 3 -> NewProduct.removeProduct(wareHouse);
                    case 4 -> NewProduct.changeCount(wareHouse);
                    case 5 -> {
                        System.out.println("Выходим из программы...");
                        System.exit(0);
                    }
                    default -> System.out.println("Нет такого пункта меню попробуйте еще раз");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Нет такого пункта меню попробуйте еще раз");
            }
            in.nextLine();
        }
    }
}



