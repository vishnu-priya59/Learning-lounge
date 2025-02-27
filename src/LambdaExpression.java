
public class LambdaExpression {
        public static void main(String[] args) {
            A obj = (i,j) -> System.out.println("show me");
           obj.show(5,7);
        }
    }
    interface A {
        void show(int i, int j);
    }




/*public class LambdaExpression {
    public static void Multithreading.Main(String[] args) {
        A obj = i -> System.out.println("show me "+ i);
        obj.show(5);
    }
}
interface A {
    void show(int i);
}*/
