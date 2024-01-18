import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -1;
        for (int[] account : accounts) {
            int num = 0;
            for (int i : account) {
                num += i;
            }
            if (num > max) max = num;
        }
        return max;
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            result.add(
                    i % 3 == 0 && (i % 5) == 0 ? "FizzBuzz" :
                            i % 3 == 0 ? "Fizz" :
                                    i % 5 == 0 ? "Buzz" :
                                            String.valueOf(i)
            );
        }
        return result;
    }

    public int numberOfSteps(int num) {
        int result = 0;
        while (num > 0) {
            if (num % 2 == 0) num = num / 2;
            else num = num - 1;
            result++;
        }
        return result;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static class ListNode {
        int val;

        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    /*public boolean canConstruct(String ransomNote, String magazine) {
        return magazine.contains(ransomNote);
    }*/

    public static void main(String[] args) {


        Solution solution = new Solution();

        int[][] asas = {{1, 2}, {3, 2}, {3, 4}};
        System.out.println(solution.maximumWealth(asas));

        System.out.println(solution.fizzBuzz(5));

        System.out.println(solution.numberOfSteps(123));

        ListNode listNode = new ListNode(12, new ListNode(34, new ListNode(23, new ListNode(12, new ListNode(6)))));
        System.out.println(solution.middleNode(listNode));

        //System.out.println(solution.canConstruct("aa", "aab"));
    }
}
