package leetcode;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;

        // logn
        /*
         * 
         * int n=arr.length;
         * int l=0;
         * int h=n-1;
         * 
         * 
         * while(l<=h)
         * {
         * int mid=(l+h)/2;
         * 
         * if((mid==0|| arr[mid]>=arr[mid-1])&&(mid==n-1 || arr[mid]>=arr[mid+1]))
         * return mid;
         * else if(arr[mid]<arr[mid+1])
         * {
         * l=mid+1;
         * }else{
         * h=mid-1;
         * }
         * }
         * return -1;
         */

    }
}
