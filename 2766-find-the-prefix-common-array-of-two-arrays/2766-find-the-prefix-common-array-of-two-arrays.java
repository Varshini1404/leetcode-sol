class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] result=new int[n];
        int[] c=new int[n+1];

        for(int i=0;i<n;i++)
        {
            c[A[i]]++;
            c[B[i]]++;
            result[i]=check(c,n);

        }
        return result;
    }
    private int check(int[] arr,int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==2)
            {
                count++;
            }
        }
        return count;
    }
}