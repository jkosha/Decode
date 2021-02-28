package sn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTest {
    Decoder d = new Decoder();

    @Test
    void testBasic() {
        assertEquals(2, d.numDecodings("12"));
    }

    @Test
    void testBasic2() {
        assertEquals(3, d.numDecodings("226"));
    }

    @Test
    void testBasic3() {
        assertEquals(0, d.numDecodings("0"));
    }

    @Test
    void testBasic4() {
        assertEquals(0, d.numDecodings("06"));
    }

}
