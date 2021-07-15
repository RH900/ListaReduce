/*
    Crie uma lista (streams) contendo as informações da tabela abaixo:

                                Nomes 
                                Paulo 
                                Camila 
                                Ana Maria 
                                Patrick 
                                Ana Clara 
                                Pedro 
                                Alfredo 

    • Mostre a concatenação dos nomes que começam com P separando-os por “,”
    • Mostre a concatenação dos nomes que começam com A separando-os por “,”
    • Mostre a concatenação de todos os nomes separando-os por “,”

 */
package listareduce2;

import java.util.Arrays;
import java.util.List;



public class ListaReduce2 {

   
    public static void main(String[] args) {
        
        
        List<String> myList = Arrays.asList(
              "Camila",
              "Paulo",
              "Patrick",
              "Ana Clara",
              "Pedro",
              "Alfredo");
        
        
        
        
        
        String result = myList
                .stream()
                .filter(name -> name.startsWith("P"))
                .reduce("Inicio com P: ", (name1, name2) -> name1.concat(name2 + ", "));
                System.out.println(result);
                
                
                
                
                
                String result2 = myList
                .stream()
                .filter(name -> name.startsWith("A"))
                .reduce("Incio com A: ", (name1, name2) -> name1.concat(name2 + ", "));
                System.out.println(result2);

        
                
                String result3 = myList
                .stream()
                .reduce("Todos os nomes: ", (name1, name2) -> name1.concat(name2 + ", "));
                System.out.println(result3);
        
    }
    
}
