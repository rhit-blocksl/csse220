/**
 * Examples of iterating over arrays. 
 * 
 * @author Ian Ludden
 */
public class ArrayIteration {

    public static void main(String[] args) {
        // uncomment each to test it
        //exampleOne();
        exampleTwo();
        // exampleThree();
    }

    private static void exampleOne() {
        int[] arr = new int[5]; // TODO: add some values for testing
        int sum = 0;
        int i;
        for(i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            sum+= arr[i];
        }

        
        // TODO: add your code here
        
        System.out.println(sum);
    }

    private static void exampleTwo() {
        int[] triangles = new int[5]; // TODO: consider changing 10 during testing
        int i;
        int z = 1;
        for(i = 1; i < triangles.length; i++) {
            triangles[i] = z + i;
            z++;
        }


        // TODO: add your code here

        // This prints the results so you can check your work
        for (int j = 0; j < triangles.length; j++) {
            System.out.println("triangles[" + j + "] = " + triangles[j]);
        }
    }

    private static void exampleThree() {
        double[] earnings = {5.3, 2.2, -1.4, 6.8, -3.7}; // TODO: modify during testing

        // TODO: add your code here
    }

    

}
