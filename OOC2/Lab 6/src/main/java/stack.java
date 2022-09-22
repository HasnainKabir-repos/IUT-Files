import java.util.Stack;
public class stack <E extends Comparable<E>>{

    private Stack<E> st = new Stack<>();
    private Stack<E> m = new Stack<>();
    private E max;

    public void push(E value){

        st.push(value);

        if(m.isEmpty()){
            m.push(value);
        }else{
            if(value.compareTo(m.peek())>0){
                m.push(value);
            }else{
                m.push(m.peek());
            }
        }

    }

    public void pop(){
        st.pop();
        m.pop();
    }

    public E top(){
        return st.peek();
    }

    public E getMax(){
        return m.peek();
    }

    public boolean isEmpty(){
        return st.isEmpty();
    }

    public int size(){
        return st.size();
    }


}
