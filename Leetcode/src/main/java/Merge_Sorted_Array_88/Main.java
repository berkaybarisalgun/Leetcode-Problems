package Merge_Sorted_Array_88;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();

        // İlk dizi ve onun eleman sayısı
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        // İkinci dizi ve onun eleman sayısı
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1,m,nums2,n);

    }
}
