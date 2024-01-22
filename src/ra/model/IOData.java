package ra.model;

import java.util.Scanner;

public interface IOData {
   int a = 10;
   void inputData(Scanner sc);
   void displayData();
   // phương thưc bình thường : static , default
   static void move(){

    }
    default void display(){

    }
}
