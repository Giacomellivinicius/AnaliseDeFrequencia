package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ManipuladorDeArquivo {

	public static void leitor(String path) throws IOException {

		// abertura do arquivo
		BufferedReader myBuffer = new BufferedReader(new InputStreamReader(
		  new FileInputStream(path), "UTF-8"));

		// loop que lê e imprime todas as linhas do arquivo
		String linha = myBuffer.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = myBuffer.readLine();
		}

		myBuffer.close();

	}


	public static void escritor(String path) throws IOException {

		OutputStreamWriter bufferOut = new OutputStreamWriter(
                               new FileOutputStream(path),"UTF-8");

		bufferOut.write("acento agudo: áéíóú\n");
		bufferOut.write("acento circunflexo: âêîôû\n");
		bufferOut.write("fim");

		bufferOut.close();
	}

}