
import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

/*        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        //notas.add(4.6);
        //System.out.println(notas.toString());
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0); //método de adicionar na posição solicitada (posição, valor)
        //notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        //notas.set(notas.indexOf(5d), 6.0); //método de substituição (valor que sai, valor que entra)
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //método para procurar elemento na lista (elemento)

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);
        //for (Double nota : notas) laço para exibir lista por linhas

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); //método para pegar o elemento da posição (posiçao)
        //System.out.println(notas.toString());
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //método de Collections para pegar menor número

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); //método de Collections para pegar o maior

        Iterator<Double> a = notas.iterator(); //criando variável "a" do tipo Iterator com conteúdo Double, e chamando metodo iterator para notas
        Double soma = 0d;
        while(a.hasNext()){ //enquanto a tiver próximo elemento
            Double next = a.next(); //pega o próximo elemento existente e coloca na variável "next"
            //soma += next;
            soma = soma + next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: "); // método para remover elemento (valor)
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0"); //método para remover elemento (posição)
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> b = notas.iterator();
        while(b.hasNext()) {
            Double next = b.next();
            if(next < 7) b.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear(); //metodo para apagar toda a lista
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
*/
/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
*/

        System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista: ");

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.peekFirst());
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.pollFirst());
        System.out.println(notas2);

        System.out.println("Adicione um elemento no início da lista: ");
        notas2.addFirst(2.6);
        System.out.println(notas2);

        System.out.println("Adicione uma nota no fim da lista");
        notas2.addLast(8.8);
        System.out.println(notas2);





    }
}