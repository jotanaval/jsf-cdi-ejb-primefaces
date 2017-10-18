package br.mar.mil.dao;

import javax.ejb.Stateless;

import be.mar.mil.entity.Militar;
import br.mar.mil.generics.GenericDAO;

@Stateless
public class MilitarRepository extends GenericDAO<Militar>{
	
	public MilitarRepository() {
		super(Militar.class);
	}
	
	
	
	

}
