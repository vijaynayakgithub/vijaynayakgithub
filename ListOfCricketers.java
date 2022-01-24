package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfCricketers {

	public static void main(String[] args) {
		ArrayList<CricketerMenu> Cricketer= new ArrayList<>();
		Cricketer.add(new CricketerMenu("Rishabh Pant", "Wicketkeeper/Batsman", "India"));
		Cricketer.add(new CricketerMenu("Ricky Ponting", "Batsman", "Australia"));
		Cricketer.add(new CricketerMenu("Jasprit Bumrah", "Bowler", "India"));
		optionSelect(Cricketer);
		

	}
	private static void optionSelect(ArrayList<CricketerMenu> Cricketer) {
		System.out.println("Select from the options:\n1.Add a new Cricketer\n2.View all cricketers\n3.Update cricketer details\n4.Delete a Cricketer using name\n5.exit");
		System.out.println("Enter your choice:");
		int choice=new Scanner(System.in).nextInt();
		switch(choice) {
		case 1:
			System.out.println("Adding a new cricketer\nEnter the name of the new cricketer:");
			String name = new Scanner(System.in).nextLine();
			System.out.println("Enter the speciality:");
			String speciality =  new Scanner(System.in).nextLine();
			System.out.println("Enter the country name:");
			String country= new Scanner(System.in).nextLine();
			Cricketer.add(new CricketerMenu(name,speciality,country));
			System.out.println("New Cricketer was added Successfully");
			optionSelect(Cricketer);
			break;
			
		
			
		case 2:
			System.out.println("View all cricketers");
			Cricketer.forEach((cricketer)->System.out.println(cricketer));
			optionSelect(Cricketer);
			break;
			
			
		case 3:
			System.out.println("Update Cricketer Details");
			updateCricketer(Cricketer);
			
			break;
			
		case 4:
			System.out.println("Delete a cricketer");
			System.out.println("Enter the name of the cricketer you want to delete");
			String cricName=new Scanner(System.in).nextLine();
			for(CricketerMenu cric: Cricketer ) {
				if(cric.getName().equals(cricName)) {
					Cricketer.remove(Cricketer.indexOf(cric));
					System.out.println("Deleted");
					optionSelect(Cricketer);
				break;}
			}
			System.out.println("The cricketer is not there in the list");
			optionSelect(Cricketer);
			break;
			
		case 5:
			System.out.println("Thank You");
			break;
		
		default:
			System.out.println("Wrong input\n try again");
			optionSelect(Cricketer);
			break;
			
		}
		
	}
	private static void updateCricketer(ArrayList<CricketerMenu> Cricketer) {
		System.out.println("Which details you want to update\n1.Name\n2.Speciality\n3.Country\n4.Exit\nEnter your choce:");
		int option= new Scanner(System.in).nextInt();
		String cName;
		
		
		switch(option) {
		case 1:
			System.out.println("Name updation");
			System.out.println("Enter the name of the cricketer you want to update");
			cName= new Scanner(System.in).nextLine();
			System.out.println("Enter the new name:");
			String newName = new Scanner(System.in).nextLine();
			for(CricketerMenu cric : Cricketer ) {
				if(cric.getName().equals(cName)) {
					Cricketer.set(Cricketer.indexOf(cric), 
							new CricketerMenu(newName, cric.getSpeciality(), cric.getCountry()));
					
				}
				
				
			}
			System.out.println("Update successfull");
			updateCricketer(Cricketer);
			break;
			
		case 2:
			System.out.println("Speciality Updation");
			System.out.println("Enter the name of the cricketer you want to update");
			cName= new Scanner(System.in).nextLine();
			System.out.println("Enter new speciality:");
			String newSpeciality= new Scanner(System.in).nextLine();
			for(CricketerMenu cric : Cricketer ) {
				if(cric.getName().equals(cName)) {
					Cricketer.set(Cricketer.indexOf(cric), 
							new CricketerMenu(cric.getName(), newSpeciality, cric.getCountry()));
					
				}
				
				
			}
			System.out.println("Update successfull");
			updateCricketer(Cricketer);
			break;
			
		case 3:
			System.out.println("Country Updation");
			System.out.println("Enter the name of the cricketer you want to update");
			cName= new Scanner(System.in).nextLine();
			System.out.println("Enter new Country:");
			String newCountry= new Scanner(System.in).nextLine();
			for(CricketerMenu cric : Cricketer ) {
				if(cric.getName().equals(cName)) {
					Cricketer.set(Cricketer.indexOf(cric), 
							new CricketerMenu(cric.getName(), cric.getSpeciality(), newCountry));
					
				}
				
				
			}
			System.out.println("Update successfull");
			updateCricketer(Cricketer);
			break;
		case 4:
			optionSelect(Cricketer);
			break;
			
		default:
			System.out.println("Wrong input\n SElect again\n");
			updateCricketer(Cricketer);
			break;
			
			
			
		}
	}

}


class CricketerMenu{
	private String name;
	private String speciality;
	private String country;
	
	
	
	public CricketerMenu(String name, String speciality, String country) {
		
		this.name = name;
		this.speciality = speciality;
		this.country = country;
	}
	
	public CricketerMenu() {}
	
	
	
	@Override
	public String toString() {
		return "CricketerMenu [Name=" + name + ", Speciality=" + speciality + ", Country=" + country + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		speciality = speciality;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		country = country;
	}
	
	
}