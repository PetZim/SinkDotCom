package com.wint.testsimpledotcom;

import com.wint.simpledotcom.DotCom;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DotComTest {

    @Test
    public void testCheckYourselfHit() {
        DotCom tDotCom = new DotCom();
        ArrayList<Integer> location = new ArrayList<>(Arrays.asList(2, 3, 4));
        tDotCom.setLocationCells(location);

        String result = tDotCom.checkYourself("2"); // 2 is a hit
        assertEquals("hit", result);
    }

    @Test
    public void testCheckYourselfMiss() {
        DotCom tDotCom = new DotCom();
        ArrayList<Integer> location = new ArrayList<>(Arrays.asList(2, 3, 4));
        tDotCom.setLocationCells(location);
        String result = tDotCom.checkYourself("1"); // 1 is a miss
        assertEquals("miss", result);
    }

    @Test
    public void testCheckYourselfKill() {
        DotCom tDotCom = new DotCom();
        ArrayList<Integer> location = new ArrayList<>(Arrays.asList(2, 3, 4));
        tDotCom.setLocationCells(location);
        tDotCom.checkYourself("2"); // 2 is a hit
        tDotCom.checkYourself("3"); // 3 is a hit
        String result = tDotCom.checkYourself("4"); // 4 is a hit
        assertEquals("kill", result);
    }
}