package it.maggioli.eldasoft.tabellati.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Contenitore per la riga del tabellato estatto.
 *
 * @author Mirco.Franzoni
 */
@XmlRootElement
@XmlType(propOrder = {"riga", "error" })
public class RigaResult implements Serializable {

	/**
	 * UID.
	 */
	private static final long serialVersionUID = 1227874189423727845L;

	/** Codice di errore nel caso di valore non trovato */
	public static final String INVALID_VALUE = "valore non valido";
	/** Codice di errore nel caso di valore non trovato */
	public static final String ERROR_NOT_FOUND = "valore non trovato";
	/** Codice indicante un errore inaspettato. */
	public static final String ERROR_UNEXPECTED = "unexpected-error";

	private TabellatoEntry riga;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String            error;

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

	public void setRiga(TabellatoEntry riga) {
		this.riga = riga;
	}

	public TabellatoEntry getRiga() {
		return riga;
	}

}
