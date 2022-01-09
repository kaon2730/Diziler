package ödev;

import java.util.Scanner;

public class CokBoyutluDiziyiAyırma {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Dizi içerisinde kontrol etmek istediğiniz sayıyı giriniz");
		int kullanıcı = giris.nextInt();
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
		tekBoyutluDiziYazdırma(diziyiTekSayılarınaAyırma(matris));
		tekBoyutluDiziYazdırma(diziyiCiftSayılarınaAyırma(matris));
		System.out.println("En büyük sayı:" + cokBoyutluDizideEnBuyukSayı(matris2));
		girilenDegerDizideVarmı(matris2, kullanıcı);
		
		
	}
	public static int[] diziyiTekSayılarınaAyırma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					count++;
				}
			}
		}
		int[] tekSayılarDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 != 0) {
					tekSayılarDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return tekSayılarDizisi;
	}
	public static int[] diziyiCiftSayılarınaAyırma(int [][] dizi){
		int count =0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					count++;
				}
			}
		}
		int[] ciftSayılarDizisi = new int[count];
		int index = 0;
		for(int i=0; i<dizi.length;i++) {
			for(int j =0; j<dizi[0].length; j++) {
				if(dizi[i][j]%2 == 0) {
					ciftSayılarDizisi[index]= dizi[i][j];
					index++;
				}
			}
		}
		return ciftSayılarDizisi;
	}
	public static void tekBoyutluDiziYazdırma(int[] dizi) {
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
	public static int cokBoyutluDizideEnBuyukSayı(int[][] dizi) {
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
	public static void girilenDegerDizideVarmı(int[][] dizi, int a) {
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
