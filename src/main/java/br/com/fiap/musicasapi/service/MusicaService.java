package br.com.fiap.musicasapi.service;

import java.util.List;

import br.com.fiap.musicasapi.data.MusicaDao;
import br.com.fiap.musicasapi.model.Musica;

public class MusicaService {

	MusicaDao dao = new MusicaDao();
	
	
	public List<Musica> findAll() {
		return dao.findAll();
	}

}
