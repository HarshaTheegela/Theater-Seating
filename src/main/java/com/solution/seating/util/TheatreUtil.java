
package com.solution.seating.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.solution.seating.model.RequestInput;
import com.solution.seating.model.TicketRequest;

public class TheatreUtil 
{
	private static final String SPACE = "\\s+";
    public RequestInput  getLayout(){
    List<List<Integer>> layOut = new ArrayList<List<Integer>>();
    List<TicketRequest> request=new ArrayList<TicketRequest>();
    RequestInput requestInput=new RequestInput();
    try {
        Stream<String> lines = Files.lines(Paths.get(ClassLoader.getSystemResource("input.txt").toURI()));
        lines.forEach( (String line) -> {
            if(!line.trim().isEmpty() && !line.matches(".*[a-z].*")){
                List<Integer> strings=Stream.of(line.split(SPACE))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                layOut.add(strings);
            }
            else if(!line.trim().isEmpty() && line.matches(".*[a-z].*")){
                String[] spaces = line.split(SPACE);
                TicketRequest ticketRequest=new TicketRequest(spaces[0],Integer.valueOf(spaces[1]));
                request.add(ticketRequest);
            }
        });
        lines.close();
        requestInput.setRequest(request);
        requestInput.setLayout(layOut);

    } catch (IOException e) {
        e.printStackTrace();
    } catch (URISyntaxException e) {
        e.printStackTrace();
    }
    return  requestInput;
}
}