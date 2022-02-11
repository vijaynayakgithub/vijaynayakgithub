package com.mphasis.vijayprojects;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

public class App {

	DataSource dataSource;
	
	NamedParameterJdbcTemplate template;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		template = new NamedParameterJdbcTemplate(dataSource);
	}

	public static void main( String[] args )
    {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Bank bank=context.getBean("bank", Bank.class);
		
		//Scanner scan=new Scanner(System.in);
		int input=0;
		App menu=new App();
		menu.display(input);
		
    }
	
	public void display(int input) {
		
		int no;
		String name;
		int value;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your choice:");
		System.out.println("1. create new account");
		System.out.println("2. deposit");
		System.out.println("3. withdraw");
		
		input=scan.nextInt();
		
		switch(input) {
		
				case 1: System.out.println("Enter the account number");
						no=scan.nextInt();
						scan.nextLine();
						System.out.println("Enter the user name");
						name=scan.nextLine();
						System.out.println("Enter the amount");
						value=scan.nextInt();
						addNewAccount(new UserAccount(no, name, value));
						display(input);
						break;
						
				case 2: System.out.println("Enter amount be deposit ");		
						value=scan.nextInt();
						System.out.println("Enter account number");
						no=scan.nextInt();
						deposit(value,no);
						display(input);
						break;
						
				case 3: System.out.println("Enter amount be withdraw ");		
						value=scan.nextInt();
						System.out.println("Enter account number");
						no=scan.nextInt();
						withDraw(value,no);
						display(input);
						break;
						
				 		
				default : display(input);
						 break;  
		
				
		}
	}
	
	void addNewAccount(UserAccount newAccount) {
			
			String qry = "insert into useraccount values(:accNo, :name, :amount)";
			
			template.update(qry, new MapSqlParameterSource("accNo", newAccount.accNo())
					.addValue("name", newAccount.name()).addValue("amount", newAccount.amount()));
						
		}

	int deposit(int amount,int accNo) {
		
		String qry="update useraccount set amount= amount + :value WHERE accno= :no";
		
		return template.update(qry, new MapSqlParameterSource("value",amount).addValue("no", accNo));
	}
	
	int withDraw(int amount,int accNo) {
		
		String qry="update useraccount set amount= amount - :value WHERE accno= :no ";
		
		return template.update(qry, new MapSqlParameterSource("value",amount).addValue("no", accNo));
	}
    
}