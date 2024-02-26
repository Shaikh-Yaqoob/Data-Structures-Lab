package stackarray;

public class StackArray {
private int[] array;
private int top;


public StackArray(int size) {
array = new int[size];
top = -1;
}


public void push(int element) {
if (top == array.length - 1) {
System.out.println("Stack overflow");
return;
}
array[++top] = element;
}


public int pop() {
if (top == -1) {
System.out.println("Stack underflow");
return -1;
}
return array[top--];
}


public boolean isEmpty() {
return (top == -1);
}


public int peek() {
if (top == -1) {
System.out.println("Stack is empty");
return -1;
}
return array[top];
}

public void print() {
System.out.print("Stack: ");
for (int i = 0; i <= top; i++) {
System.out.print(array[i] + " ");
}
System.out.println();
}



    public static void main(String[] args) {
       StackArray list=new StackArray(4);
       list.push(0);
       list.push(1);
       list.push(2);
       list.push(3);
       list.pop();
       list.print();
       
       
    }
    
}
