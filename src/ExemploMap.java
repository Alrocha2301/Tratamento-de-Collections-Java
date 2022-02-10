import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        /*Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};*/
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("gol", 14.4);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);//metodo para trocar valor na chave determinada
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));//metodo para procurar chave específica

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));// .get= metodo para exibir conteúdo

//        System.out.println("Exiba o terceiro modelo adicionado: ");//map não trabalha com posição de inserção, apenas procurando a chave

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();//metodo para exibir as chaves em uma SET criada
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();//metodo para exibir valores em uma Collection criada
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());//pega o maior valor e coloca na variavel criada
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); //cria um Set "entries" de Map.Entry que vai receber um novo Set
        String modeloMaisEficiente = "";// variavael de controle

        for (Map.Entry<String, Double> entry : entries) {//laço para percorrer "entries"
            if (entry.getValue().equals(consumoMaisEficiente)) {//compara valor com a variavel de max criada acima
                modeloMaisEficiente = entry.getKey();//quando valor igual, a chave é capturada para a variavel controle
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);//exibe a chave capturada e o consumo na variavel acima
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());//mesma lógica do maximo, mas com metodo Collections.min
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

        /*System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);*/

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);//cria um map novo a partir de outro Map, mas ordenando por TreeMap
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}