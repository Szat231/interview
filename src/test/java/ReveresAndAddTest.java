import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ReveresAndAddTest {
    @Test
    public void reveresAndAddTest_nullGiven_throwIllegalArgumentExeptions() {

        //given
        ReversAndAdd revers = new ReversAndAdd();
        String digits = null;
        //when

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> revers.reversAndAdd(Long.parseLong(digits))
        );
    }

    @Test
    public void reveresAndAddTest_stringGiven_throwIllegalArgumentExeptions() {

        //given
        ReversAndAdd revers = new ReversAndAdd();
        String digits = "xaxaxa";
        //when

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> revers.reversAndAdd(Long.parseLong(digits))
        );

    }

    @Test
    public void reveresAndAddTest_palindromNotFound_false() {

        //given
        ReversAndAdd revers = new ReversAndAdd();
        String digits = "196";
        //when
        String result = String.valueOf(revers.reversAndAdd(Long.parseLong(digits)));
        //then
        Assertions.assertEquals("0", result);
    }

    @Test
    public void reveresAndAddTest_palindromFound_true() {

        //given
        ReversAndAdd revers = new ReversAndAdd();
        String digits = "195";
        //when
        String result = String.valueOf(revers.reversAndAdd(Long.parseLong(digits)));


        //then
        Assertions.assertEquals("9339", result);
    }


    @Test
    public void reversTest_stringGiven_throwIllegalArgumentExeptions() {

        //given
        ReversAndAdd revers = new ReversAndAdd();
        String digits = "xaxaxa";
        //when

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> revers.revers(Long.parseLong(digits))
        );
    }

}
