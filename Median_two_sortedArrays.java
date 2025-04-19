class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int num= n1+n2;
        int[] merged =new int[num] ;
        for(int i=0;i<n1;i++){
            merged[i]=nums1[i];
        } 
        for(int i=0;i<n2;i++){
            merged[i+n1]=nums2[i];
        }
        double median;
        Arrays.sort(merged);
        if(num%2!=0){
            median = merged[(num/2)];
        }else{
            median = (merged[(num/2)-1] + merged[(num/2)])/2.0;
        }
        return median;
    }
}