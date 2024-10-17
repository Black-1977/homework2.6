import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "четыре"));

        // Part 1
        System.out.println("Задание 1");

        List<Integer> nums1 = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                nums1.add(num);
            }
        }
        System.out.println(nums1);

        // Part 2
        System.out.println("Задание 2");

        List<Integer> nums2 = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0 && !nums2.contains(num)) {
                nums2.add(num);
            }
        }
        nums2.sort(Comparator.naturalOrder());
        System.out.println(nums2);

        // Part 3
        System.out.println("Задание 3");
        Set<String> strings1 = new HashSet<>();
        Map<String, Integer> map1 = new HashMap<>();

        for (String s : strings) {
            strings1.add(s);
            if (!map1.containsKey(s)){
                map1.put(s, 1);
            } else {
                map1.put(s, map1.get(s) + 1);
            }
        }
        System.out.println(strings1);

        // Part 4
        System.out.println("Задание 4");
        System.out.println(map1);
    }
}