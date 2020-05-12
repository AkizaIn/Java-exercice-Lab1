
package Question1;

//import java.util.*;

public class MultiplicationTable {

    private int  multiplicationNumber;
    private int rangeFrom;
    private int rangeTo;

    public MultiplicationTable() {
    }
    public MultiplicationTable(int multiplicationNumber, int rangeFrom, int rangeTo) {
        this.multiplicationNumber = multiplicationNumber;
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    public void setMultiplicationTable(int multiplicationNumber,int rangeFrom,int rangeTo) {
        this.multiplicationNumber = multiplicationNumber;
         this.rangeFrom = rangeFrom;
          this.rangeTo = rangeTo;
    }

    public int getMultiplicationTable() {
        return multiplicationNumber;
    }

    public int getRangeFrom() {
        return rangeFrom;
    }

    public int getRangeTo() {
        return rangeTo;
    }
    public void title(){
        System.out.print("Multiplication Table of");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print("Range from");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.println("Range To");
    }
    public void printTable(){
         
         System.out.print( multiplicationNumber);
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print( rangeFrom);
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(rangeTo);
         System.out.println();
         
        
    }
    
    
    public static void main(String[] args) {
        MultiplicationTable object1 = new MultiplicationTable();
        MultiplicationTable object2 = new MultiplicationTable();
         MultiplicationTable object3 = new MultiplicationTable(0,1,5);
        object1.setMultiplicationTable(3, 17, 27);
        object2.setMultiplicationTable(0, 1, 5);
        object3.setMultiplicationTable(17, 3, 49);
        object1.title();
        object1.printTable();
        object3.printTable();
        object2.printTable();
        
        
      
    }
    
}
