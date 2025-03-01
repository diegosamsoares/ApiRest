package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import model.Chamado;

@Path("chamados")
public class ChamadoController {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/")
	public List<Chamado> lista() {
		List<Chamado> lista = new ArrayList<>();
		Chamado ch1 = new Chamado("1", "teste1");
		Chamado ch2 = new Chamado("1", "teste2");
		Chamado ch3 = new Chamado("1", "teste3");
		lista.add(ch1);
		lista.add(ch2);
		lista.add(ch3);
		return lista;

	}
}
