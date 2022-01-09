package ödev;

import java.util.Scanner;

public class CokBoyutluDiziyiAyýrma {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Dizi içerisinde kontrol etmek istediðiniz sayýyý giriniz");
		int kullanýcý = giris.nextInt();
		//1.Ödev matrisi
		int [][] matris = new int[][] {
			{56,23,678,231},
			{234,21,78,26},
			{654,33,32,67},
			{189,35,56,89}
		};
		// 2. ve 3. ödevlerin matrisi
		int[][] matris2 = new int[][] {
			{56,23,1,231},
			{234,21,78,26},
			{654,33,32,67},
			{189,35,56,89}
		};
		tekBoyutluDiziYazdýrma(diziyiTekSayýlarýnaAyýrma(matris));
		tekBoyutluDiziYazdýrma(diziyiCiftSayýlarýnaAyýrma(matris));
		System.out.println("En büyük sayý:" + cokBoyutluDizideEnBuyukSayý(matris2));
		girilenDegerDizideVarmý(matris2, kullanýcý);
		
		
	}
	public static int[] diziyiTekSayýlarýnaAyýrma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					count++;
				}
			}
		}
		int[] tekSayýlarDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					tekSayýlarDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return tekSayýlarDizisi;
	}
	public static int[] diziyiCiftSayýlarýnaAyýrma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					count++;
				}
			}
		}
		int[] ciftSayýlarDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					ciftSayýlarDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return ciftSayýlarDizisi;
	}
	public static void tekBoyutluDiziYazdýrma(int[] dizi) {
		for(int i=0; i<dizi.length; i++) {
			if(i<dizi.length-1) {
				System.out.print(dizi[i] + ", " );
			}
			else {
				System.out.print(dizi[i]);
			}
		}
		System.out.println();
	}
	public static int cokBoyutluDizideEnBuyukSayý(int[][] dizi) {
		int enBuyuk = dizi[0][0];
		for(int i=0; i<dizi.length; i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(enBuyuk < dizi[i][j]) {
					enBuyuk = dizi[i][j];
				}
			}
		}
		return enBuyuk;
	}
	public static void girilenDegerDizideVarmý(int[][] dizi, int a) {
		boolean x = false;
		for(int k =0; k<dizi.length; k++ ) {
			for(int l=0; l<dizi[0].length; l++) {
				if(a == dizi[k][l]) {
					x = true;
					break;
				}
			}
		}
		String durum;
		durum =  x ? "true" : "false";
		System.out.println(durum);
		
	}
}
