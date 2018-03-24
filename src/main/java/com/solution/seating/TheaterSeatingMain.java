package com.solution.seating;

import com.solution.seating.model.RequestInput;
import com.solution.seating.service.TheatreService;
import com.solution.seating.service.impl.TheatreServiceImpl;
import com.solution.seating.util.TheatreUtil;


public class TheaterSeatingMain {
    public static void main(String args[]) 
    {
        TheatreUtil theatreUtil=new TheatreUtil();
        TheatreService service= new TheatreServiceImpl();
        RequestInput layout = theatreUtil.getLayout();
        int capacity =service.capacity(layout);
        service.allowSeating(layout, capacity);
          }
}