import java.util.Comparator;

public class CompHousePoint implements Comparator<House> {
    public int compare(House a, House b) {
        if (a.getHousePoint() > b.getHousePoint())
            return 1; 
        if (a.getHousePoint() == b.getHousePoint())
            return 0;
        return -1;
    }
   
}