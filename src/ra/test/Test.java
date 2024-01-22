package ra.test;

import ra.model.*;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setTenLoai("Mèo Dubai");
        cat.setGen((byte)1);
        System.out.println(cat);
        cat.makeSound();
        cat.inputData(new Scanner(System.in));
        Chicken chicken = new Chicken();
//        chicken.inputData();
        chicken.makeSound();

        IOData ioData = new IOData() {
            @Override
            public void inputData(Scanner sc) {

            }

            @Override
            public void displayData() {

            }
        };
        IOData ioData1 = new IOData() {
            @Override
            public void inputData(Scanner sc) {

            }

            @Override
            public void displayData() {

            }
        };
        Animals animals  = new Animals() {
            @Override
            public void makeSound() {

            }
        };



    }
}
