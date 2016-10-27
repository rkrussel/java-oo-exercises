package javagram.filters;

import javagram.Picture;

public interface Filter {

	public Filter getFilter();

	public Picture process(Picture picture);
		
	
}
