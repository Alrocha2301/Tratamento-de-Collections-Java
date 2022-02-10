/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

//import java.util.ArrayList;
import java.util.*;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        /*List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        meusGatos.sort(Comparator.comparing(Gato::getNome));*/

        //Gato gato1 = new Gato("Jon", 18, "preto");
        Gato gato2 = new Gato("Simba", 6, "tigrado");
        Gato gato3 = new Gato("Jon", 12, "amarelo");

        List<Gato> meusGatos = new ArrayList<>();

        meusGatos.add(new Gato("Jon", 18, "preto"));
        meusGatos.add(gato2);
        meusGatos.add(gato3);

        meusGatos.sort(Comparator.comparing(Gato::getNome));

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);// método da classe Collection para aleatório
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos); //metodo da classe collections para ordenar
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{ //criando classe Gato(semelhante a Struct de C++) e implementa a classe Comparable<o que será comparado>
    private String nome; //atribustos da classe Gato
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) { //criando variável do tipo "Gato"
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() { //atribuindo nome utilizando Getter
        return nome;
    }

    public Integer getIdade() { //atribuindo idade utilizando Getter
        return idade;
    }

    public String getCor() { //atribuindo Cor utilizando Getter
        return cor;
    }

    @Override //sobrescrever para imprimir as informações na tela... sem isso, é impresso os endereços de memória
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override //
    public int compareTo(Gato a) { //sobrescrever para metodo compareTo(utilizando Gato gato como parâmentro)
        return this.getNome().compareToIgnoreCase(a.getNome()); //metodo para comparar
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());//metodo para comparar
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());//metodo para comparar
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}