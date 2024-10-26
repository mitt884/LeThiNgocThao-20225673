package Lab01;
import java.util.Scanner;

public class SortArray {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static int cal(int[] arr, int dau, int cuoi){
        int tb = arr[cuoi];  
        int i = dau - 1;
        for(int j = dau; j <= cuoi - 1; j++){
            if(arr[j] < tb){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, cuoi);
        return i + 1;  
    }

    
    static void Sort(int[] arr, int dau, int cuoi){
        if(dau < cuoi){
            int i = cal(arr, dau, cuoi);  
            Sort(arr, dau, i - 1);  
            Sort(arr, i + 1, cuoi);  
        }
    }

    public static void main(String[] args){
        
        System.out.println("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] arr = new int[input];
        int sum = 0;

        System.out.println("Enter elements: ");
        for(int i = 0; i < input; i++){
            arr[i] = sc.nextInt();
        }

        Sort(arr, 0, arr.length - 1);
        
        System.out.println("\nThe sorted array: ");
        for(int i = 0; i < input; i++){
            System.out.print(arr[i] + " ");
            sum += arr[i]; 
        }
        
        System.out.println("\nSum: " + sum);

        double avg = (double) sum / input;
        System.out.println("Average: " + avg);

        sc.close();
        System.exit(0);
    }
}
