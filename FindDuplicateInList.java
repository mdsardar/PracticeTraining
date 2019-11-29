import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class FindDuplicateInList {

    public static void main(String[] args) {

        // Load all your ArrayList
        List<String> list = new ArrayList<String>();
        list.add("Jhon");
        list.add("Jency");
        list.add("Mike");
        list.add("Dmitri");
        list.add("Mike");

        // Set will not allow duplicates
        Set<String> checkDuplicates = new HashSet<String>();

        System.out.println("Actual list " + list);
        for (int i = 0; i < list.size(); i++) {
            String items = list.get(i);
            if (!checkDuplicates.add(list.get(i))) {
                // retain the item from set interface
                System.out.println("Duplicate in that list " + list.get(i));
            }
        }		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
		Set<Integer> duplicated = numbers.stream().filter(n -> numbers.stream().filter(x -> x == n).count() > 1).collect(Collectors.toSet());
		System.out.println("Duplicate found through Streams are " + duplicated);
    }
}