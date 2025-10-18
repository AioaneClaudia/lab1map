public class ElektronikShop {
    public static int billigsteTastatur(int[] Preise){
        int min=Preise[0];
        for (int i = 1; i < Preise.length; i++)
            if(Preise[i]<min){
                min=Preise[i];
            }
        return min;
    }

    public static int teuersteGegenstand(int[] Tastaturen, int[] USB){
        int max=Tastaturen[0];
        for(int i = 1; i < Tastaturen.length; i++){
            if(Tastaturen[i]>max){
                max=Tastaturen[i];
            }
        }
        for(int i = 1; i < USB.length; i++){
            if(USB[i]>max){
                max=USB[i];
            }
        }
        return max;
    }

    public static int BudgetUSB(int[] USB, int budget){
        int max=0;
        for(int i = 1; i < USB.length; i++){
            if(USB[i]>max && USB[i]<=budget){
                max=USB[i];
            }
        }
        return max;
    }
}
