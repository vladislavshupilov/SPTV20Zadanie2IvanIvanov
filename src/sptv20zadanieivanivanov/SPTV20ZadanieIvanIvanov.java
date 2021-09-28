/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20zadanieivanivanov;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class SPTV20ZadanieIvanIvanov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int z, x, c, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Введите первое однозначное число: ");  //ввод данных
z = sc.nextInt();  
System.out.print("Введите второе однозначное число: ");  
x = sc.nextInt();  
System.out.print("Введите третье однозначное число: ");  
c = sc.nextInt();  
sum = sum(z, x, c);  
System.out.println("Сумма всех чисел равна: " +sum);  
}   
public static int sum(int a, int b, int c)  
{  
int sum = a + b + c;  
return sum;  
}  
}  

