package com.esprit.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_FORMATION")
public class Formation implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name ="FORMATION_ID")
	private Long id;
	
	@Column(name ="FORMATION_THEME")
	private String theme;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FK_FD_ID")
	private FormationDetail formationdetail;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<TP> ftp;

	public Formation(Long id, String theme, FormationDetail formationdetail, Set<TP> ftp) {
		super();
		this.id = id;
		this.theme = theme;
		this.formationdetail = formationdetail;
		this.ftp = ftp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public FormationDetail getFormationdetail() {
		return formationdetail;
	}

	public void setFormationdetail(FormationDetail formationdetail) {
		this.formationdetail = formationdetail;
	}

	public Set<TP> getFtp() {
		return ftp;
	}

	public void setFtp(Set<TP> ftp) {
		this.ftp = ftp;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + ", formationdetail=" + formationdetail + ", ftp=" + ftp
				+ "]";
	}

	
	
	
	

}
