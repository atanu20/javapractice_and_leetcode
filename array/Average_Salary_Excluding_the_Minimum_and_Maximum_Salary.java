package array;

public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = salary.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, salary[i]);
        }
        for (int i = 0; i < n; i++) {
            min = Math.min(min, salary[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (salary[i] != max && salary[i] != min) {
                sum += salary[i];
            }
        }
        // System.out.println(max+" "+min+" "+sum);
        double ans = (double) sum / (n - 2);
        return ans;

    }
}
