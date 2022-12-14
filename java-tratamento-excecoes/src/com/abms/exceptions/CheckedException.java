package com.abms.exceptions;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {

        String nomeDoArquivo = "com/abms/exceptions/romances2.txt";

        try{
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que deseja imprimit! " + e.getMessage());
            e.printStackTrace();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "OCorreu um erro inesperado! " + e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Passou eplo finally");
        }
        System.out.println("Apesar da exception ou não, o programa continua... ");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);
        bw.flush();
        br.close();

    }
}
