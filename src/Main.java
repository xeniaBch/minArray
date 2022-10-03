public class Main {
    public static void main(String[] args) {
        System.out.println(minArray(new int[]{-5, 6, 3, -5, 0}, 0));
    }

    private static int minArray(int[] arr, int index) {
        if(index == arr.length-1){
            return arr[index];
        }
        return min(arr[index], minArray(arr, index+1));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}
