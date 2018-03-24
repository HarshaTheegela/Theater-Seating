
package com.solution.seating.service;

import com.solution.seating.model.RequestInput;

public interface TheatreService 
{
				int capacity(RequestInput requestInput);
				void allowSeating(RequestInput requestInput,int capacity);
}