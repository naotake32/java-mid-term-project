import java.util.Comparator;

class InvalidHouseNameException extends Exception{
	public InvalidHouseNameException(String str) {
		super(str);
	}
}

public class House implements Comparable <House> {
	private String houseName;
	private int housePoint;
   
    // constructor
    House(String houseName){
        this.houseName = houseName;
        //this.housePoint = 0;
    }
		
    public String getHouseName() {
        return houseName;
    }
    
    public int getHousePoint() {
        return housePoint;
    }
    
    public int plusPoint(String inputHouse, int num ) throws InvalidHouseNameException{
    	switch (inputHouse){
    	case "g":
    		housePoint += num; 
    		break;
    	case "s":
    		housePoint += num; 
    		break;
    	case "r":
    		housePoint += num; 
    		break;
    	case "h":
    		housePoint += num; 
    		break;	  
    	
    		default:
    		throw new InvalidHouseNameException("Invalid house name entered.");
    	}
    	
    	return housePoint;
    	}


	@Override
	public int compareTo(House o) {
		if (housePoint > o.getHousePoint())
            return -1; 
        if (housePoint == o.getHousePoint())
            return 0;
        return 1;
	}
}
