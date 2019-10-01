package Codewars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> outputStrings = Arrays.asList(arr) ;
    	boolean isReduced = true;
        while (isReduced) {
        	isReduced = false;
        	ArrayList<String> temp = new ArrayList<String>();
        	for (int i = 0; i < outputStrings.size(); i++) {
        		if (i+1 < outputStrings.size() && isOpposite(outputStrings.get(i), outputStrings.get(i+1))) {
        			isReduced = true;
        			i++;
        		} else {
        			temp.add(outputStrings.get(i)); 
        		}
        	}
        	outputStrings =  temp;
        }
        Object[] objectTemp = outputStrings.toArray();
        String[] output = new String[objectTemp.length];
        for (int i = 0; i < objectTemp.length; i++) {
        	output[i] = (String) objectTemp[i];
        }
        return output;
    }

	private static boolean isOpposite(String dir1, String dir2) {
		boolean isOpposite = false;
		String north = "NORTH";
		String south = "SOUTH";
		String east = "EAST";
		String west = "WEST";
		if (dir1.equals(north) && dir2.equals(south)) {
			isOpposite = true;
		} else if (dir1.equals(south) && dir2.equals(north)) {
			isOpposite = true;
		} else if (dir1.equals(east) && dir2.equals(west)) {
			isOpposite = true;
		} else if (dir1.equals(west) && dir2.equals(east)) {
			isOpposite = true;
		}
		return isOpposite;
	}
}