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
		int pontuacao=0;
		int caractereA=0;
		int caractereB=0;
		int caractereC=0;
		int caractereD=0;
		int caractereE=0;
		int caractereF=0;
		int caractereG=0;
		int caractereH=0;
		int caractereI=0;
		int caractereJ=0;
		int caractereK=0;
		int caractereL=0;
		int caractereM=0;
		int caractereN=0;
		int caractereO=0;
		int caractereP=0;
		int caractereQ=0;
		int caractereR=0;
		int caractereS=0;
		int caractereT=0;
		int caractereU=0;
		int caractereV=0;
		int caractereW=0;
		int caractereX=0;
		int caractereY=0;
		int caractereZ=0;

		while (linha != null) {
			
			for(int i = 0 ; i < linha.length(); i++) {
				char caracter = linha.toUpperCase().charAt(i);
				qtdCaracteres++;
				if(caracter == ' '||caracter == '!'||caracter=='?'||caracter==','||caracter=='.'||
						caracter==';'||caracter==':'||caracter=='-'||caracter=='('||caracter==')') {
					pontuacao++;
				} else if(caracter == 'A' || caracter == 'Á' || caracter == 'Ã' ||caracter=='À'){
					caractereA++;
				} else if(caracter == 'B') {
					caractereB++;
				} else if(caracter == 'C' || caracter == 'Ç') {
					caractereC++;
				} else if(caracter == 'D') {
					caractereD++;
				} else if(caracter =='E' || caracter == 'É' || caracter =='Ê') {
					caractereE++;
				} else if(caracter == 'F') {
					caractereF++;
				} else if(caracter == 'G') {
					caractereG++;
				} else if(caracter == 'H') {
					caractereH++;
				} else if(caracter == 'I' || caracter =='Í') {
					caractereI++;
				} else if(caracter == 'J') {
					caractereJ++;
				} else if(caracter == 'K') {
					caractereK++;
				} else if(caracter == 'L') {
					caractereL++;
				} else if(caracter == 'M') {
					caractereM++;
				} else if(caracter == 'N') {
					caractereN++;
				} else if(caracter == 'O' || caracter =='Ó' || caracter =='Ô' || caracter == 'Õ') {
					caractereO++;
				} else if(caracter == 'P') {
					caractereP++;
				} else if(caracter == 'Q') {
					caractereQ++;
				} else if(caracter == 'R') {
					caractereR++;
				} else if(caracter == 'S') {
					caractereS++;
				} else if(caracter == 'T') {
					caractereT++;
				} else if(caracter == 'U' || caracter =='Ú') {
					caractereU++;
				} else if(caracter == 'V') {
					caractereV++;
				} else if(caracter == 'W') {
					caractereW++;
				} else if(caracter == 'X') {
					caractereX++;
				} else if(caracter == 'Y') {
					caractereY++;
				} else if(caracter == 'Z') {
					caractereZ++;
				}
			}
			
			System.out.println(linha);
			linha = myBuffer.readLine();
			}
		
		System.out.printf("\n\n\n----------------------------------------------------\n");
		System.out.println("--------RELATÓRIO---------");
		System.out.println("----------------------------------------------------");
		System.out.println("O texto possui "+qtdCaracteres+" caracteres ao todo");
		System.out.println(pontuacao+ " sinais de pontuação (incluindo espaços)");
		System.out.printf("\nFrequência de ocorrência das letras:\n\n");
		System.out.println("A = "+caractereA);
		System.out.println("B = "+caractereB);
		System.out.println("C = "+caractereC);
		System.out.println("D = "+caractereD);
		System.out.println("E = "+caractereE);
		System.out.println("F = "+caractereF);
		System.out.println("G = "+caractereG);
		System.out.println("H = "+caractereH);
		System.out.println("I = "+caractereI);
		System.out.println("J = "+caractereJ);
		System.out.println("K = "+caractereK);
		System.out.println("L = "+caractereL);
		System.out.println("M = "+caractereM);
		System.out.println("N = "+caractereN);
		System.out.println("O = "+caractereO);
		System.out.println("P = "+caractereP);
		System.out.println("Q = "+caractereQ);
		System.out.println("R = "+caractereR);
		System.out.println("S = "+caractereS);
		System.out.println("T = "+caractereT);
		System.out.println("U = "+caractereU);
		System.out.println("V = "+caractereV);
		System.out.println("W = "+caractereW);
		System.out.println("X = "+caractereX);
		System.out.println("Y = "+caractereY);
		System.out.println("Z = "+caractereZ);
		
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