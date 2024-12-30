package stack;

public class Uygulama {

    public static void main(String[] args) {

        StackYigin stack = new StackYigin(5);

        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        
        System.out.println("cikan : "+ stack.pop());
        
        
    }

}
