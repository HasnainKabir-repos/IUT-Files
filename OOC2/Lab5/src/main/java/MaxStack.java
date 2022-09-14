import java.util.Stack;
public class MaxStack {
    public int max;

    Stack<Integer> st = new Stack<>();
    Stack<Integer> mx = new Stack<>();
    public MaxStack(){
        max = 0;
    }

    void push(int key){
        if(st.empty()){
            max = key;
            st.push(key);
            mx.push(key);
        }else if(key<=mx.peek()){
            st.push(key);
        }else if(key>mx.peek()){
            st.push(key);
            max = key;
            mx.push(key);
        }
    }

    void pop(){
        if(!st.empty()) {
            int x = st.peek();
            st.pop();
            if (x >= mx.peek()) {
                mx.pop();
            }
        }
    }

    int getMax(){
        return mx.peek();
    }
}
