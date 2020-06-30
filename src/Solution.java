import java.util.Arrays;
import java.util.HashMap;
/* The isBadVersion API is defined in the parent class VersionControl.
       */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null ||str == null){//如果两个长度都为零 返回false
            return false;
        }
        String[] string = str.split(" ");
        if(pattern.length()!=string.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char tmp = pattern.charAt(i);
            if(map.containsKey(tmp)){
                if(!map.get(tmp).equals(string[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(string[i])){
                    return false;
                }else{
                    map.put(tmp,string[i]);
                }
            }
        }
        return true;
    }
    public int firstBadVersion(int n) {
        int low=1,high=n,mid;
        if(high==1){
            return 1;
        }else if(high==2){
            if (isBadVersion(1)) {
                return 1;
            }else{
                return 2;
            }
        }
        while(high-low!=1){
            mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                high=mid;
            }else{
                low=mid;
            }
        }
        return high;
    }
    boolean isBadVersion(int version){
        return true;
    }
    public int missingNumber(int[] nums) {
        int len =nums.length;
        for (int i = 1; i <len ; i++) {
            nums[0]+=nums[i];
        }
        return (len*len+len)/2-nums[0];
    }
    public int addDigits(int num) {
        int res=0;
        do{
            while (num != 0) {
                res+=num%10;
                num/=10;
            }
            if(res<10){
                return res;
            }
            num=res;
        }while(res>9);
        return 0;
    }
    public boolean isUgly(int num){
        if(num<1){
            return false;
        }
        while(num%5==0){
            num/=5;
        }
        while(num%3==0){
            num/=3;
        }
        while(num%2==0){
            num/=2;
        }
        return num==1;
    }
    public boolean isAnagram(String s, String t) {
        int slen=s.length(),tlen=t.length();
        if(slen!=tlen){
            return false;
        }
        int[] sc=new int[slen],tc=new int[tlen];
        for (int i = 0; i <slen ; i++) {
            sc[i]=s.charAt(i);
            tc[i]=t.charAt(i);
        }
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc,tc);
    }
    public boolean isPalindrome(ListNode head) {
        ListNode res = reverseList(head);
        while(head!=null){
            if(head.val!=res.val){
                return false;
            }
            head = head.next;
            res = res.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next =null;
        return newHead;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode rightTree = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(rightTree);
        return root;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + k && j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isIsomerphicHelper(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                } else
                    map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

