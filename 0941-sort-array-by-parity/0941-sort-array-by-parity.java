class Solution {
    public int[] sortArrayByParity(int[] arr) {
        for(int i = 0; i < arr.length -1;i++){
            for(int j = i + 1;j < arr.length;j++){

                if(arr[j] % 2 == 0){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}