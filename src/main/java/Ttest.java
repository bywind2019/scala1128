/**
 * @Author lzc
 * @Date 2019-04-17 15:38
 */
public class Ttest {
    public static void main(String[] args) {

        final int a = 10;

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(a);

            }
        }.start();
    }
}
