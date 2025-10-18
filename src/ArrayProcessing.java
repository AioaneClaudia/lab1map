public class ArrayProcessing {
    public static int Min(int[] array){
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static int Max(int[] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int maximale_Summer(int[] array){
        int sum=0;
        int min=Min(array);
        for (int i=0;i<array.length;i++){
            if (array[i]!=min){
                sum+=array[i];
            }
        }
        return sum;
    }

    public static int minimale_Summe(int[] array){
        int sum=0;
        int max=Max(array);
        for (int i=0;i<array.length;i++){
            if (array[i]!=max){
                sum+=array[i];
            }
        }
        return sum;
    }
}
