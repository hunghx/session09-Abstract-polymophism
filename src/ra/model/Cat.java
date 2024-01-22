package ra.model;

import java.util.Scanner;

public class Cat extends Animals implements IOData{
    @Override
    public void makeSound() {
        System.out.println("Mèowwwwwwwwwwwwwwwwwwww");
    }

    @Override
    public void inputData(Scanner sc) {

    }

    @Override
    public void displayData() {

    }


}
