package Desafios;

import java.util.Scanner;

public class MaquinaBebida {
	
	public static void main(String[] args) {
		
//		fa�a um sistema para uma m�quina de bebidas
//		a m�quina vende:
//		refrigerantes
//		sucos
//		�gua
//		cervejas
//
//		ao iniciar o programa ir� perguntar para o usu�rio qual sua idade
//		se o usu�rio for maior de 18 anos ele poder� comprar todos os tipos de bebidas vendida
//		caso contr�rio o usu�rio n�o poder� ter acesso as cervejas.
		
		Scanner entrada = new Scanner(System.in);
		
		
		int idade;
		String bebida = "";
		
		System.out.print("Ol�... antes de escolher sua bebida\n Me informe sua idade: ");
		idade = entrada.nextInt();
		
		if(idade < 18) {
			System.out.println("Oque deseja beber? \n"
					+ "Refrigerante\n"
					+ "Suco\n"
					+ "�gua: ");
			bebida = entrada.next();
			
				switch(bebida.toLowerCase()) {
				case "refrigerante":
					System.out.println("...\n...\n...\n Retire seu Refrigerante!!!");
					break;
				case "suco":
					System.out.println("...\n...\n...\n Retire seu Suco!!!");
					break;
				case "agua":
					System.out.println("...\n...\n...\n Retire sua �gua!!!");
					break;
				default:
					System.out.println("Bebida inv�lida...");
					break;
				}
		} else {
			System.out.println("Oque deseja beber? \n"
					+ "Refrigerante\n"
					+ "Suco\n"
					+ "�gua\n"
					+ "Cerveja: ");
			bebida = entrada.next();
			
			switch(bebida.toLowerCase()) {
			case "refrigerante":
				System.out.println("...\n...\n...\n Retire seu Refrigerante!!!");
				break;
			case "suco":
				System.out.println("...\n...\n...\n Retire seu Suco!!!");
				break;
			case "agua":
				System.out.println("...\n...\n...\n Retire sua �gua!!!");
				break;
			case "cerveja":
				System.out.println("...\n...\n...\n Retire sua Cerveja!!!");
				break;
			default:
				System.out.println("Bebida inv�lida...");
				break;
			}
			
		}
		
		
		

		entrada.close();
		
		
		
	}

}
