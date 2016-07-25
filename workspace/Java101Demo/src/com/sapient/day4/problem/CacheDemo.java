package com.sapient.day4.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheDemo {
	static Map<String, Bank> bankMap = new HashMap<>();

	public static void main(String[] args) {
		
		Atm atm1 = new Atm("GK");
		Atm atm2 = new Atm("Def Col");
		List<Atm> atms = new ArrayList<>();
		atms.add(atm1);
		atms.add(atm2);
		
		Branch b1 = new Branch("GK", true);
		Branch b2 = new Branch("Nehru Place", false);
		List<Branch> branches = new ArrayList<>();
		branches.add(b1);
		branches.add(b1);
		
		Bank bank = new Bank("ICICI", branches, atms);
		
		
		bankMap.put("ICICI", bank);
		System.out.println(bankMap);

		findBankBranches("ICICI");

	}
	
	public static void findBankBranches(String bankName){
		Bank searchedBank = bankMap.get(bankName);
		List<Branch> branches = searchedBank.branches;
		System.out.println(branches);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
