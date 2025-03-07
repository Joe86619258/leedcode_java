package havaFinished;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/21 14:40
 * 力扣 3248 矩阵中的蛇
 * 2024/11/21 15:16
 */
public class T3248finalPositionOfSnake {
    public static void main(String[] args) {
        int n =3;
        ArrayList<String> commands = new ArrayList<>();
        commands.add("DOWN");
        commands.add("RIGHT");
        commands.add("UP");
        System.out.println(finalPositionOfSnake(n,commands));
    }
    public static int finalPositionOfSnake(int n ,ArrayList<String> commands){
        int result = 0;
        for (String s : commands) {
            switch (s) {
                case "RIGHT":
                    result++; // 向右移动，位置增加1
                    break;
                case "LEFT":
                    result--; // 向左移动，位置减少1
                    break;
                case "DOWN":
                    result += n; // 向下移动，位置增加n
                    break;
                case "UP":
                    result -= n; // 向上移动，位置减少n
                    break;
                default:
                    // 如果有无效指令，可以选择抛出异常或者忽略
                    break;
            }
        }
        return result;
    }
}
