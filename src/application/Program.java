package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nameChampion1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeChampion1 = sc.nextInt();
		System.out.print("Ataque: ");
		int attackChampion1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armorChampion1 = sc.nextInt();
		Champion champion1 = new Champion(nameChampion1, lifeChampion1, attackChampion1, armorChampion1);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nameChampion2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeChampion2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attackChampion2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armorChampion2 = sc.nextInt();
		Champion champion2 = new Champion(nameChampion2, lifeChampion2, attackChampion2, armorChampion2);
		
		System.out.println();
		System.out.println("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion2);
			
			System.out.printf("\nResultado do turno: %d\n", i + 1);
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			
			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				break;
			}
		}
		
		System.out.println("FIM DO COMBATE");		
		sc.close();

	}

}
