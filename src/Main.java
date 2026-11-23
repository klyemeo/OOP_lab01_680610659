import java.util.Scanner;



void main(){
    int[] arr = Scanner();
    Sort(arr);
    findMax(arr);
}




void Sort(int arr[]){

    //int[] arr = Scanner();
    if(arr == null) return ;
    for(int i = 0 ; i < arr.length-1; i++ ){
    for(int j = 0 ; j < arr.length-1 ; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j + 1];
            arr[j + 1] = arr[j];
            arr[j] = temp;
        }
        }
    }
    for(int k = 0 ; k < arr.length ; k++){
        System.out.println(arr[k]);
    }
}

public static int[] Scanner(){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (num <= 0) {
        return null;
    }
    int[] arr = new int[num];
    for (int i = 0 ; i < num ; i++){
        Scanner k = new Scanner(System.in);
        int number = k.nextInt();
        arr[i] = number ;
    }
    return arr;
}



void findMax(int arr[]){

    //int[] arr = Scanner();
    if (arr == null) return ;
    int max = arr[0];
    for(int i = 0 ; i < arr.length-1 ; i++){
        if(max < arr[i+1]){
            max = arr[i+1];
        }
    }
    System.out.println("max : " + max);
}

