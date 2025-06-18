package util;

import entities.Shopping;

import java.util.List;

public class Operations {
    public static Shopping addItem(List<Shopping> list, String name, Integer quantity, Double price) {
        for (Shopping shopping : list) {
            if (shopping.getName().equals(name)) {
                System.out.println("Item já existe na lista. Atualizando quantidade e preço.");
                shopping.setQuantity(shopping.getQuantity() + quantity);
                shopping.setPrice(price);
                return shopping;
            }
        }
        list.add(new Shopping(name, quantity, price));
        return null;
    }

    public static Shopping removeItem(List<Shopping> lista, String remove) {
        for (Shopping shopping : lista) {
            if (shopping.getName().equals(remove)) {
                lista.remove(shopping);
                return shopping;
            }
        }
        return null;
    }
}
