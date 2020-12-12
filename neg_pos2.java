class  sol{
    public int[] solution(int arr[]){
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            if(arr[p1]>0 && arr[p2] < 0){
                p1++;
                p2--;
            }
            else if(arr[p1]<0 && arr[p2] > 0){
                int temp = arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                p1++;
                p2--;

            }
            else if(arr[p1]>0 && arr[p2]>0){
                p1++;
            }
            else if(arr[p1]<0 && arr[p2]<0){
                p2--;
            }
        }


        return arr;
    }
 }
 
 
 
 
 class neg_pos{
     public static void main(String[] args){
         int[] arr = {4,-3,6,7,2,-8,-9,10,-8,-12,-19};
           sol ob =   new sol(); 
           int[] ans = ob.solution(arr);
           for(int i : ans){
               System.out.print(i+" ");
           }
     }
 }
