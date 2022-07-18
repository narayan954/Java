public class selectionsort {
    public static void main(String [] args){
        int [] arr = {20,35,-15,7,55,1,-22};
        int largest = 0;
        for (int LastUnsortedIndex = arr.length-1;LastUnsortedIndex>=0;LastUnsortedIndex--){
            for(int i = 0;i<LastUnsortedIndex;i++) {
                if (arr[i] > arr[largest])
                    largest = i;
            }
            int temp = arr[largest];
            arr[largest] = arr[LastUnsortedIndex];
            arr[LastUnsortedIndex] = temp;
            }
        for(int j =0;j< arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
