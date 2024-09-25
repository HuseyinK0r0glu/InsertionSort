public class Main {
    public static void main(String[] args) {

        int[] a = {4,58,2,3,67,35,1,88,1};

        insertionSort(a);

        for(int i : a){
            System.out.print(i + " ");
        }
    }


    public static int[] insertionSort(int[] a){

        int N = a.length;

        for(int i = 1;i<N;i++){

            for(int j = i;j>0;j--){

                if(less(a[j],a[j-1])){
                    exchange(a,j,j-1);
                }

            }

        }

        return a;
    }


    public static boolean less(int i,int j){

        if(i < j){
            return true;
        }
        return false;
    }

    public static void exchange(int[] a ,int i,int j){

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}