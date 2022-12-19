public class Main {
    public static void main(String[] args) {
        
        int[] array = new int[10]; //Create an empty array
        try {
            //Assign values in array
            array[1] = 5;
            array[7] = 3;
            array[9] = 8;
            array[3] = 1;
            array[10] = 11;
        } catch (Exception e) {
            //Print the error
            System.out.println("Tried to assign a value to an out of bounds index in an array.");
        }

        //Print that the program has not crashed
        System.out.println("The exception was caught and the program has not crashed.");

        try {
            //Calculate some math problems
            System.out.println(2*3);
            System.out.println(5+11);
            System.out.println(8/4);
            System.out.println(6+15);
            System.out.println(5/0);
            System.out.println(6*5);
        } catch (Exception e) {
            //Print the error
            System.out.println("Tried to divide by 0.");
        }

        //Print that the program has finished without crashing
        System.out.println("The program finished without crashing.");
    }
}
