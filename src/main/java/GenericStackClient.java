public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("Stack of string");
        stackOfString();
        System.out.println("Stack of integer");
        stackOfInteger();
    }

    private static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");

        stack.pop();
        stack.pop();

        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.printf("1.2 Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after operation: " + stack.size());
    }

    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.pop();

        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
}
