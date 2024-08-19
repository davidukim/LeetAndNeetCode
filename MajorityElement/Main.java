package MajorityElement;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        int[] nums2 = {2,2,1,1,1,2,2};
        
        MajorityElement elemFinder = new MajorityElement();

        System.out.println(elemFinder.majorityElement(nums1));
        System.out.println(elemFinder.majorityElement(nums2)); 
    }
}
