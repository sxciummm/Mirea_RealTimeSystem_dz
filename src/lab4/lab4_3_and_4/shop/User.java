package lab4.lab4_3_and_4.shop;

import lab4.lab4_3_and_4.Computer.Computer;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private List<Computer> cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    public List<Computer> getCart() {return cart;}
    public String getPassword() {return password;}
    public String getLogin() {return login;}

    public void addToCart(Computer computer) {
        cart.add(computer);
        System.out.println("Компьютер добавлен в корзину! \n");
    }

    public void clearCart() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста! \n");
        }
        else {
            cart.clear();
            System.out.println("Корзина отчищена! \n");
        }
    }

    public double getCartTotal() {
        double total = 0.0;
        for (Computer computer : cart) {
            total += computer.getPrice();
        }
        return total;
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста! \n");
        }
        else {
            for (int i = 0; i< cart.size(); i++) {
                Computer computer = cart.get(i);
                System.out.println("Компьютер № " + (i+1) + ": ------------------------------- \n");
                computer.FullInfo();
            }
            System.out.println("Total: " + getCartTotal() + " RUB");
        }
    }
}
