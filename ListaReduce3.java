/*
    Utilizando o método reduce, escreva um programa que receba um número e 
    calcule o fatorial deste número

*/






package listareduce3;

import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.stream.LongStream;










public class ListaReduce3 {

   
    public static void main(String[] args) {
        
        
        
        IntFunction<Long> fatorialCalc = ListaReduce3::fatorial;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n = scan.nextInt();
        
        
       
        
        long fact = fatorialCalc.apply(n);
        System.out.println("Fatorial de " + n + " e "+ fact);
    }
    
    public static long fatorial(int n){
        if (n < 0){
            String erro ="Numero invalido";
            throw new IllegalArgumentException(erro);
        }
        if (n==0){
            return 1;
        }
        else {
            return LongStream
                    .rangeClosed(1, n)
                    .reduce(1, (long n1, long n2) -> n1*n2);
        }
        
    }
}
