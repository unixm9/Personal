public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(goodPairs(nums));
    }
    static int goodPairs(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
