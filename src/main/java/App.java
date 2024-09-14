public class App {

    public static void main(String[] args) {  // 상단 돌고 하단이 끝날 때 까지 반복

        int a = 0;

        for (int i = 1; i < 5; i++) {

            int sum = a + i;

            System.out.print("상단" + sum + " ");



            for (int j = 1; j < 5; j++) {

                int sum2 = a + j;

                System.out.print("하단" + sum2 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}