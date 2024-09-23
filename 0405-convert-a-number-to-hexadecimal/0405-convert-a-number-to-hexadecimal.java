class Solution {
    public String toHex(int num) {
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        StringBuilder sb=new StringBuilder();
        
        do{
            sb.insert(0,hex[num&15]);//mod by 16
        }while((num>>>=4)>0);//divide by 16
        return sb.toString();

    }
}