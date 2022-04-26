import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuhnAlgoTest {

    @Test
    public void checkLuhnAlgo_digitsNull_throwIllegalArgumentExeptions(){

        //given
        LuhnAlgo luhn = new LuhnAlgo();
        String digits = null;

        //when

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> luhn.checkLuhnAlgo(digits)
        );
    }

    @Test
    public void checkLuhnAlgo_digitsChars_throwIllegalArgumentExeptions(){

        //given
        LuhnAlgo luhn = new LuhnAlgo();
        String digits = "Lorme123";

        //when

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> luhn.checkLuhnAlgo(digits)
        );
    }

    @Test
    public void checkLuhnAlgo_digitsTooShort_throwIllegalArgumentExeptions(){

        //given
        LuhnAlgo luhn = new LuhnAlgo();
        String digits = "123";

        //when

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> luhn.checkLuhnAlgo(digits)
        );
    }

    @Test
    public void checkLuhnAlgo_digitsTooLong_throwIllegalArgumentExeptions(){

        //given
        LuhnAlgo luhn = new LuhnAlgo();
        String digits = "123123123123123123123";

        //when

        //then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()-> luhn.checkLuhnAlgo(digits)
        );
    }

    @Test
    public void checkLuhnAlgo_invalidCardNo_resultFalse(){

        //given
        LuhnAlgo luhn = new LuhnAlgo();
        String digits = "5194946407757000";

        //when
        boolean result = luhn.checkLuhnAlgo(digits);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void checkLuhnAlgo_correctCardNo_resultTrue(){

        //given
        LuhnAlgo luhn = new LuhnAlgo();
        String digits = "5194946407757367";

        //when
        boolean result = luhn.checkLuhnAlgo(digits);

        //then
        Assertions.assertTrue(result);
    }
}
