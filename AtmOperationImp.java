package javaproject;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImp implements AtmOperations {
	AtmJava atm= new AtmJava();
	Map<Double,String>statement =new HashMap<Double,String>();

	@Override
	public void viewBalance() {
		System.out.println("Available balance is :"+ atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=atm.getBalance())
		{
			statement.put(withdrawAmount,"Amount withdrawn!");
		System.out.println(withdrawAmount+"collect your amaunt!" + withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		}
		else
		{
			System.out.println(" sorry Insufficent balance!");
		}
	}

	@Override
	public void depsitAmount(double depositAmount) {
		statement.put(depositAmount,"Amount deposited!");
		System.out.println(depositAmount+"deposited successfully!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewStatement() {
		for(Map.Entry<Double,String>m:statement.entrySet())
		{
			System.out.println(m.getKey() +""+m.getValue());
		}
		
	}
	

}
