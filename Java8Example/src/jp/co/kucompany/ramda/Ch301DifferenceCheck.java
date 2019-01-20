package jp.co.kucompany.ramda;

import java.util.function.Supplier;

//リスト3.19 ラムダ式と匿名クラスの違い

public class Ch301DifferenceCheck {
    
    public Ch301DifferenceCheck() {
        
        Supplier<Void> func1 = new Supplier<Void>() {
            @Override
            public Void get() {
                System.out.println("Task1 class: " + this.getClass());
                return null;
            }
        };
                        
        
        Supplier<Void> func2 = () -> { 
            System.out.println("Task2 class: " + this.getClass());
            return null;
        };

        func1.get();
        func2.get();
    }
    
    public static void main(String... args) {
        new Ch301DifferenceCheck();
    }
}
