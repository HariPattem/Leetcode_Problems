public class MergeSort {
    public void Msort(int arr[],int low,int high){
        if(low<high){
         int mid=(low+high)/2;
         Msort(arr,low,mid);
         Msort(arr, mid+1, high);
         merge(arr, low, mid, high);
        }
    }
    public void merge(int arr[],int low,int mid,int right){
      int n1=mid-low+1;
      int n2=right-mid;
      int leftArr[]=new int[n1];
      int rightArr[]=new int[n2];
      for(int i=0;i<n1;i++){
          leftArr[i]=arr[i+low];
      }
      for(int i=0;i<n2;i++){
        rightArr[i]=arr[mid+i+1];
    }


        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
        if(leftArr[i]>rightArr[j]){
            arr[k]=rightArr[j];
            j++;
        }else{
            arr[k]=leftArr[i];
            i++;
        }
        k++;
        }


            while(i<n1){
                arr[k]=leftArr[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=rightArr[j];
                j++;
                k++;
            }

    }
}