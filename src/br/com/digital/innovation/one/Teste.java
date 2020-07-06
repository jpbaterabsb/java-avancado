package br.com.digital.innovation.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Teste {

    public static void main(String[] args) throws IOException {
        Socket echoSocket = new Socket("localhost", 10000);

        PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        out.println(" <isomsg>\n" +
                "  <field id=\"0\" value=\"0800\" />\n" +
                "  <field id=\"3\" value=\"000000\" />\n" +
                "  <field id=\"11\" value=\"000001\" />\n" +
                "  <field id=\"41\" value=\"00000001\" />\n" +
                "  <field id=\"70\" value=\"901\" />\n" +
                " </isomsg>\n");
        in.lines()
                .forEach(System.out::println);
        echoSocket.close();
    }
}
