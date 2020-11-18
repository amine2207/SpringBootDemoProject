package com.esprit.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP_CORRECTION")
public class TpCorrection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="TC_ID")
	private Long id;
	
	@Column(name ="TC_CORRECTION")
	private String tc_correction;
	
	@ManyToOne
	TP tp;

	public TpCorrection(Long id, String tc_correction, TP tp) {
		super();
		this.id = id;
		this.tc_correction = tc_correction;
		this.tp = tp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTc_correction() {
		return tc_correction;
	}

	public void setTc_correction(String tc_correction) {
		this.tc_correction = tc_correction;
	}

	public TP getTp() {
		return tp;
	}

	public void setTp(TP tp) {
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TpCorrection [id=" + id + ", tc_correction=" + tc_correction + ", tp=" + tp + "]";
	}
	
	

	
	
	

}
