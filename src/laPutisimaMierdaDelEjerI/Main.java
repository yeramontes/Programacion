package laPutisimaMierdaDelEjerI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int conjuntoDias = sc.nextInt();
		int numeroDias = sc.nextInt();
		int total, pos , max;
		int[] incidencias;
		while(!(conjuntoDias == 0) && !(numeroDias == 0)) {
			max = 0;
			incidencias = new int[numeroDias];
			//ArrayList<Integer> incidencias = new ArrayList();
			for(int i = 0; i < numeroDias; i++) {
				incidencias[i] = sc.nextInt();
				//incidencias.add(sc.nextInt());
			}
			for(int i = 0; i <= incidencias.length - conjuntoDias;i++) {
				total = 0;
				pos = i;
				for(int j = 0; j < conjuntoDias; j++) {
					total += incidencias[pos];
					pos++;
				}
				if(total > max) max = total;
			}
			System.out.println(max);
			conjuntoDias = sc.nextInt();
			numeroDias = sc.nextInt();
		}
	}
}
