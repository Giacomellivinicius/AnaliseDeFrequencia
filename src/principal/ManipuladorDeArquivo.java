package principal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ManipuladorDeArquivo {
	

	public static void leitor(String path) throws IOException {

		// abertura do arquivo
		BufferedReader myBuffer = new BufferedReader(new InputStreamReader(
		  new FileInputStream(path), "UTF-8"));

		// loop que lê e imprime todas as linhas do arquivo
		String linha = myBuffer.readLine();
		int qtdCaracteres =0;
		
		for(int i = 0 ; i < linha.toUpperCase().length(); i++) {
			char caracter = linha.charAt(i);
			qtdCaracteres+=linha.length();
			if(caracter == ' '||caracter == '!'||caracter=='?'||caracter==','||caracter=='.'||
					caracter==';'||caracter==':'||caracter=='-'||caracter=='('||caracter==')') {
				System.out.println("pontuacao");
			} else if (caracter != ' '){
				for(int j = 0; j < linha.toUpperCase().length() ;j++) { 
				char l = linha.charAt(j);
					if (caracter == l){
						System.out.println(l);
					}
				}
			}
		}
		

		while (linha != null) {

			System.out.println(linha);
			linha = myBuffer.readLine();
			}
		
		System.out.println("O texto possui "+qtdCaracteres+" caracteres ao todo");
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