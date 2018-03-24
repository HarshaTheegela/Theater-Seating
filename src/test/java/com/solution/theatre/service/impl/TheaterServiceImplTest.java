
package com.solution.theatre.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.solution.seating.model.RequestInput;
import com.solution.seating.model.TicketRequest;
import com.solution.seating.service.TheatreService;
import com.solution.seating.service.impl.TheatreServiceImpl;

import junit.framework.Assert;

public class TheaterServiceImplTest {

    private TheatreService theaterService;
    private RequestInput requestInput;

    @org.junit.Before
    public void setUp() throws Exception {
        requestInput =new RequestInput();
        List<TicketRequest> request=new ArrayList<TicketRequest>();
        TicketRequest request1=new TicketRequest("TestName",5);
        TicketRequest request2=new TicketRequest("TestName",100);
        TicketRequest request3=new TicketRequest("TestName",2);
        request.add(request1);
        request.add(request2);
        request.add(request3);
        requestInput .setRequest(request);
        List<Integer> layOutRow= Arrays.asList(5,4);
        List<Integer> layOutRow1=Arrays.asList(6,8,8);
        List<List<Integer>> layOut=Arrays.asList(layOutRow,layOutRow1);
        requestInput.setLayout(layOut);
    }

    @org.junit.Test
    public void totalCapacity() {
        theaterService=new TheatreServiceImpl();
        int totalCapacity=theaterService.capacity(requestInput);
        Assert.assertNotNull(totalCapacity);
        Assert.assertEquals(totalCapacity,31);
    }

    @org.junit.Test
    public void allowSeating() {
        theaterService=new TheatreServiceImpl();
        theaterService.allowSeating(requestInput,31);
    }
}