package br.com.fiap.musicasapi.model;

public record Musica(

		Long id,
		String titulo, 
		String artista,
		String poster,
		Double nota,
		Boolean escutada
		
) {}
