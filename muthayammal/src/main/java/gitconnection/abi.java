package gitconnection;

import java.util.Scanner;

public class abi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);

	}

}
