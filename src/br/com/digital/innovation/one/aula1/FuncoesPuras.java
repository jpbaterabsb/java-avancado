package br.com.digital.innovation.one.aula1;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(13,12));
        System.out.println(verificarSeEMaior.test(13,12));
    }
}
