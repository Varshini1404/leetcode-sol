class Solution {
    private int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public String fractionAddition(String expression) {
        int num=0,den=1;
        Scanner sc = new Scanner(expression).useDelimiter("/|(?=[-+])");
        while(sc.hasNext())
        {
            int nextnum=sc.nextInt();
            int nextden=sc.nextInt();

            num=num*nextden+nextnum*den;
            den=den*nextden;

            int gcd=gcd(Math.abs(num),den);
            num/=gcd;
            den/=gcd;
        }
        if(den<0)
        {
            num=-num;
            den=-den;
        }
        return num+"/"+den;
    }
}