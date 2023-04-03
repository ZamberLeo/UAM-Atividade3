import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Stack<Integer> stackList = new Stack<>();
        Queue<Integer> queueNumber2 = new LinkedList<>();
        int i;

        //Inserir os números [1, 2, 3, 4 e 5] na lista
        for (i = 1; i <= 5; i++) {
            numberList.add(i);

        }

        System.out.println("Número de elementos da lista: " + numberList.size());
        System.out.println("Seguem os números na lista: ");
        while(!numberList.isEmpty()){
            //Remove o próximo elemento da lista e dando para uma variável temporária
            int internalList = numberList.remove(0);
            //Imprime o número da lista em ordem
            System.out.printf("%d ", internalList);
            //Adiciona o elemento da lista à pilha em ordem
            stackList.push(internalList);

        }

        if (numberList.isEmpty()) {
            System.out.println("\nFazendo Passo 2, minha lista está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha lista tinha que estar vazia.");

        }

        System.out.println("Número de elementos da pilha: " + stackList.size());

        System.out.println("Seguem os números na pilha: ");
        while(!stackList.isEmpty()) {
            //Remove o elemento da pilha e dando para uma variável temporária
            int internalStack = stackList.pop();
            //Imprime o número da pilha em ordem
            System.out.printf("%d ", internalStack);
            //Adiciona o número da pilha à fila em ordem
            queueNumber2.add(internalStack);

        }

        if (stackList.isEmpty()) {
            System.out.println("\nFazendo Passo 3, minha pilha está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha pilha tinha que estar vazia.");
        }

        //Verifica o número de elementos na Fila
        System.out.println("No momento tenho o seguinte número de elementos na minha fila: " + queueNumber2.size());
        System.out.println("Vamos ver quais são os elementos da minha fila e em que ordem estão?");

        for(Integer queueNumber1: queueNumber2){
            System.out.printf("%d ", queueNumber1);
        }

        //Repete passos 2 e 3 com os números [6, 7, 8, 9 e 10];
        //Insere os números [6, 7, 8, 9 e 10] na lista
        for (i = 6; i <= 10; i++) {
            numberList.add(i);

        }

        System.out.println("\nNúmero de elementos da lista na segunda rodada de inserção: " + numberList.size());
        System.out.println("Seguem os números na lista na segunda rodada: ");
        while(!numberList.isEmpty()){
            //Remove o próximo elemento da lista e dando para uma variável temporária
            int internalList = numberList.remove(0);
            //Imprime o número da lista na ordem
            System.out.printf("%d ", internalList);
            //Adiciona o elemento da lista à pilha na ordem
            stackList.push(internalList);
        }

        if (numberList.isEmpty()) {
            System.out.println("\nFazendo Passo 2, minha lista está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha lista tinha que estar vazia.");
        }

        System.out.println("Número de elementos da pilha: " + stackList.size());
        System.out.println("Seguem os números na pilha na segunda rodada: ");
        while(!stackList.isEmpty()) {
            //Remove o elemento da pilha e dando para uma variável temporária
            int internalStack = stackList.pop();
            //Imprime o número da pilha na ordem
            System.out.printf("%d ", internalStack);
            //Adiciona o número da piljha à fila na ordem
            queueNumber2.add(internalStack);
        }

        if (stackList.isEmpty()) {
            System.out.println("\nFazendo Passo 3, minha pilha está vazia!");
        } else {
            System.out.println("\nOops, deu algo errado, minha pilha tinha que estar vazia.");
        }

        //Imprime tamanho da Fila e os elementos da Fila
        System.out.println("O tamanho final da minha fila será de: " + queueNumber2.size());
        System.out.println("Seguem os números na fila em ordem depois de todas as inserões: ");
        for(Integer queueNumber1 : queueNumber2){
            System.out.printf("%d ", queueNumber1);
        }

    }
}