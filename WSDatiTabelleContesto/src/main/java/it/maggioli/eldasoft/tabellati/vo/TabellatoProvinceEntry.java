package it.maggioli.eldasoft.tabellati.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.Alias;

@Alias("tabellatoprovinceentry")
@XmlType(propOrder = { "codice", "descrizione", "codistat" })
public class TabellatoProvinceEntry implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6241410931174930670L;

	@XmlElement(name = "code")
	@ApiModelProperty(name = "code", value="Codice tabellato")  
	private String codice;
	@XmlElement(name = "value")
	@ApiModelProperty(name = "value", value="Descrizione tabellato")  
	private String descrizione;
	@XmlElement(name = "codistat")
	@ApiModelProperty(name = "codistat", value="codice istat della regione di appartenenza")  
	private String codistat;

	public TabellatoProvinceEntry() {
		;
	}

	/**
	 * @return Ritorna codice.
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice
	 *            codice da settare internamente alla classe.
	 */
	public void setCodice(String codice) {
		this.codice = StringUtils.stripToNull(codice);
	}

	/**
	 * @return Ritorna descrizione.
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione
	 *            descrizione da settare internamente alla classe.
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = StringUtils.stripToNull(descrizione);
	}

	public String getCodistat() {
		return codistat;
	}

	public void setCodistat(String codistat) {
		this.codistat = codistat;
	}

	
}