import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class App {
	public static void main(String[] args) throws InvalidHouseNameException, InputMismatchException {
		
		House gryff = new House("Gryffindor");
		House slyth = new House("Slytherin");
		House raven = new House("Ravenclaw");
		House huffle = new House("Hufflepuff");
		 List<House> houseList = new ArrayList<House>();
		 houseList.add(gryff);
		 houseList.add(slyth);
		 houseList.add(raven);
		 houseList.add(huffle);
		boolean loopOn = true;
		int compRound = 0;
		Scanner scanner = new Scanner(System.in);
		String inputHouseName;
		int inputPoint;
		
		while(loopOn == true) {
//	        for(int i = 0; i < houseList.size(); i++) {
//	            System.out.println(houseList.get(i).getHouseName());
//	            System.out.println(houseList.get(i).getHousePoint());
//	            
//	        }
	        try {
            System.out.println("Choose the house name/n"
            + " >Type g for Gryffindor:\n"
            + " >Type s for Slytherin:\n"
            + " >Type r for Ravenclaw:\n"
            + " >Type h for Hufflepuff");
            inputHouseName = scanner.nextLine();
	        
            if(!(inputHouseName.equals("g") || inputHouseName.equals("s") || inputHouseName.equals("r") || inputHouseName.equals("h"))) {
            	System.out.println(".....");
            	throw new InvalidHouseNameException("");
            }
            
            System.out.println("Enter the point");
            inputPoint = scanner.nextInt();
            
            
            if(inputHouseName.equals("g")) {
            	houseList.get(0).plusPoint(inputHouseName,inputPoint);
            }else if(inputHouseName.equals("s")) {
            	houseList.get(1).plusPoint(inputHouseName,inputPoint);
            }else if(inputHouseName.equals("r")) {
            	houseList.get(2).plusPoint(inputHouseName,inputPoint);
            }else if(inputHouseName.equals("h")) {
            	houseList.get(3).plusPoint(inputHouseName,inputPoint);
            }
            
            scanner.nextLine();
            System.out.println("Enter the reason");
            String reason = scanner.nextLine();
            
            System.out.printf("%d points for %s. Because%s", inputPoint, inputHouseName, reason);
			
			compRound ++;
			
		System.out.println("-----------------------------------------------------");
			
			if(compRound == 5) {
				loopOn = false;
			}
			
	        } catch (InvalidHouseNameException e ){
	        	System.out.println("Invalid house name entered. Please try again.\n");
	        } catch (InputMismatchException e) {
	        	System.out.println("Invalid point entered. Point should be a number. \n");
//	        	System.out.println("Enter the point again. \n");
//	        	scanner.nextLine();
	        }
				
		}
		
		 houseList.sort(null);
		//System.out.println(houseList);
//		for(House house: houseList) {
//			System.out.println(house.getHousePoint());
//		}
//		
		int rank = 1;
		
		//System.out.printf("1. %s: %d points.\n",  houseList.get(0).getHouseName(), houseList.get(0).getHousePoint());
		
		for (int i=0; i < 4; i++) {
			int max = houseList.get(0).getHousePoint();
			if(i==0) {
				System.out.printf("%d. %s: %d points.\n", rank, houseList.get(i).getHouseName(), houseList.get(i).getHousePoint());
				rank++;
				continue;
			}
			if(max == houseList.get(i).getHousePoint()) {
				 System.out.printf("---- %s: %d points.\n",  houseList.get(i).getHouseName(), houseList.get(i).getHousePoint());
				 
			}else {
				 System.out.printf("%d. %s: %d points.\n", rank, houseList.get(i).getHouseName(), houseList.get(i).getHousePoint());
			}
			rank++;
		}
//		
//		
//	    System.out.println("---final result---");
//	    System.out.println(String.format("%s: %d points.", gryff.getHouseName(), gryff.getHousePoint()));
//	    System.out.println(String.format("%s: %d points.", slyth.getHouseName(), slyth.getHousePoint()));
//	    System.out.println(String.format("%s: %d points.", raven.getHouseName(), raven.getHousePoint()));
//	    System.out.println(String.format("%s: %d points.", huffle.getHouseName(), huffle.getHousePoint()));
//	    
//	    
//
//	   	    
//	    House firstPrizeHouse = Collections.max(houseList, new CompHousePoint());
//	    //check if any teams have same value
//	    List <House> duplicatesHouses = new ArrayList<>(); 
//	    
//	    houseList.add(firstPrizeHouse);
//	
//	    System.out.println(String.format("%s won the 1st prize!", firstPrizeHouse.getHouseName()));
	    
        System.out.println("Bye!");
        scanner.close();
        System.exit(0);
	}
	
}







