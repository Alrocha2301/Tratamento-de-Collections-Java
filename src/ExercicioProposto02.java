import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExercicioProposto02 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("PERGUNTAS: (responder s para SIM e n para NÃO)\n");
        System.out.println("Telefonou para a vítima? ");
        respostas.add(scan.next());
        System.out.println("Esteve no local do crime? ");
        respostas.add(scan.next());
        System.out.println("Mora perto da vítima? ");
        respostas.add(scan.next());
        System.out.println("Devia para a vítima? ");
        respostas.add(scan.next());
        System.out.println("Já trabalhou com a vítima? ");
        respostas.add(scan.next());

        //System.out.println(respostas);

        int i = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String resposta = contador.next();
            if (resposta.contains("s")) i++;
        }

        switch (i) {
            case 2:
                System.out.println("SUSPEITA");
                break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE");
                break;
            case 5:
                System.out.println("ASSASSINA");
                break;
            default:
                System.out.println("INOCENTE");
                break;
        }
    }
}
