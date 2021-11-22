package it.maggioli.eldasoft.tabellati.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;


	@XmlRootElement
	@XmlType(propOrder = {"data", "error" })
	public class TabellatoProvinceResult implements Serializable {

	  /**
	   * UID.
	   */
	  private static final long serialVersionUID = 1227874189423727845L;
	  
	  /** Codice di errore nel caso tabellato non trovato */
	  public static final String ERROR_VALIDATION = "errore validazione parametri ricerca";
	  /** Codice di errore nel caso tabellato non trovato */
	  public static final String ERROR_NOT_FOUND = "value not found";
	  /** Codice indicante un errore inaspettato. */
	  public static final String ERROR_UNEXPECTED = "unexpected-error";

	  private List<TabellatoProvinceEntry> data = new ArrayList<TabellatoProvinceEntry>();
	  @JsonInclude(JsonInclude.Include.NON_NULL)
	  private String            error;

	  /**
	   * @return Ritorna data.
	   */
	  public List<TabellatoProvinceEntry> getData() {
	    return data;
	  }

	  /**
	   * @param data
	   *        data da settare internamente alla classe.
	   */
	  public void setData(List<TabellatoProvinceEntry> data) {
	    this.data = data;
	  }

	  /**
	   * @return Ritorna error.
	   */
	  public String getError() {
	    return error;
	  }

	  /**
	   * @param error
	   *        error da settare internamente alla classe.
	   */
	  public void setError(String error) {
	    this.error = error;
	  }

	}
