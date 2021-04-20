public class 第一次作业素数 {
    public static void main(String[] args) {
        int i = 50;
        for (i = 50; i <= 100; i++) {
            if (PanDuan(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean PanDuan(int x) {
        boolean j = true;
        for (int y = 2; y <= x / 2; y++) {
            if (x % y == 0) {
                j = false;
                break;
            }
        }
        return j;
    }
}