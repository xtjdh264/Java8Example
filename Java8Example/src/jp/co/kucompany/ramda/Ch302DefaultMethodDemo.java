package jp.co.kucompany.ramda;

public class Ch302DefaultMethodDemo {

    // リスト3.24 デフォルトメソッドの記述例

    // デフォルトメソッド
    interface Greeting {
        default void sayTo(String person) {
            System.out.println("Nice to meet you, " + person + "!");
        }
    }

    private void testGreeting() {
        // 匿名クラスオブジェクトの生成
        Greeting greeting = new Greeting() {};

        // デフォルトメソッドのコール
        greeting.sayTo("Java");
    }

    public Ch302DefaultMethodDemo() {
        testGreeting();
    }

    public static void main(String... args) {
        new Ch302DefaultMethodDemo();
    }
}
