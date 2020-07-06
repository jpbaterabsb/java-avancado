package br.com.digital.innovation.one.aula6;

import java.util.stream.Collectors;

public class StringLinesExemplo {

    public static void main(String[] args) {
        String html = "<html>\n<head>\n</head>\n <body> \n <body> \n<html>";
        System.out.println(html.lines().map(s -> "[TAG] :: "+s).collect(Collectors.toList()));
    }
}
