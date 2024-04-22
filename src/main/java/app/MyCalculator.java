package app;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("")

public class MyCalculator {
	
	
	@PersistenceContext
	EntityManager em;
	
	@GET
	public String test(){
		return "test ";
	}
	
	@POST
	@Path("/calc")
	public int calculate(Calculation c) {
		em.persist(c);
		return c.calculate();
		
	}
	
	@GET
	@Path("/calculations")
	public List<Calculation> getAllCalc(){
		List<Calculation> cals = em.createQuery("SELECT c FROM Calculation c", Calculation.class).getResultList();
		return cals;
	}

}
