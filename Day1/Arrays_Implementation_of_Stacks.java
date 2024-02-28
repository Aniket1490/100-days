package Stacks;

public class Arrays_Implementation {
    public static class Stack{
        private int[] arr= new int [5];
        private int idx=0;  // vvvv.imp
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peak(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx==0)return true;
            else{
                return false;
            }
        }
        boolean isFull(){
            if(idx==arr.length)return true;
            else return false;
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.push(5);
        st.push(6);
        st.push(6);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

    }
}
