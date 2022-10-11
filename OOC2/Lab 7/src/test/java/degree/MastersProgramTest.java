package degree;
import com.degree.DegreeType;
import com.degree.MastersProgram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MastersProgramTest {
        @Test
        public void isEligibleThesis(){
                MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
                boolean isEligible = mp.isEligible(2, "swe");
                assertFalse(isEligible);
                isEligible = mp.isEligible(3.9f, "swe");
                assertTrue(isEligible);
        }

        @Test
        public void getMarksNonThesis(){
                MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
                int marks = mp.getMarks(80,60, 40);
                assertEquals(100, marks);
        }

        @Test
        public void isEligibleThesisDifferentMajor(){
                MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
                boolean isEligible = mp.isEligible(3.9f, "swe");
                assertFalse(isEligible);
        }

        @Test
        public void isEligibleNonThesis(){
                MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
                boolean isEligible = mp.isEligible(3.76f, "swe");
                assertTrue(isEligible);
        }

        @Test
        public void getMarksThesis(){
                MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
                int marks = mp.getMarks(90, 50, 50);
                assertEquals(140, marks);
        }

        @Test
        public void isEligibleExecutive(){
                MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
                boolean isEligible = mp.isEligible(2, "cse");
                assertFalse(isEligible);
                isEligible = mp.isEligible(3.76f, "swe");
                assertTrue(isEligible);
        }
}
