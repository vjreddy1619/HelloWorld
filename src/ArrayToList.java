import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/**
 * finding Min and Max values from int[]
 * @author hp
 *
 */
public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3};
		List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		if (list == null || list.size() == 0) {
            System.out.println(Integer.MAX_VALUE); 
        }
  
        // create a new list to avoid modification
        // in the original list
        List<Integer> sortedlist = new ArrayList<>(list);
  
        // sort list in natural order
        Collections.sort(sortedlist);
        
        System.out.println("Min Value ="+sortedlist.get(0));
        System.out.println("Max Value ="+sortedlist.get(sortedlist.size() - 1));

	}

}
