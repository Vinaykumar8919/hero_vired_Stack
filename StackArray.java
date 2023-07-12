public class StackArray{
    private Object[] stackarray;
    private int size;
    private int top;

    public StackArray(int size) {
        this.size = size;
        this.top=-1;
        stackarray = new Object[size];
    }

    public void push(Object value) {
        if(top==size-1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stackarray[top]=value;
        }
    }

    public void pop() {
        if(top==-1) {
            System.out.println("Stack is Empty");
        } else {
            Object temp = stackarray[top];
            stackarray[top]=null;
            top--;
            System.out.println("popped object is : "+temp);
        }
    }

}