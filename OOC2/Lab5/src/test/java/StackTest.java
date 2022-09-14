import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    public void Test1(){
        MaxStack st = new MaxStack();
        st.push(3);
        st.push(2);
        st.push(5);
        st.push(1);

        assertEquals(5, st.getMax());
    }

    @Test
    public void Test2(){
        MaxStack st = new MaxStack();
        st.push(3);
        st.push(2);
        st.push(5);
        st.push(1);

        st.pop();

        assertEquals(5, st.getMax());
    }

    @Test
    public void Test3(){
        MaxStack st = new MaxStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        assertEquals(4, st.getMax());
    }

    @Test
    public void Test4(){
        MaxStack st = new MaxStack();
        st.push(1);
        st.push(3);
        st.push(4);

        st.pop();

        assertEquals(3, st.getMax());
    }
}
