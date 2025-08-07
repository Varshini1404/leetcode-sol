class Solution {
    public String intToRoman(int num) {
        String[] t = {"","M","MM","MMM"};
        String[] h = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] te = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] o = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        String rom = "";

        rom+=t[num/1000];
        rom+=h[(num%1000)/100];
        rom+=te[(num%100)/10];
        rom+=o[num%10];
        
        return rom;
    }
}