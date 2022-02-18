package gfg;

import java.util.*;

public class Common_Elememnts {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // List<Integer> l=new ArrayList<Integer>();
        // List<Integer> sec=new ArrayList<Integer>();
        // Set<Integer> s=new HashSet<>();
        // ArrayList<Integer> ans=new ArrayList<Integer>();

        // for(int i=0;i<n1;i++)
        // l.add(A[i]);

        // for(int i=0;i<n2;i++)
        // {
        // if(l.contains(B[i]))
        // {
        // sec.add(B[i]);
        // }
        // }
        // for(int i=0;i<n3;i++)
        // {
        // if(sec.contains(C[i]))
        // {
        // s.add(C[i]);
        // }
        // }
        // for(int v:s)
        // {
        // ans.add(v);
        // }
        // Collections.sort(ans);
        // return ans;

        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                s.add(A[i]);

                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

        for (int v : s) {
            ans.add(v);
        }
        Collections.sort(ans);
        return ans;

    }
}
