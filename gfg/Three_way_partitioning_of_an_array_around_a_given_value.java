package gfg;

public class Three_way_partitioning_of_an_array_around_a_given_value {
    public void threeWayPartition(int arr[], int a, int b) {
        // int n=arr.length, p=0;
        // int l[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        // if(arr[i]<a)
        // {
        // l[p++]=arr[i];
        // }
        // }
        // for(int i=0;i<n;i++)
        // {
        // if(arr[i]>=a && arr[i] <=b )
        // {
        // l[p++]=arr[i];
        // }
        // }
        // for(int i=0;i<n;i++)
        // {
        // if( arr[i] > b )
        // {
        // l[p++]=arr[i];
        // }
        // }

        // for(int i=0;i<n;i++)
        // {
        // arr[i]=l[i];
        // }

        int n = arr.length;
        int start = 0, end = n - 1;

        for (int i = 0; i <= end;) {
            if (arr[i] < a) {
                int t = arr[start];
                arr[start] = arr[i];
                arr[i] = t;
                start++;
                i++;
            } else if (arr[i] > b) {
                int t = arr[end];
                arr[end] = arr[i];
                arr[i] = t;
                end--;

            } else {
                i++;
            }
        }

    }
}