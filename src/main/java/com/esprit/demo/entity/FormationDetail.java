package com.esprit.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="T_FORMATION_DETAIL")
public class FormationDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FD_ID")
	private Long id;
	
	@Column(name="FD_TABLE_MATIERE")
	private String fdTableMatiere;
	
	@Column(name="FD_SUPPORT_PDF")
	private String fbSupportPDF;
	
	@OneToOne(mappedBy="formationdetail")
	private Formation formation;

	public FormationDetail(Long id, String fdTableMatiere, String fbSupportPDF , Formation formation) {
		super();
		this.id = id;
		this.fdTableMatiere = fdTableMatiere;
		this.fbSupportPDF = fbSupportPDF;
		this.formation= formation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFdTableMatiere() {
		return fdTableMatiere;
	}

	public void setFdTableMatiere(String fdTableMatiere) {
		this.fdTableMatiere = fdTableMatiere;
	}

	public String getFbSupportPDF() {
		return fbSupportPDF;
	}

	public void setFbSupportPDF(String fbSupportPDF) {
		this.fbSupportPDF = fbSupportPDF;
	}
	
	

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	@Override
	public String toString() {
		return "FormationDetail [id=" + id + ", fdTableMatiere=" + fdTableMatiere + ", fbSupportPDF=" + fbSupportPDF
				+ ", formation=" + formation + "]";
	}

	
	
	

}
