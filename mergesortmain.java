public class mergesortmain {


    public static void main(String[] args) {
        int arr[]={4,9,12,15,7,10,14};
        int low=0;
        int high=arr.length-1;
        mergeSort(arr,low,high);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }



    public static void mergeSort(int arr[],int low,int high){
        if(high>low){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }



    public static void merge(int arr[],int low,int mid,int high){
        int n1,n2;
        n1=mid-low+1;
        n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        int i,k,l,m;
        for(i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        k=0;
        m=0;
        l=0;
        while(k<left.length && m<right.length){
            if(left[k]<=right[m]){
                arr[l]=left[k];
                k++;
                l++;
            }
            else{
                arr[l]=right[m];
                m++;
                l++;
            }
        }
        while(k<left.length){
            arr[l]=left[k];
            k++;
            l++;
        }
        while(m<right.length){
            arr[l]=right[m];
            m++;
            l++;
        }
    }
}
