import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    public void Test1(){
        stack<Integer> st = new stack<>();
        st.push(3);
        st.push(5);
        st.push(2);

        assertTrue(st.getMax() == 5);
    }

    @Test
    public void Test2(){
        stack<Integer> st = new stack<>();
        st.push(2);
        st.push(1);
        st.push(2);
        st.push(5);

        st.pop();
        assertEquals( 2, st.getMax());
        st.pop();
        assertEquals( 2, st.getMax());
    }

    @Test
    public void Test3(){
        stack<Double> st = new stack<>();
        st.push(49.75);
        st.push(23.54);
        st.push(100.0);

        assertEquals(100, st.getMax());
        st.pop();
        assertEquals(49.75, st.getMax());
    }

    @Test
    public void Test4(){
        stack<String> st = new stack<>();
        st.push("OOC is bad");
        st.push("Nothing to understand");
        st.push("Try hard");

        assertTrue(st.getMax() == "Try hard");
        st.pop();
        assertTrue(st.getMax() == "OOC is bad");
    }
}


