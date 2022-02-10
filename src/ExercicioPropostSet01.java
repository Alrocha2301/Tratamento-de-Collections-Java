/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class ExercicioPropostSet01 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto com as cores do arco-íris.");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Violeta");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Vermelho");
        System.out.println(coresArcoIris);

        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println("\nb) Quantidade de cores: " + coresArcoIris.size());

        System.out.println("\nc) Exiba as cores em ordem alfabética;\n");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("\nd) Exiba as cores na ordem inversa da que foi informada: \n");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("Violeta", "Laranja", "Amarelo", "Vermelho", "Anil", "Azul", "Verde"));
        System.out.println(coresArcoIris3);
        List<String> coresList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("\ne) Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if (cor.startsWith("V")) System.out.println(cor);
        }

        System.out.println("\nf) Remova todas as cores que não começam com a letra “V”: ");
        Iterator<String> a = coresArcoIris.iterator();
        while (a.hasNext()) {
            if (a.next().startsWith("V")) a.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("\ng) Limpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("\nh) Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());

    }
}
