public class Practice203_01 {
    public static void main(String[] args) {
        int number = 7;
        int count = 100/number;
        //100になるまで7の倍数を出力する
        for (int i = 1; i < count + 1 ; i++){
            System.out.println(number*i);
        }
    }
}
