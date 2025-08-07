class Solution {
    public String intToRoman(int num) {
        String[] t = {"","M","MM","MMM"};
        String[] h = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] te = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] o = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        StringBuilder sb = new StringBuilder();

        sb.append(t[num/1000]);
        sb.append(h[(num%1000)/100]);
        sb.append(te[(num%100)/10]);
        sb.append(o[num%10]);
        
        return sb.toString();
    }
}