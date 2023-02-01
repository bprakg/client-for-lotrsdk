package clientforsdk;

import client.LOTR;
import client.impl.LOTRimpl;

public class LOTRTestClient {

	public static void main(String[] args) {
		
		LOTR lotr = LOTRimpl.Builder().withAPIKey("tQIFsTgVTNxsxwrbMt19");
		
		lotr.getAllMovies();
	}

}
