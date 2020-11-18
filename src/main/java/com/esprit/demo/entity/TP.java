package com.esprit.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP")
public class TP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "TP_ID")
	private Long id;
	
	@Column(name ="TP_SUJET")
	private String tpSujet;
	
	@Column(name ="TP_DUREE")
	private Long tpDuree;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="tp")
	private Set<TpCorrection> TpCorrections;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy="ftp")
	private Set<Formation> formations;

	public TP(Long id, String tpSujet, Long tpDuree, Set<TpCorrection> tpCorrections, Set<Formation> formations) {
		super();
		this.id = id;
		this.tpSujet = tpSujet;
		this.tpDuree = tpDuree;
		TpCorrections = tpCorrections;
		this.formations = formations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTpSujet() {
		return tpSujet;
	}

	public void setTpSujet(String tpSujet) {
		this.tpSujet = tpSujet;
	}

	public Long getTpDuree() {
		return tpDuree;
	}

	public void setTpDuree(Long tpDuree) {
		this.tpDuree = tpDuree;
	}

	public Set<TpCorrection> getTpCorrections() {
		return TpCorrections;
	}

	public void setTpCorrections(Set<TpCorrection> tpCorrections) {
		TpCorrections = tpCorrections;
	}

	public Set<Formation> getFormations() {
		return formations;
	}

	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}

	@Override
	public String toString() {
		return "TP [id=" + id + ", tpSujet=" + tpSujet + ", tpDuree=" + tpDuree + ", TpCorrections=" + TpCorrections
				+ ", formations=" + formations + "]";
	}


	
	
	
	
	
	

}
