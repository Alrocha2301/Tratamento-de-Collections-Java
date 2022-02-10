/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); //criando objeto para receber dados e chamando método Scanner
            List<Double> temperaturas = new ArrayList<Double>();

            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite a temperatura: ");
                double temp = scan.nextDouble();
                temperaturas.add(temp);

            }

            System.out.println("Todas as temperaturas: " + temperaturas);

            //Calcular média semestral
            Iterator<Double> a = temperaturas.iterator();
            Double soma;
            {
                soma = 0d;
                while (a.hasNext()) {
                    Double next = a.next();
                    soma += next;
                }
            }

            Double media = (soma / temperaturas.size());
            System.out.println("Media da temperatura Semestral: " + media);

            //mostrando as temperaturas acima da média
            Iterator<Double> b = temperaturas.iterator();
            System.out.println("Temperaturas acima da média semestral: ");
            while (b.hasNext()) {
                double acimaDaMedia = b.next();
                //System.out.println("Temperaturas acima da média semestral: ");
                if (acimaDaMedia > media) System.out.println(" " + acimaDaMedia);

            }

            List<String> meses = new ArrayList<>();
            meses.add("1 - Janeiro");
            meses.add("2 - Fevereiro");
            meses.add("3 - Março");
            meses.add("4 - Abril");
            meses.add("5 - Maio");
            meses.add("6 - Junho");

            //System.out.println(meses.toString());

            Iterator<Double> c = temperaturas.iterator();
            Iterator<String> d = meses.iterator();
            System.out.println("Meses com temperaturas acima da média: ");
            while (c.hasNext()) {
                double acimaDaMediaMes = c.next();
                String mesAcimaDaMedia = d.next();
                if (acimaDaMediaMes > media) System.out.println(mesAcimaDaMedia + ": " + acimaDaMediaMes + " graus.");

            }

        }

}

