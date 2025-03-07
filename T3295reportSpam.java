package havaFinished;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/12/18 10:49
 * 力扣 3295 举报垃圾信息 中等
 * 2024/12/18 10:57
 *
 * HashSet和ArrayList的区别:
 *      1.数据结构
 *          HashSet：基于哈希表实现，不保证元素的顺序，元素是唯一的（不允许重复）。
 *          ArrayList：基于动态数组实现，元素有序，允许重复元素。
 *      2.元素唯一性
 *          HashSet：不允许重复元素，如果尝试添加已存在的元素，则不会添加。
 *          ArrayList：允许重复元素，可以包含多个相同的元素。
 *      3.性能特点
 *          HashSet：
 *              快速查找：平均情况下，添加、删除和查找元素的时间复杂度为 O(1)。
 *              慢速迭代：由于元素是无序的，迭代时可能需要更多的时间来找到下一个元素。
 *          ArrayList：
 *              快速随机访问：通过索引访问元素的时间复杂度为 O(1)。
 *              慢速添加和删除：在列表的中间或开始添加或删除元素时，需要移动后续的所有元素，时间复杂度为 O(n)。
 *      4. 内存使用
 *          HashSet：通常比 ArrayList 使用更多的内存，因为它需要额外的空间来维护哈希表结构。
 *          ArrayList：通常比 HashSet 使用更少的内存，因为它只需要存储元素数组。
 *      5. 线程安全
 *          HashSet 和 ArrayList：两者都不是线程安全的。如果需要在多线程环境中使用，可以考虑使用 Collections.synchronizedSet 和 Collections.synchronizedList 来包装它们，或者使用 ConcurrentHashMap 作为 HashSet 的替代品。
 *      6. 用途
 *          HashSet：适合于需要快速查找、添加和删除操作，且不需要元素有序的场景。
 *          ArrayList：适合于需要快速随机访问元素，且元素顺序重要的场景。
 *      7. 迭代器行为
 *          HashSet：迭代器在遍历时不会保证元素的顺序。
 *          ArrayList：迭代器按照元素添加的顺序遍历元素。
 *      8. 空值处理
 *          HashSet：允许 null 元素。
 *          ArrayList：也允许 null 元素。
 */
public class T3295reportSpam {
    public static void main(String[] args) {
        String[] message={"hello","world","leetcode"};
        String[] bannedWords = {"world","hello"};
        System.out.println(reportSpam(message,bannedWords));
    }
    public static boolean reportSpam(String[] message,String[] bannedWords){
        HashSet<String> set = new HashSet<>(Arrays.asList(bannedWords));
        int count = 0;
        for (String s : message) {
            if (set.contains(s)&&++count>=2){
                return true;
            }
        }
        return false;
    }
}
