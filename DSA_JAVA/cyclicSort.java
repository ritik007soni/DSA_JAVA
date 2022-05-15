import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args){
        cyclicSort cy = new cyclicSort();
        int[] a = {5,4,3,2,1};
        cy.sort(a);
        System.out.println(Arrays.toString(a));
    }

    void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
