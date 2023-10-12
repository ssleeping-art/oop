/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem;

interface printable{
void print();
void print2();
void print3();
void print4();
void print5();
}
abstract class showable implements printable{

public void print(){System.out.println("print")
public void print2(){System.out.println("print 2");}
}

class show extends showable{

public void print3(){System.out.println("print 3");}
public void print4(){System.out.println("print 4");}
public void print5(){System.out.println("print 5");}
}


public class Problem extends show {

   
    public static void main(String[] args) {
   Problem obj = new Problem() ;
   obj. print();
   obj. print2();
   obj. print3();
   obj. print4();
   obj. print5();

   
    }
    
}
