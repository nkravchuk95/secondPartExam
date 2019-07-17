package differentElement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DiffElem {

	public static void main(String[] args) {
		
		int []arr = {1,4,5,1,1,3};
		
		Set<Integer> uniqueElements = new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

				System.out.println(uniqueElements.size());
	}

}
