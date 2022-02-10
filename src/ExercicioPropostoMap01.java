/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265

 a) Substitua a população do estado RN por : 3.534.165
 b) Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277
 c) Exiba a população do estado PE:
 d) Exiba todos os estados e suas populaçãos na ordem em que foram informados:
 e) Exiba todos os estados e suas populações na ordem alfabética:
 f) Exiba o estado com o menor população e seu respectivo valor:
 g) Exiba o estado com a maior população e seu respectivo valor:
 h) Exiba a soma da população desses estados:
 i) Exiba a média da população deste dicionário de estados:
 j) Remova os estados com a população menor que 4.000.000:
 k) Apague o dicionario de estados com suas respectivas populações estimadas:
 l) Confira se a lista está vazia:
 */

import java.util.*;

public class ExercicioPropostoMap01 {
    public static void main(String[] args) {
        Map<String, Integer> estadosNE = new HashMap<>();
        estadosNE.put("PE", 9616621);
        estadosNE.put("AL", 3351543);
        estadosNE.put("CE", 9187103);
        estadosNE.put("RN", 3534265);

        System.out.println(estadosNE);

        System.out.println("\na) Substitua a população do estado RN por 3.534.165: ");
        estadosNE.put("RN", 3534165);
        System.out.println(estadosNE);

        System.out.print("\nb) Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277: ");
        boolean verificaPB = estadosNE.containsKey("PB");
        if (verificaPB == false) estadosNE.put("PB", 4039277);
        System.out.println(verificaPB);
        System.out.println(estadosNE);

        System.out.println("\nc) Exiba a população do estado PE: " + estadosNE.get("PE"));

        System.out.println("\nd) Exiba todos os estados e suas populaçãos na ordem em que foram informados:\n");
        Map<String, Integer> estadosNE2 = new LinkedHashMap<>();
        estadosNE2.put("PE", 9616621);
        estadosNE2.put("AL", 3351543);
        estadosNE2.put("CE", 9187103);
        estadosNE2.put("RN", 3534265);
        System.out.println(estadosNE2);

        System.out.println("\n e) Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estadosNE3 = new TreeMap<>(estadosNE);
        System.out.println(estadosNE3);

        System.out.println("\nf) Exiba o estado com o menor população e seu respectivo valor: ");
        Integer menorPopulacao = Collections.min(estadosNE.values());
        Set<Map.Entry<String, Integer>> populacoes = estadosNE.entrySet();
        String estadoMenosPopuloso;
        for (Map.Entry<String, Integer> populacao : populacoes) {
            if (populacao.getValue().equals(menorPopulacao)) {
                estadoMenosPopuloso = populacao.getKey();
                System.out.println("O estado menos populoso é : " + estadoMenosPopuloso + " com " + menorPopulacao + " habitantes.");
            }
        }

        System.out.println("\nf) Exiba o estado com o maior população e seu respectivo valor: ");
        Integer maiorPopulacao = Collections.max(estadosNE.values());
        Set<Map.Entry<String, Integer>> populacoes1 = estadosNE.entrySet(); //transformando Map em Set
        String estadoMaisPopuloso;
        for (Map.Entry<String, Integer> populacao1 : populacoes1) {
            if (populacao1.getValue().equals(maiorPopulacao)) {
                estadoMaisPopuloso = populacao1.getKey();
                System.out.println("O estado mais populoso é : " + estadoMaisPopuloso + " com " + maiorPopulacao + " habitantes.");
            }
        }

        System.out.print("\nh) Exiba a soma da população desses estados: ");
        Iterator<Integer> a = estadosNE.values().iterator();
        int soma = 0;
        while (a.hasNext()) {
            soma = soma + a.next();
        }
        System.out.println(soma +" habitantes.");

        System.out.println("\ni) Exiba a média da população deste dicionário de estados: " + (soma / estadosNE.size()) + " habitantes.");

        System.out.println("\nj) Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> b = estadosNE.values().iterator();
        while (b.hasNext()){
            if (b.next() < 4000000) b.remove();
        }
        System.out.println(estadosNE);

        System.out.println("\nk) Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estadosNE.clear();

        System.out.println("\nl) Confira se a lista está vazia: " + estadosNE.isEmpty());

    }

}
