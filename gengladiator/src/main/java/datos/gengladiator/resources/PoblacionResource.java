package datos.gengladiator.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import datos.gengladiator.model.Data;
import datos.gengladiator.model.Individuo;
import java.util.LinkedList;

@Path("/poblacion")
public class PoblacionResource {
	
	@GET
	@Path("/{numInd}")
	@Produces(MediaType.APPLICATION_XML)
	public LinkedList<Individuo> getFirstPob(@PathParam("numInd") int numInd){
		return Data.firstPob(numInd);
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public LinkedList<Individuo> getPob(){
		return Data.getPoblacion();
	}
	
	@GET
	@Path("/numPob")
	@Produces(MediaType.TEXT_PLAIN)
	public int getNumPob(){
		return Data.getNumPobla();
	}
	
	@GET
	@Path("/new")
	@Produces(MediaType.APPLICATION_XML)
	public LinkedList<Individuo> getNewPob(){
		return Data.newPob();
	}
	
}
