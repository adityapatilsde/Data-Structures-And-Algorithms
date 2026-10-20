public class pc {
    static void print2dArray(int arr[][],int r,int c){
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sum2d(int arr1[][],int arr2[][],int r1,int c1,int r2,int c2){
        if (r1 != r2 || c1 != c2){
            return;
        }
        int result[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }
    static void multiply(int arr1[][],int arr2[][],int r1,int r2,int c1,int c2){
        if (c1 != r2){
            return;
        }
        int result[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < c1; k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }
    static int[][] transpose(int arr[][],int r,int c){
        int result[][] = new int[c][r];

        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
    static void reverse(int arr[],int i,int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static int[][] rotateby90(int arr[][],int r,int c){
        int transposed[][] = transpose(arr,r,c);
        for (int i = 0; i < arr.length; i++){
            //reverse(transposed[i]);
        }
        return transposed;
    }
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort0sand1s(int arr[]){
        int right = arr.length - 1;
        int left = 0;

        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
    }
   static void rotateinplace(int arr[],int k){
        int n = arr.length;
         k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
   }
   static int tripletSum(int arr[],int target){
        int n = arr.length;
        int answer = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                for (int k = j + 1 ; k < n; k++){
                    if (arr[i]+arr[j]+arr[k] == target){
                        answer++;
                    }
                }
            }
        }
        return answer;
   }
   static void printoneToN(int n){
        if (n == 0){
            return;
        }
        printoneToN(n-1);
       System.out.println(n);
   }
   static void printNtoOne(int n){
        if (n == 0){
            return;
        }
       System.out.println(n);
        printNtoOne(n-1);
   }
   static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return  n * factorial(n-1);
   }
   static int fibonacci(int n){
        if (n == 1 || n == 0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
   }
   static int sumfodigitsuptoN(int n){
        if (n == 0){
            return n;
        }
        return n + sumfodigitsuptoN(n-1);
   }
   static int countNoofDigits(int digit){
        if (digit > 0 && digit <= 9){
            return 1;
        }
        return 1 + countNoofDigits(digit/10);
   }
   static int praiseToq(int p,int q){
        if (q == 0){
            return 1;
        }
        return praiseToq(p,q - 1)*p;
   }
   static void naturalevennumber(int n){
        if (n == 1){
            return;
        }
        naturalevennumber(n-1);
        if (n %2 == 0){
            System.out.println(n);
        }
   }
    static void naturalOddnumber(int n){
        if (n == 0){
            return;
        }
        naturalOddnumber(n-1);
        if (n %2 != 0){
            System.out.println(n);
        }
    }
    static int GCD(int x,int y){
        if (y == 0){
            return x;
        }
        return GCD(y,x%y);
    }
    static void printArray(int arr[],int indx){
        if (indx == arr.length){
            return;
        }
        printArray(arr,indx+1);
        System.out.print(arr[indx]+" ");
    }
    static void printArrya(int arr[],int indx){
        if(indx == arr.length){
            return;
        }
        printArray(arr,indx+1);
        System.out.print(arr[indx]+" ");
    }

    static int findMax(int arr[],int index){
        if (index == arr.length-1){
            return arr[index];
        }
        int smallAns = findMax(arr,index+1);
        return Math.max(arr[index],smallAns);
    }
    static int sumofElements(int arr[],int index){
        if (index == arr.length - 1){
            return arr[index];
        }
        return arr[index] + sumofElements(arr,index+1);
    }
    static boolean checkExistence(int arr[],int indx,int target){
        if (indx == arr.length){
            return false;
        }
       return arr[indx] == target || checkExistence(arr,indx+1,target);
    }
    static int returnexistenecindex(int arr[],int indx,int target){
        if (indx == arr.length){
            return -1;
        }
        if (arr[indx] == target){
            return indx;
        }
        int ans = returnexistenecindex(arr,indx+1,target);
        return ans;
    }
    static int findMax(int arr[]){
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
    static void countSort(int arr[]){
        int n = arr.length;
        int output[] = new int[n];

        int max = findMax(arr);

        int count[] = new int[max+1];

        for (int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        for (int i = 1 ; i < count.length; i++){
            count[i] += count[i-1];
        }

        for (int i = n - 1; i >= 0; i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < arr.length; i++){
            arr[i]  = output[i];
        }
    }
    static int binarysearch(int arr[],int target){
        int n = arr.length;
        int start = 0 , end = n - 1;

        while (start <= end){
            int mid = (start+end) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
   static int findSqaureRoot(int arr[],int x){
        int  n = arr.length;
        int start = 0, end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == x){
                return mid;
            }
            else if((long) mid * mid < x){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;
   }
   public static void main(String[] args) {
        int arr[] = {10,20,25};
       System.out.println(findSqaureRoot(arr,5));
   }

}
