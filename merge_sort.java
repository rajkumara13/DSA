package org.example;
import java.util.Arrays;
class Main{
    public static void merge(int [] arr1,int start,int mid,int end){
        int i=start;
        int j=mid;
        int k=start;
        int [] temp=new int [start+end];
        while(i<mid && j<end){
            if(arr1[i]<arr1[j]){
                temp[k++]=arr1[i++];
            }
            else{
                temp[k++]=arr1[j++];
            }
        }
        while(i<mid){
            temp[k++]=arr1[i++];
        }
        while(j<end) {
            temp[k++] = arr1[j++];
        }
        for(int t=start;t<end;t++){
            arr1[t]=temp[t];
        }

    }
    public static void mergesort(int [] arr,int start,int end){
        if(end-start==1)return;
        int mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void main(String[] args){
        int [] arr1={1,2,3,4,4,5,6,2333,2,5,6,7,8};
        mergesort(arr1,0,arr1.length);
        System.out.println(Arrays.toString(arr1));
    }
        }


