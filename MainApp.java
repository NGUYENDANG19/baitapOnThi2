package Baisic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.format("nhập vào n :");
		int n = sc.nextInt();

		chanLe(n);
		tong(n);
		chiaHetCho5(n);
		tongS(n);
		tinhGiaiThua(n);
		thangTrongNam(n);
	}

	private static void tongS(int n) {
		// TODO Auto-generated method stub
		 float sum = 0;
	      Scanner sc;
	        do {
	            System.out.format("nhập n = ");
	            sc = new Scanner(System.in);
	            n = sc.nextInt();
	        }while(n <= 0);

	        for(int i = 1; i <= n; i++) {
	            sum += 1.0/i;
	        }

	        System.out.println(" - Sum = " + sum);
	        sc.close();	
	}

	private static void thangTrongNam(int n) {
		// TODO Auto-generated method stub
		System.out.println();
		switch (n)	{
		case   1:
			System.out.format("đây là tháng một ");
			break;
		case   2:
			System.out.format("đây là tháng hai ");
			break;
		case   3:
			System.out.format("đây là tháng ba ");
			break;
		case   4:
			System.out.format("đây là tháng bốn ");
			break;
		case   5:
			System.out.format("đây là tháng năm ");
			break;
		case   6:
			System.out.format("đây là tháng sáu ");
			break;
		case   7:
			System.out.format("đây là tháng bảy ");
			break;
		case   8:
			System.out.format("đây là tháng tám ");
			break;
		case   9:
			System.out.format("đây là tháng chín ");
			break;
		case   10:
			System.out.format("đây là tháng mười ");
			break;
		case   11:
			System.out.format("đây là tháng mười một ");
			break;
		case   12:
			System.out.format("đây là tháng mười hai ");

			break;
		default:
			System.out.println("sai du lieu");
		}
	}

	private static void tinhGiaiThua(int n) {
		// TODO Auto-generated method stub
		 int ketQua = 1;
		 for(int i=1;i<n;i++) {
				ketQua = ketQua * i;		
		}
		System.out.println(" tong gia thua la = "+ketQua);
	}

	private static void chiaHetCho5(int n) {   
		System.out.println();
		// TODO Auto-generated method stub
		if(n%5==0) {
			System.out.println("- n chia hết  cho 5");
		}else {
			System.out.println("- n không chia hết cho 5");
		}
	}

	private static void tong(int n) {
		// TODO Auto-generated method stub
		System.out.println();
		int tong = 0;
		for (int i = 1;i<=n;i++ ) {
			tong = tong + i;
		}
		System.out.println(" - tong = "+tong);
	}

	private static void chanLe(int n) {
		// TODO Auto-generated method stub
		if (n%2==0) {
			System.out.format("\n - n là số chẵn");
		}else {
			System.out.format("\n -  n là số lẽ");
		}
	}
}
