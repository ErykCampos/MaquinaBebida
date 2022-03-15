package Desafios;

import java.util.Scanner;

public class MaquinaBebida {
	
	public static void main(String[] args) {
		
//		faça um sistema para uma máquina de bebidas
//		a máquina vende:
//		refrigerantes
//		sucos
//		água
//		cervejas
//
//		ao iniciar o programa irá perguntar para o usuário qual sua idade
//		se o usuário for maior de 18 anos ele poderá comprar todos os tipos de bebidas vendida
//		caso contrário o usuário não poderá ter acesso as cervejas.
		
		Scanner entrada = new Scanner(System.in);
		
		
		int idade;
		String bebida = "";
		
		System.out.print("Olá... antes de escolher sua bebida\n Me informe sua idade: ");
		idade = entrada.nextInt();
		
		if(idade < 18) {
			System.out.println("Oque deseja beber? \n"
					+ "Refrigerante\n"
					+ "Suco\n"
					+ "Água: ");
			bebida = entrada.next();
			
				switch(bebida.toLowerCase()) {
				case "refrigerante":
					System.out.println("...\n...\n...\n Retire seu Refrigerante!!!");
					break;
				case "suco":
					System.out.println("...\n...\n...\n Retire seu Suco!!!");
					break;
				case "agua":
					System.out.println("...\n...\n...\n Retire sua Água!!!");
					break;
				default:
					System.out.println("Bebida inválida...");
					break;
				}
		} else {
			System.out.println("Oque deseja beber? \n"
					+ "Refrigerante\n"
					+ "Suco\n"
					+ "Água\n"
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
				System.out.println("...\n...\n...\n Retire sua Água!!!");
				break;
			case "cerveja":
				System.out.println("...\n...\n...\n Retire sua Cerveja!!!");
				break;
			default:
				System.out.println("Bebida inválida...");
				break;
			}
			
		}
		
		
		

		entrada.close();
		
		
		
	}

}
