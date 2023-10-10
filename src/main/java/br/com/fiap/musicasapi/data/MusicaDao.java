package br.com.fiap.musicasapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.musicasapi.model.Musica;

public class MusicaDao {

	List<Musica> musicas = new ArrayList<>();
	
	public MusicaDao() {
		musicas.add(
				new Musica(
						1L,
						"Peaches",
						"Justin Bieber",
						"http://...",
						10.0,
						false
						)
				);
	}
	public List<Musica> findAll() {
		return musicas;
	}

}
