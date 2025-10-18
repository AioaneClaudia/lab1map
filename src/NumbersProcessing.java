public class NumbersProcessing {
    public static int[] Add(int[] number1,int[] number2){
        int[] sum=new int[number1.length];
        for(int i=number1.length-1;i>=0;i--){
            sum[i]=number1[i]+number2[i];
            if (sum[i]>9){
                sum[i]=sum[i]%10;
                if (i==0){
                    int[] large_sum=new int[sum.length+1];
                    for(int j=large_sum.length-1;j>0;j--){
                        large_sum[j]=sum[j-1];
                    }
                    large_sum[0]=1;
                    return large_sum;
                }
                else
                    number1[i-1]+=1;
            }
        }
        return sum;
    }

    public static int[] Diff(int[] number1,int[] number2){
        int[] diff=new int[number1.length];
        for(int i=number1.length-1;i>=0;i--){
            if(number1[i]<number2[i]){
                diff[i]=(10+number1[i])-number2[i];
                number1[i-1]-=1;
            }
            else{
                diff[i]=number1[i]-number2[i];
            }
        }
        if(diff[0]==0){
            int[] smaller_result=new int[diff.length-1];
            for(int j=smaller_result.length-1;j>=0;j--){
                smaller_result[j]=diff[j+1];
            }
            return smaller_result;
        }
        return diff;
    }

    public static int[] Multiply(int[] number,int digit){
        int[] result=new int[number.length];
        for (int i=number.length-1;i>=0;i--){
            result[i]=number[i]*digit;
            int res=result[i];
            if(i!=number.length-1){
                if  (result[i+1]>9){
                    result[i]+=result[i+1]/10;
                    result[i+1]=result[i+1]%10;
                }
            }
            if(i==0 && result[i]>9){
                int[] larger_res=new int[number.length+1];
                for(int j=larger_res.length-1;j>1;j--){
                    larger_res[j]=number[j-1];
                }
                larger_res[0]=res/10;
                larger_res[1]=res%10;
                return larger_res;
            }
        }
        return result;
    }

    public static int[] Division(int[] number,int digit){
        int[] result=new int[number.length];
        int[] rest=new int[number.length];
        int nr;
        for (int i=0;i<number.length;i++){
            if(i>0 && rest[i-1]>0){
                nr=rest[i-1]*10+number[i];
            }
            else
                nr=number[i];
            result[i]=nr/digit;
            if(nr%digit!=0){
                int mul=0;
                for(int j=nr;j>0;j--){
                    if(j*digit<nr){
                        result[i]=j;
                        mul=j;
                        j=0;
                    }
                }
                rest[i]=nr-digit*mul;
            }
        }
        if(result[0]==0){
            int[] smaller_result=new int[result.length-1];
            for(int j=smaller_result.length-1;j>=0;j--){
                smaller_result[j]=result[j+1];
            }
            return smaller_result;
        }
        return result;
    }
}
