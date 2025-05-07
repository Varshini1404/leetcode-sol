class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }

        int p = 0,ne = 0;
        if(i<n && s.charAt(i)=='+')
        {
            p++;
            i++;
        }
        if(i<n && s.charAt(i)=='-')
        {
            ne++;
            i++;
        }
        double a = 0;

        while(i<n && s.charAt(i)>='0'&&s.charAt(i)<='9')
        {
            a=a*10+(s.charAt(i)-'0');
            i++;
        }
        if(ne>0)
        {
            a=-a;
        }
        if(p>0 && ne>0)
        {
            return 0;
        }
        return (int)a;
        
    }
}