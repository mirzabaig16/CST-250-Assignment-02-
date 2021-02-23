package edu.ru.javadatatypes;


public class MainClass {
  
public static int addAllDigits( int inputNumber){
    
    String temp = String.valueOf(inputNumber);
    int count = 0;
    for (int i = 0; i < temp.length(); i++)
    {
        count += Integer.parseInt(temp.charAt(i)+"");
  
    }        
    return count; 
}
    public static void main(String[] args) {
        
        int result = addAllDigits(350);
        System.out.println(result);
 
    }
}