/*

    Utilizando os conceitos de reduce da aula, utilize os métodos abordados para fazer 
    este exercício. Crie um programa que:
    a) Gere uma lista com 100 números aleatórios:
    • Mostre a soma de todos, usando reduce
    • Mostre a multiplicação de todos, usando reduce
    • Mostre o menor número, usando reduce
    • Mostre o maior número, usando reduce


*/







package listareduce1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;



public class ListaReduce1 {

    
    public static void main(String[] args) {
       
        int i ;
    ArrayList<Integer> mylist = new ArrayList<>();
   
    Random random = new Random();
    
         for (i = 0; i < 100; i++)
    {
        mylist.add(random.nextInt());
        
    }
        
         Optional<Integer> soma = mylist
                 .stream()
                 .reduce((n1, n2) -> n1 + n2);
         System.out.println("Soma: "+ soma.get());
         
         
         
         
          
	    Integer multiplyList = mylist
              .stream()
	      .reduce(1, (a, b) -> 1*(a * b));
	    System.out.println("multiplicaçao: " + multiplyList);
        

            Integer minValue = mylist
                    .stream()
                    .reduce(1, (n1,n2) -> Math.min(n1, n2));
                    
            System.out.println("menor valor: " + minValue);
            
            
            
            
            
            
            
            
            
            
            Integer maxValue = mylist
                    .stream()
                    .reduce(1, (n1,n2) -> Math.max(n1, n2));
                    
            System.out.println("menor valor: " + maxValue);
            
            
            
            
    }
    
}
