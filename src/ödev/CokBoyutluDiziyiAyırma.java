package �dev;

import java.util.Scanner;

public class CokBoyutluDiziyiAy�rma {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Dizi i�erisinde kontrol etmek istedi�iniz say�y� giriniz");
		int kullan�c� = giris.nextInt();
		//1.�dev matrisi
		int [][] matris = new int[][] {
			{56,23,678,231},
			{234,21,78,26},
			{654,33,32,67},
			{189,35,56,89}
		};
		// 2. ve 3. �devlerin matrisi
		int[][] matris2 = new int[][] {
			{56,23,1,231},
			{234,21,78,26},
			{654,33,32,67},
			{189,35,56,89}
		};
		tekBoyutluDiziYazd�rma(diziyiTekSay�lar�naAy�rma(matris));
		tekBoyutluDiziYazd�rma(diziyiCiftSay�lar�naAy�rma(matris));
		System.out.println("En b�y�k say�:" + cokBoyutluDizideEnBuyukSay�(matris2));
		girilenDegerDizideVarm�(matris2, kullan�c�);
		
		
	}
	public static int[] diziyiTekSay�lar�naAy�rma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					count++;
				}
			}
		}
		int[] tekSay�larDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					tekSay�larDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return tekSay�larDizisi;
	}
	public static int[] diziyiCiftSay�lar�naAy�rma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					count++;
				}
			}
		}
		int[] ciftSay�larDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					ciftSay�larDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return ciftSay�larDizisi;
	}
	public static void tekBoyutluDiziYazd�rma(int[] dizi) {
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
	public static int cokBoyutluDizideEnBuyukSay�(int[][] dizi) {
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
	public static void girilenDegerDizideVarm�(int[][] dizi, int a) {
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
