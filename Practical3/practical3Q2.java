public class practical3Q2 {

    public static int returnSmallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        int[] array = {1, 2, 4, 5, 10, 100, 2, -22};
        System.out.println("The smallest number in the array is " + returnSmallest(array));

    }
}
