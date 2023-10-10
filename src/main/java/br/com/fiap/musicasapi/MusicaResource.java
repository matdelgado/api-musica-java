package br.com.fiap.musicasapi;

import java.util.List;

import br.com.fiap.musicasapi.model.Musica;
import br.com.fiap.musicasapi.service.MusicaService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("musica")
public class MusicaResource {
	
	MusicaService service = new MusicaService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Musica> index() {
		return service.findAll();
	}
}
