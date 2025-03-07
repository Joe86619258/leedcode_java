package havaFinished;

/**
 * @version 1.0
 * @author: 娄时铭
 * @Date: 2024/11/21 16:13
 * 力扣668 图片平滑器
 * 2024/11/21 16:28
 */
public class T668imageSmoother {
    public static void main(String[] args) {
        int[][] img = {{100,200,100}, {200,50,200}, {100, 200, 100}};
        int[][] returnImg = imageSmoother(img);
        for (int i = 0; i < returnImg.length; i++) {
            for (int j = 0; j < returnImg[0].length; j++) {
                System.out.print(returnImg[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] imageSmoother(int[][] img) {
        int[][] returnImg = new int[img.length][img[0].length];
        int sum = 0;
        int num = 0;
        for (int i = 0; i < returnImg.length; i++) {
            for (int j = 0; j < returnImg[0].length; j++) {
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < img.length && y >= 0 && y < img[0].length) {
                            num++;
                            sum += img[x][y];
                        }
                    }
                }
                returnImg[i][j] = sum / num;
                sum = 0;
                num = 0;
            }
        }
        return returnImg;
    }
}
