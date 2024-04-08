package Sample;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExaple2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            //ここに例外が発生する可能性あるコードを書きます。
            System.out.println("割り算開始");
            int a = devide (10,0);
            System.out.println(a);
            
        } catch ( ArithmeticException e){
            // ArithmeticaExceptionが発生した場合の処理を書きます
            System.out.println("Arithmetic Exception caught:"+e.getMessage());
        }finally {
            //例外の有無にかかわらず、実行されるコードを書きます（オプション）
            System.out.println("割り算終了");
        }
        System.out.println("処理終了");

    }

    public static int devide(int a, int b)throws ArithmeticException {
        if (b==0){
            throw new ArithmeticException("ゼロ徐算えらーです");
            
        }
            
        return a/b;
    }

}
