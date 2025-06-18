package application;

import entities.Shopping;
import util.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de lista de compras");

        int option = 0;

        List<Shopping> shoppingList = new ArrayList<>();
        List<Operations> operationsList = new ArrayList<>();

        do {
            System.out.println("[1] - Adicionar item\n[2] - Remover itens\n[3] - Listar itens\n[4] - Editar itens\n[5] - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Adicionar item: ");
                    String item = sc.nextLine();

                    System.out.print("Quantidade: ");
                    Integer quantity = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Preço: ");
                    Double price = sc.nextDouble();
                    sc.nextLine();

                    Operations.addItem(shoppingList ,item, quantity, price);
                    break;
                case 2:
                    System.out.println("Remover itens: ");
                    if (shoppingList.isEmpty()) {
                        System.out.println("Não há itens na lista.");
                    } else {
                        System.out.print("Qual o nome do item que deseja remover? ");
                        String itemToRemove = sc.nextLine();

                        Operations.removeItem(shoppingList, itemToRemove);
                    }
                    break;
                case 3:
                    System.out.println("Listar itens: ");
                    if (shoppingList.isEmpty()) {
                        System.out.println("Não há itens na lista.");
                    } else {
                        for (Shopping shoppingItem : shoppingList) {
                            System.out.printf("Item: %s, Quantidade: %d, Preço: R$ %.2f, Valor total: R$ %.2f\n", shoppingItem.getName(), shoppingItem.getQuantity(), shoppingItem.getPrice(), shoppingItem.getTotal());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Editar itens: ");
                    if (shoppingList.isEmpty()) {
                        System.out.println("Não há itens na lista.");
                    } else {
                        System.out.print("Qual o nome do item que deseja editar? ");
                        String itemToEdit = sc.nextLine();

                        for (Shopping shoppingItem : shoppingList) {
                            if (shoppingItem.getName().equals(itemToEdit)) {
                                System.out.print("Novo nome: ");
                                String newName = sc.nextLine();

                                System.out.print("Nova quantidade: ");
                                Integer newQuantity = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Novo preço: ");
                                Double newPrice = sc.nextDouble();
                                sc.nextLine();

                                shoppingItem.setName(newName);
                                shoppingItem.setQuantity(newQuantity);
                                shoppingItem.setPrice(newPrice);
                                System.out.println("Item atualizado com sucesso!");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        } while (option != 5);
    }
}