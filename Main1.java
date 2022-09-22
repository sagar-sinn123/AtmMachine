package javaproject;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperations ao=new AtmOperationImp();
		int atmnumber =1234;
		int atmpin=123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO ATM!");
		System.out.println("enter the Atm number:");
		int AtmNo = sc.nextInt();
		
		System.out.println("enter the atm Pin");
		int AtmPin = sc.nextInt();
		
		if((atmnumber==AtmNo)&&(atmpin==AtmPin))
		{
			while(true)
			{
				System.out.println("1.View Avaliable Balance\n2.withdraw Amount\n3.Deposit Amount \n 4.view Statement\n 5.Exit");
				System.out.println("Enter the choice:");
				int ch = sc.nextInt();
				if(ch==1)
				{
					ao.viewBalance();
				}
				else if(ch==2)
				{
					System.out.println("enter  amount want to withdraw!");
					double withdrawAmount=sc.nextDouble();
					ao.withdrawAmount(withdrawAmount);
				}
				else if(ch==3)
				{
					System.out.println("enter how much amount  you want to deposit:");
					double depositamount = sc.nextDouble();
					ao.depsitAmount(depositamount);
				}
				else if(ch==4)
				{
					ao.viewStatement();
				}
				else if(ch==5)
				{
					System.out.println("Collect your card carefully");
					System.exit(0);
				}
				else
				{
					System.out.println("plz enter the right choice");
				}
			}
		
			//System.out.println("Accepted validation");
			
		}
		else
		{
			System.out.println("invalid validation");
		    System.exit(0);
		}
		
		
		

	}

}
