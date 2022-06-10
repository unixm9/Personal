public class ceilingNum {
    public static void main(String[] args) {
        int[] arr ={-9,-2,-1,51,55,66,205,602};
        int target = 53;
        System.out.println("Element found at index "+binsrch(arr,target));
    }
    static int binsrch(int[] arr,int target) {
        if(target> arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]) {
                end = mid - 1;
            }
            else if(target>arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return arr[start];
    }
}