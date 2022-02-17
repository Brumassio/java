package ArrayList;
import java.util.ArrayList;

class ExemploArrayList { 

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Molina");
        list.add("Chatalov");
        list.add("Douglas");
        list.add("Biscaia");
        list.add("Guras Rodrigues");
        list.add("Beluomini");
        list.add("Bird BR");
        list.add("Rodrigo Holanda");

        //imprimeFor(list);
        System.out.println("***************** Inscritos no processo seletivo PET-INFO UEM ***********************8");
        imprime2(list);
        System.out.println("\nTamanho do arraylist: "+list.size());
        System.out.println("Último elemento do arraylist: "+list.get(list.size()-1));
        System.out.println("\nTrocando o elemento da posição 0\n");
        list.set(0,"Molina fofo");
        imprime2(list);
        
        System.out.println("\nTrocando o elemento da última posição\n");
        list.set(list.size()-1,"Rodrick Netherlands");
        imprime2(list);
        System.out.println("\nRemovendo o elemento 3 !!\n");
        list.remove(3);
        imprime2(list);
        
        System.out.println("\nAdicionando Vini camasso na posição 2\n");
        list.add(0,"Vini do Camasso");
        imprime2(list);
        
        //cópia por referência
        System.out.println("\n\n** Lista copia ! **\n ");   
        ArrayList<String> listcopy = list;
        
            

        imprime2(listcopy);
        
        //cópia da lista por valor (creio eu) 
        System.out.println("\n\n** Lista divertida **\n ");
        ArrayList<String> listaDivertida = new ArrayList<String>(list);
        listaDivertida.add(0,"Linear sorriso e palminha");
        imprime2(listaDivertida);
        
        
        System.out.println("\n\n** Lista original ! ** \n ");        
        imprime2(list);
        
        

    }
    
    static public void imprimeFor(ArrayList<String> list)
    {
        for(String element : list)
        {
            System.out.println(element);
        }
    }

    static public void imprime2(ArrayList<String> list)
    {
        list.forEach((element) -> {
            System.out.println(element);
        });
    }
}