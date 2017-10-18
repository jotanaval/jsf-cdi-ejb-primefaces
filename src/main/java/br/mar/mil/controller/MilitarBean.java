package br.mar.mil.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import be.mar.mil.entity.Militar;
import br.mar.mil.dao.MilitarRepository;

@Named
@RequestScoped
public class MilitarBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private MilitarRepository militarRepository;
	
	private Militar militar = new Militar();
	private List<Militar>findAll = new ArrayList<>();
	
	public String salvar(){
		this.militarRepository.save(militar);
		
		return "home";
	}
	
	
	
	
	public List<Militar> getFindAll() {
		this.findAll = militarRepository.findAll();
		return findAll;
	}
	
	public Militar getMilitar() {
		return militar;
	}
	public void setMilitar(Militar militar) {
		this.militar = militar;
	}
	
}
