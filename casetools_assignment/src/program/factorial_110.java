package program;

import java.util.Scanner;

public class factorial_110 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f = 1;
		System.out.println("Enter The Number : ");
		int num = sc.nextInt();
		//Factorial Of Only Positive Number
		if(num >0){
		for(int i=num; i>=1; i--){
		f = f*i;
		}
		}
		System.out.println("Factorial Of "+num+" is : "+f);

		}

}
