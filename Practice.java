import java.util.Scanner;
class Arrays{
static void printArr(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
static void sumofAllelemnts(int arr[]){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    System.out.println("Sum of all elements: "+sum);
}
static void avgOfAllElements(int arr[]){
    int n = arr.length;
    int sum = 0,avg = 0;
    for (int i = 0; i < n;i++){
        sum += arr[i];
    }
    avg = sum / n;
    System.out.println("Average pf all elemenrs: "+avg);
}
static void maxElement(int arr[]){
    int n = arr.length;
    int max = arr[0];
    for (int i = 1; i < n; i++){
        if (arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println("Max element value: "+max);
}
static void minElement(int arr[]){
    int n = arr.length;
    int min = arr[0];
    for (int i = 1 ; i < n; i++){
        if (arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("Min element value: "+min);
}
static void tyepofElementCount(int arr[]){
    int pos = 0,neg = 0,zero = 0;

    for (int i = 0; i < arr.length; i++){
        if (arr[i] == 0){
            zero++;
        }
        else if(arr[i] > 0){
            pos++;
        }
        else {
            neg++;
        }
    }
    System.out.println("Number of positive elements: "+pos);
    System.out.println("Number of Negative elements: "+neg);
    System.out.println("Number of Zero elements: "+zero);
}
static void evenOddCount(int arr[]){
    int even = 0, odd = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] %2 == 0 && arr[i] != 0){
            even++;
        }
        if (arr[i] %2 != 0 && arr[i] != 0) {
            odd++;
        }
    }
    System.out.println("Even number count: "+even);
    System.out.println("Odd number count: "+odd);
}
static void maxindex(int arr[]){
    int max = 0;
    for (int i = 1; i < arr.length; i++){
        if (arr[i] > arr[max]){
            max = i;
        }
    }
    System.out.println("Max element index: "+max);
}
static void minindex(int arr[]){
    int min = 0;
    for (int i = 1; i < arr.length; i++){
        if (arr[i] < arr[min]){
            min = i;
        }
    }
    System.out.println("Min element index: "+min);
}
static void greaterthank(int arr[],int key){
    for (int i = 0; i < arr.length; i++){
        if (arr[i] > key){
            System.out.println("value greater than key: "+arr[i]);
        }
    }
}
static boolean checkexistence(int arr[], int key){
  boolean flag = false;
  for (int i = 0; i < arr.length; i++){
      if (arr[i] == key){
          flag = true;
      }
  }
  return flag;
}
static void countoccurence(int arr[],int key){
    int count = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] == key){
            count++;
        }
    }
    System.out.println("Number of occurrences of the key element: "+key);
}
static void firstOccurence(int arr[],int key){
    for (int i = 0; i < arr.length; i++){
        if (arr[i] == key){
            System.out.println(key+"value first occurence at index position: "+i);
            return;
        }
    }
    System.out.println("Element does not exists");
}
    static void LastOccurence(int arr[],int key){
    int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                index = i;
            }
        }
        System.out.println("Last occurence at index: "+index);
    }
    static boolean allunique(int arr[]){
    boolean flag = true;
    for (int i = 0; i < arr.length - 1; i++){
        for (int j = i + 1; j < arr.length; j++){
            if (arr[i] == arr[j]){
                flag = false;
                break;
            }
        }
        if (!flag){
            break;
        }
    }
    return flag;
    }
    static int sumOfeven(int arr[]){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] %2 == 0){
            sum += arr[i];
        }
    }
    return sum;
    }
    static int sumOfOdd(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] %2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
    static void primeCount(int arr[]){
   // int count = 0;
    for (int i = 0; i < arr.length; i++){
        int count = 0;
        for (int j = 1; j <= arr[i]; j++){
            if (arr[i] % j == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Is a prime number: "+arr[i]);
        }
    }
    }
    static void sqaureArr(int arr[]){
    int arr_2[] = new int[arr.length];

    for (int i = 0; i < arr.length; i++){
        arr_2[i] = arr[i] * arr[i];
    }
    printArr(arr_2);
    }
    static void evenArr(int arr[]){
    int index = 0 , count = 0;

    for (int i = 0; i < arr.length; i++){
        if (arr[i] %2 == 0){
            count++;
        }
    }
        int arr2[] = new int[count];
         for (int i = 0; i < arr.length; i++){
             if (arr[i] %2 == 0){
                 arr2[index++] = arr[i];
             }
         }
         printArr(arr2);

    }
    static void replaceNeg(int arr[]){
    for (int i = 0; i < arr.length; i++){
        if (arr[i] < 0){
            arr[i] = 0;
        }
    }
    printArr(arr);
    }
    static void replaceevenodd(int arr[]){
    for (int i = 0; i < arr.length; i++){
        if (arr[i] %2 == 0){
            arr[i] = 1;
        }
        else{
            arr[i] = 0;
        }
    }
    printArr(arr);
    }
    static void swap(int arr[],int left,int right){
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    }
    static void reverse(int arr[]){
    int left = 0,right = arr.length-1;
    while (left < right){
        swap(arr,left,right);
        left++;
        right++;
    }
    }
    static void swapAlternate(int arr[]){
    for (int i = 0; i < arr.length - 1; i++){
        swap(arr,i,i+1);
        i++;
    }
    printArr(arr);
    }
    static void copyonetoanother(int arr[]){
    int arr_2[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++){
        arr_2[i] = arr[i];
    }
    printArr(arr_2);
    }
}
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //Arrays.primeCount(arr);
        //Arrays.sqaureArr(arr);
        //Arrays.evenArr(arr);
      //  Arrays.replaceNeg(arr);
        //Arrays.replaceevenodd(arr);
        Arrays.swapAlternate(arr);

       // Arrays.sumofElements(arr);
    }
}
