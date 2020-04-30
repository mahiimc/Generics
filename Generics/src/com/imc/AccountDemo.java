package com.imc;

import java.util.ArrayList;
import java.util.HashSet;

public class AccountDemo {
	
	public static void main(String[] args) {
		ArrayList<Account> ac  = new ArrayList<Account>();
		ac.add(new Account(1001,50000,3001));
		ac.add(new Account(1002,55000,3002));
		ac.add(new Account(1003,95000,3003));
		ac.add(new Account(1004,100000,3004));
		HashSet <Integer> uniqueIds = custoWithUniqueId(ac);
		System.out.println(uniqueIds);
				
	}

		public static HashSet<Integer> custoWithUniqueId(ArrayList<Account> ac){

			HashSet<Integer> hs = new HashSet<Integer>();
			for(Account a : ac) {
				hs.add(a.getCutoId());
			}
			
			return hs;
			
		}
}
