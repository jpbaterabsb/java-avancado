package br.com.digital.innovation.one.aula3;

import java.util.stream.IntStream;

public class ParallelStreamExemplo {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial :: "+(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel :: "+(fim-inicio));
    }

    public static long fatorial(long num){
        long fat = 1;

        for (long i = 2; i <= num ; i++) {
            fat*=i;
        }
        return fat;
    }
}
