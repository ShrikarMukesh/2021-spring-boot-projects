package com.shrikar.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping(value = "/mybal/{accno}" )
	public double getBalance(@PathVariable("accno") String accno) {
		
		System.out.println("AC-getBalance()" + accno);
		return 25000;
	}

	@GetMapping(value ="/myaccount")
	public Account getAccountByAccno(@RequestParam("accno") int accno) {
		
		System.out.println("AC-getAccountByAccno()" + accno);
		Account acc=new Account(accno,"SA","B99",29000.0);
		return acc;
	}
	
	@GetMapping("/myaccounts")
	public List<Account> getAllCounts(){
		
		System.out.println("AC-getAllCounts()");
		List<Account> accList=new ArrayList<>();
		accList.add(new Account(101,"SA","B99",19000.0));
		accList.add(new Account(102,"KA","KH2",29000.0));
		accList.add(new Account(103,"MK","JK9",2000.0));
		accList.add(new Account(104,"JG","BNH",39000.0));
		accList.add(new Account(105,"LKJH","OUU7",49000.0));
		return accList;
		
	}
}