package sardar.java.practice;

public class TestMultipleCatchBlock {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[6] = 30 / 1;
		}  catch(ArithmeticException | ArrayIndexOutOfBoundsException |NumberFormatException e){  
            System.out.println(e.getMessage());  
        }  			
		/*} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");*/
		/* catch (Exception e) {
			System.out.println("common task completed");
		}*/

		System.out.println("rest of the code...");
	}
}
