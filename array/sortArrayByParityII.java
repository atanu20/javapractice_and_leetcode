package array;

public class sortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        // int n = nums.length;
        // int[] a = new int[n];

        // List<Integer> odd=new ArrayList<>();
        // List<Integer> even=new ArrayList<>();

        // for(int i=0;i<n;i++)
        // {

        // if(nums[i]%2==0)
        // {
        // even.add(nums[i]);

        // }else{
        // odd.add(nums[i]);
        // }

        // }
        // int p=0;
        // for(int i=0;i<n/2;i++)
        // {
        // a[p++]=even.get(i);
        // a[p++]=odd.get(i);
        // //System.out.print(even.get(i)+" "+odd.get(i));

        // }

        // //System.out.println(even);
        // // System.out.println(odd);

        // return a;

        int n = nums.length;
        int odd = 1, even = 0;
        int[] a = new int[n];
        for (int v : nums) {
            if (v % 2 == 0) {
                a[even] = v;
                even = even + 2;
            } else {
                a[odd] = v;
                odd = odd + 2;
            }
        }

        return a;

    }
}
