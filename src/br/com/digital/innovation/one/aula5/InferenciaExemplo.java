package br.com.digital.innovation.one.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args) {
        connectAndPrintURLJavaOracle();
    }

    private static void connectAndPrintURLJavaOracle()  {
        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();

            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void printarNomeCompleto(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros) {
        int soma;
        if (numeros.length > 0) {
            soma = 0;
            for (var numero = 0; numero < numeros.length; numero++) {
                soma += numeros[numero];
            }

            System.out.println("A soma e ::: " + soma);
        }
    }

    //Consegue

    // variaveis local inicializadas
    // variavel suporte do enhaced for
    // variavel suporte do for iterativo
    // variavel try with resource

    //Nao consegue

    // var nao pode ser utilizado em nivel de classe
    // var nao pode ser utilizado como parametro
    // var nao pode ser utilizada em variaveis locais nao inicializadas


    // https://docs.oracle.com/javase/10/language/
}
