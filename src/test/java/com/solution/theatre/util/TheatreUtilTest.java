package com.solution.theatre.util;

import org.junit.Test;

import com.solution.seating.util.TheatreUtil;

public class TheatreUtilTest {

    private TheatreUtil theatreUtil;

    @Test
    public void getLayout() {
        theatreUtil=new TheatreUtil();
        theatreUtil.getLayout();
    }
}