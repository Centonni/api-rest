package com.stresstest.apirest_beac.modele;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="RESULTAT_SCENARIO")
public class ResultatScenario implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="res_scen_id")
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_scen_id")
	private Scenario scenario;
	
	private long idScenario;
	private String banque;
	private String resultat;
	
	private String anneeReference;
	private float ref_FPB_durs_cet1;
	private float ref_FPB_additionnels_cet1;
	private float ref_FPB_t1;
	private float ref_FPT_2;
	private float ref_FPE;
	private float ref_T_actif;
	private float ref_Ratio_cet1;
	private String ref_Interpretation;
	
	private float  annee1_FPB_durs_cet1;
	private float  annee1_FPB_additionnels_cet1;
	private float  annee1_FPB_t1;
	private float  annee1_FPT_2;
	private float  annee1_FPE;
	private float  annee1_T_actif;
	private float  annee1_Ratio_cet1;
	private String annee1_Interpretation;
	
	private float  annee2_FPB_durs_cet1;
	private float  annee2_FPB_additionnels_cet1;
	private float  annee2_FPB_t1;
	private float  annee2_FPT_2;
	private float  annee2_FPE;
	private float  annee2_T_actif;
	private float  annee2_Ratio_cet1;
	private String annee2_Interpretation;
	
	private float  annee3_FPB_durs_cet1;
	private float  annee3_FPB_additionnels_cet1;
	private float  annee3_FPB_t1;
	private float  annee3_FPT_2;
	private float  annee3_FPE;
	private float  annee3_T_actif;
	private float  annee3_Ratio_cet1;
	private String annee3_Interpretation;
	
	public ResultatScenario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultatScenario(long id, long idScenario, String banque, String resultat, String anneeReference,
			float ref_FPB_durs_cet1, float ref_FPB_additionnels_cet1, float ref_FPB_t1, float ref_FPT_2, float ref_FPE,
			float ref_T_actif, float ref_Ratio_cet1, String ref_Interpretation, float annee1_FPB_durs_cet1,
			float annee1_FPB_additionnels_cet1, float annee1_FPB_t1, float annee1_FPT_2, float annee1_FPE,
			float annee1_T_actif, float annee1_Ratio_cet1, String annee1_Interpretation, float annee2_FPB_durs_cet1,
			float annee2_FPB_additionnels_cet1, float annee2_FPB_t1, float annee2_FPT_2, float annee2_FPE,
			float annee2_T_actif, float annee2_Ratio_cet1, String annee2_Interpretation, float annee3_FPB_durs_cet1,
			float annee3_FPB_additionnels_cet1, float annee3_FPB_t1, float annee3_FPT_2, float annee3_FPE,
			float annee3_T_actif, float annee3_Ratio_cet1, String annee3_Interpretation) {
		super();
		this.id = id;
		this.idScenario = idScenario;
		this.banque = banque;
		this.resultat = resultat;
		this.anneeReference = anneeReference;
		this.ref_FPB_durs_cet1 = ref_FPB_durs_cet1;
		this.ref_FPB_additionnels_cet1 = ref_FPB_additionnels_cet1;
		this.ref_FPB_t1 = ref_FPB_t1;
		this.ref_FPT_2 = ref_FPT_2;
		this.ref_FPE = ref_FPE;
		this.ref_T_actif = ref_T_actif;
		this.ref_Ratio_cet1 = ref_Ratio_cet1;
		this.ref_Interpretation = ref_Interpretation;
		this.annee1_FPB_durs_cet1 = annee1_FPB_durs_cet1;
		this.annee1_FPB_additionnels_cet1 = annee1_FPB_additionnels_cet1;
		this.annee1_FPB_t1 = annee1_FPB_t1;
		this.annee1_FPT_2 = annee1_FPT_2;
		this.annee1_FPE = annee1_FPE;
		this.annee1_T_actif = annee1_T_actif;
		this.annee1_Ratio_cet1 = annee1_Ratio_cet1;
		this.annee1_Interpretation = annee1_Interpretation;
		this.annee2_FPB_durs_cet1 = annee2_FPB_durs_cet1;
		this.annee2_FPB_additionnels_cet1 = annee2_FPB_additionnels_cet1;
		this.annee2_FPB_t1 = annee2_FPB_t1;
		this.annee2_FPT_2 = annee2_FPT_2;
		this.annee2_FPE = annee2_FPE;
		this.annee2_T_actif = annee2_T_actif;
		this.annee2_Ratio_cet1 = annee2_Ratio_cet1;
		this.annee2_Interpretation = annee2_Interpretation;
		this.annee3_FPB_durs_cet1 = annee3_FPB_durs_cet1;
		this.annee3_FPB_additionnels_cet1 = annee3_FPB_additionnels_cet1;
		this.annee3_FPB_t1 = annee3_FPB_t1;
		this.annee3_FPT_2 = annee3_FPT_2;
		this.annee3_FPE = annee3_FPE;
		this.annee3_T_actif = annee3_T_actif;
		this.annee3_Ratio_cet1 = annee3_Ratio_cet1;
		this.annee3_Interpretation = annee3_Interpretation;
	}
	
	
	
	
}
