class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }

        list.sort(new LexicographicalComparator());

        return list;
    }
}

public class LexicographicalComparator implements Comparator<Integer>{
    
    @Override
    public int compare(Integer num1, Integer num2){
        return String.valueOf(num1).compareTo(String.valueOf(num2));
    }

}