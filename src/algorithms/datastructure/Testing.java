/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.datastructure;

/**
 *
 * @author khaled.selim
 */
public class Testing {
    /**
     * @param args the command line arguments
     */
    class Exc0 extends Exception{}
    class Exc1 extends Exc0{}
    public static void main(String[] args) {
        try{
        int x = 100;
        double y = 100.1;
        boolean z = (x==y);
            System.out.println();
        }
        catch(RuntimeException ex)
        {
            System.out.println("B");
        }
        catch(Exception ex)
        {
            System.out.println("C");
        }
        finally{
            System.out.println("D");
        }
            System.out.println("E");
    }
    public static void badMethod(){
        throw new RuntimeException();
    }
}
