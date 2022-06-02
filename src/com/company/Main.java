package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x ");
        int x = scanner.nextInt();
        System.out.print("Введите y ");
        int y = scanner.nextInt();
        System.out.print("Введите z ");
        int z = scanner.nextInt();
        Formula did = new Formula(x,y,z);
        did.displayFormula();
        try{
            int result=Formula.getFormula(1);
            System.out.println(result);
        }
        catch (FormulaException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

    }
}
 class Formula {
    float x;
    float y;
    float z;
    public Formula(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void displayFormula() {
        double vector = Math. sqrt( Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2) );
        System.out.println(vector);
    }
     public static int getFormula(int scanner) throws FormulaException {
         int result = 1;
         if (scanner < 0) throw new FormulaException (" Число меньше 0 ", scanner);
         for (int p = 0; p <= scanner; p++) {
             result *= p;
         }
         return result;
     }
 }
class FormulaException extends Exception {
    private int number;

    public int getNumber() {

        return number;
    }

    public FormulaException(String message, int scanner) {
        super(message);
        number = scanner;
    }
}