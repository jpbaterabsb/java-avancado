package br.com.digital.innovation.one.aula1;

public class Aula {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            return valor;
        };
        System.out.println(funcao1.gerar("Joao"));
    }
}



interface Funcao1 {
    String gerar(String valor);
}
