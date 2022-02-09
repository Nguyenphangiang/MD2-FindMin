public class FindMin {
    public static void main(String[] args) {
        int[]arr = {2,1,4,5,6,7,8,9,-10};
        int index = findMin(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int findMin(int[]array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<array[index]){
                index = i;
            }
        }return index;
    }
}
