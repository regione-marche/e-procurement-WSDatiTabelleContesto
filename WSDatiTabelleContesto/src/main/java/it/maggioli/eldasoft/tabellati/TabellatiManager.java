package it.maggioli.eldasoft.tabellati;

import it.maggioli.eldasoft.tabellati.dao.TabellatiMapper;
import it.maggioli.eldasoft.tabellati.vo.RigaResult;
import it.maggioli.eldasoft.tabellati.vo.TabellatoEntry;
import it.maggioli.eldasoft.tabellati.vo.TabellatoProvinceEntry;
import it.maggioli.eldasoft.tabellati.vo.TabellatoProvinceResult;
import it.maggioli.eldasoft.tabellati.vo.TabellatoResult;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Manager per la gestione della business logic.
 * 
 * @author Stefano.Sabbadin
 */
@Component(value = "tabellatiManager")
public class TabellatiManager {

	/** Logger di classe. */
	private Logger logger = LoggerFactory.getLogger(TabellatiManager.class);

	/**
	 * Dao MyBatis con le primitive di estrazione dei dati.
	 */
	@Autowired
	private TabellatiMapper tabellatiMapper;

	/**
	 * @param tabellatiDao
	 *            tabellatiDao da settare internamente alla classe.
	 */
	public void setTabellatiMapper(TabellatiMapper tabellatiDao) {
		this.tabellatiMapper = tabellatiDao;
	}

	public TabellatoResult getValori(String cod, String language) {

		TabellatoResult risultato = new TabellatoResult();
		try {
			
			if(cod.equals("Situazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W9007");
				risultato.setData(righe);
			} else if (cod.equals("Provenienza")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W9018");
				risultato.setData(righe);
			} else if (cod.equals("Indizione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3008");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaSA")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3001");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaProcedura")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3024");
				risultato.setData(righe);
			} else if (cod.equals("SceltaContraente50")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W9020");
				risultato.setData(righe);
			} else if (cod.equals("SceltaContraente")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3005");
				risultato.setData(righe);
			} else if (cod.equals("MotivoCompletamento")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3997");
				risultato.setData(righe);
			} else if (cod.equals("Area")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W9004");
				risultato.setData(righe);
			} else if (cod.equals("Fase")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3020");
				risultato.setData(righe);
			} else if (cod.equals("TipoInvio")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3998");
				risultato.setData(righe);
			} else if(cod.equals("TipoAvviso")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3996");
				risultato.setData(righe);
			} else if(cod.equals("SN")) {
				TabellatoEntry S = new TabellatoEntry();
				TabellatoEntry N = new TabellatoEntry();
				S.setCodice("1");
				S.setDescrizione("Si");
				N.setCodice("2");
				N.setDescrizione("No");
				List<TabellatoEntry> righe = new ArrayList<TabellatoEntry>();
				righe.add(S);
				righe.add(N);
				risultato.setData(righe);
			} else if(cod.equals("TipoAppalto")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato2("W3z05");
				risultato.setData(righe);
			} else if(cod.equals("CriterioAggiudicazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3007");
				risultato.setData(righe);
			} else if(cod.equals("TipologiaAggiudicatario")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3010");
				risultato.setData(righe);
			} else if(cod.equals("RuoloAssociazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3011");
				risultato.setData(righe);
			} else if(cod.equals("TipologiaCC")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W9019");
				risultato.setData(righe);
			} else if(cod.equals("TipoRealizzazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3999");
				risultato.setData(righe);
			} else if(cod.equals("FormaGiuridica")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("G_043");
				risultato.setData(righe);
			} else if (cod.equals("Entita")) {
				TabellatoEntry avvisi = new TabellatoEntry();
				TabellatoEntry bandi = new TabellatoEntry();
				TabellatoEntry esiti = new TabellatoEntry();
				avvisi.setCodice("3");
				avvisi.setDescrizione("Avvisi");
				bandi.setCodice("1");
				bandi.setDescrizione("Bandi");
				esiti.setCodice("2");
				esiti.setDescrizione("Esiti");
				List<TabellatoEntry> righe = new ArrayList<TabellatoEntry>();
				righe.add(avvisi);
				righe.add(bandi);
				righe.add(esiti);
				risultato.setData(righe);
				
			} else if (cod.equals("Stato")) {
				TabellatoEntry inCorso = new TabellatoEntry();
				TabellatoEntry scaduti = new TabellatoEntry();
				TabellatoEntry tutti = new TabellatoEntry();
				inCorso.setCodice("1");
				inCorso.setDescrizione("In corso");
				scaduti.setCodice("2");
				scaduti.setDescrizione("Scaduti");
				tutti.setCodice("3");
				tutti.setDescrizione("Tutti");
				List<TabellatoEntry> righe = new ArrayList<TabellatoEntry>();
				righe.add(inCorso);
				righe.add(scaduti);
				righe.add(tutti);
				risultato.setData(righe);
			} else if (cod.equals("Categorie")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato2("W3z03");
				risultato.setData(righe);
			} else if (cod.equals("Classe")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato2("W3z11");
				risultato.setData(righe);
			} else if (cod.equals("Settore")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato2("W3z08");
				risultato.setData(righe);
			} else if (cod.equals("TipoProgramma")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W9002");
				risultato.setData(righe);
			} else if (cod.equals("Determinazioni")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx02");
				risultato.setData(righe);
			} else if (cod.equals("Ambito")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx04");
				risultato.setData(righe);
			} else if (cod.equals("Causa")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx05");
				risultato.setData(righe);
			} else if (cod.equals("StatoRealizzazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx06");
				risultato.setData(righe);
			} else if (cod.equals("DestinazioneUso")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx07");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaIntervento")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx01");
				risultato.setData(righe);
			} else if (cod.equals("CategoriaIntervento")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato5("PTj01");
				risultato.setData(righe);
			} else if (cod.equals("Priorita")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT008");
				risultato.setData(righe);
			} else if (cod.equals("Finalita")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx03");
				risultato.setData(righe);
			} else if (cod.equals("StatoProgettazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx09");
				risultato.setData(righe);
			} else if (cod.equals("TrasferimentoImmobile")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT013");
				risultato.setData(righe);
			} else if (cod.equals("ImmobileDisponibile")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT014");
				risultato.setData(righe);
			} else if (cod.equals("ProgrammaDismissione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT015");
				risultato.setData(righe);
			} else if (cod.equals("TipoProprieta")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("A2137");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaCapitalePrivato")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato3("PTx08");
				risultato.setData(righe);
			} else if (cod.equals("TipoDisponibilita")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT016");
				risultato.setData(righe);
			} else if (cod.equals("VariatoAcquisti")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT010");
				risultato.setData(righe);
			} else if (cod.equals("VariatoInterventi")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT011");
				risultato.setData(righe);
			} else if (cod.equals("Acquisto")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT018");
				risultato.setData(righe);
			} else if (cod.equals("UnitaMisura")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT019");
				risultato.setData(righe);
			} else if (cod.equals("ProceduraAffidamento")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT020");
				risultato.setData(righe);
			} else if (cod.equals("Valutazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT021");
				risultato.setData(righe);
			} else if (cod.equals("AcquistoRicompreso")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("PT022");
				risultato.setData(righe);
			} else if (cod.equals("MesePrevisto")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3995");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaInterventoDM112011")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabsche("select tabcod1 codice, tabdesc descrizione from tabsche where TABCOD='S2008' order by tabcod1");
				risultato.setData(righe);
			} else if (cod.equals("CategoriaInterventoDM112011")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabsche("select tabcod1 || tabcod2 codice, tabdesc descrizione from tabsche where TABCOD='S2005' and TABCOD2<> '0' order by tabcod1, tabcod2");
				risultato.setData(righe);
			} else if (cod.equals("FinalitaDM112011")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabsche("select tabcod1 codice, tabdesc descrizione from tabsche where TABCOD='S2016' order by tabcod3");
				risultato.setData(righe);
			} else if (cod.equals("StatoProgettazioneDM112011")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabsche("select tabcod1 codice, tabdesc descrizione from tabsche where TABCOD='S2017' order by tabcod3");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaCapitalePrivatoDM112011")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabsche("select tabcod1 codice, tabdesc descrizione from tabsche where TABCOD='S2015' order by tabcod1");
				risultato.setData(righe);
			} else if (cod.equals("PrestazioniComprese")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3003");
				risultato.setData(righe);
			} else if (cod.equals("ModalitaAcquisizioneForniture")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3019");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaLavoro")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3002");
				risultato.setData(righe);
			} else if (cod.equals("Condizione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3006");
				risultato.setData(righe);
			} else if (cod.equals("TipologiaAmministrazione")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("G_044");
				risultato.setData(righe);
			} else if (cod.equals("FunzioniDelegate")) {
				List<TabellatoEntry> righe = this.tabellatiMapper
				.getTabellato1("W3038");
				risultato.setData(righe);
			} else {
				risultato.setError(TabellatoResult.ERROR_NOT_FOUND + " " + cod);
			}
			
		} catch (Throwable t) {
			// qualsiasi sia l'errore si traccia nel log e si ritorna un codice
			// fisso ed il messaggio allegato all'eccezione come errore
			logger.error(
					"Errore inaspettato durante l'estrazione del tabellato "
							+ cod, t);
			risultato.setError(TabellatoResult.ERROR_UNEXPECTED + ": "
					+ t.getMessage());
		}

		return risultato;
	}

	public RigaResult getValore(String cod, String valore, String language) {

		RigaResult risultato = new RigaResult();
		try {
			if (cod != null && valore != null) {
				TabellatoEntry riga = null;
				if(cod.equals("Situazione")) {
					try {
						riga = this.tabellatiMapper.getValore1("W9007", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Provenienza")) {
					try {
						riga = this.tabellatiMapper.getValore1("W9018", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Indizione")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3008", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaSA")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3001", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaProcedura")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3024", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("SceltaContraente50")) {
					try {
						riga = this.tabellatiMapper.getValore1("W9020", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("SceltaContraente")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3005", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("MotivoCompletamento")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3997", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Area")) {
					try {
						riga = this.tabellatiMapper.getValore1("W9004", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Fase")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3020", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipoInvio")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3998", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("FormaGiuridica")) {
					try {
						riga = this.tabellatiMapper.getValore1("G_043", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("TipoAvviso")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3996", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("SN")) {
					if (valore.equals("1")) {
						riga = new TabellatoEntry();
						riga.setCodice("1");
						riga.setDescrizione("Si");
					} else if (valore.equals("2")) {
						riga = new TabellatoEntry();
						riga.setCodice("2");
						riga.setDescrizione("No");
					}
					risultato.setRiga(riga);
				} else if(cod.equals("TipoAppalto")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore2("W3z05", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("CriterioAggiudicazione")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3007", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("TipologiaAggiudicatario")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3010", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("RuoloAssociazione")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3011", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("TipologiaCC")) {
					try {
						riga = this.tabellatiMapper.getValore1("W9019", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("TipoRealizzazione")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3999", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Entita")) {
					if (valore.equals("1")) {
						riga = new TabellatoEntry();
						riga.setCodice("1");
						riga.setDescrizione("Bandi");
					} else if (valore.equals("2")) {
						riga = new TabellatoEntry();
						riga.setCodice("2");
						riga.setDescrizione("Esiti");
					} else if (valore.equals("3")) {
						riga = new TabellatoEntry();
						riga.setCodice("3");
						riga.setDescrizione("Avvisi");
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Categorie")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore2("W3z03", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Classe")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore2("W3z11", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Settore")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore2("W3z08", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipoProgramma")) {
					try {
						riga = this.tabellatiMapper.getValore1("W9002", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Determinazioni")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx02", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Ambito")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx04", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Causa")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx05", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("StatoRealizzazione")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx06", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("DestinazioneUso")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx07", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaIntervento")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx01", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("CategoriaIntervento")) {
					if (valore.length() <= 6) {
						riga = this.tabellatiMapper.getValore5("PTj01", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if(cod.equals("Priorita")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT008", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Finalita")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx03", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("StatoProgettazione")) {
					try {
						riga = this.tabellatiMapper.getValore3("PTx09", valore);
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TrasferimentoImmobile")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT013", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("ImmobileDisponibile")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT014", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("ProgrammaDismissione")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT015", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipoProprieta")) {
					try {
						riga = this.tabellatiMapper.getValore1("A2137", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaCapitalePrivato")) {
					if (valore.length() <= 5) {
						riga = this.tabellatiMapper.getValore3("PTx08", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipoDisponibilita")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT016", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("VariatoAcquisti")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT010", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("VariatoInterventi")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT011", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Acquisto")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT018", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("UnitaMisura")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT019", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("ProceduraAffidamento")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT020", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Valutazione")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT021", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("AcquistoRicompreso")) {
					try {
						riga = this.tabellatiMapper.getValore1("PT022", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("MesePrevisto")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3995", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaInterventoDM112011")) {
					if (valore.length() <= 4) {
						riga = this.tabellatiMapper.getValoreTabsche1("S2008", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("CategoriaInterventoDM112011")) {
					if (valore.length() <= 4) {
						riga = this.tabellatiMapper.getValoreCategoriaDM112011("S2005", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("FinalitaDM112011")) {
					if (valore.length() <= 4) {
						riga = this.tabellatiMapper.getValoreTabsche1("S2016", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("StatoProgettazioneDM112011")) {
					if (valore.length() <= 4) {
						riga = this.tabellatiMapper.getValoreTabsche1("S2017", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaCapitalePrivatoDM112011")) {
					if (valore.length() <= 4) {
						riga = this.tabellatiMapper.getValoreTabsche1("S2015", valore);
					} else {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("PrestazioniComprese")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3003", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("ModalitaAcquisizioneForniture")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3019", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaLavoro")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3002", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("Condizione")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3006", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("TipologiaAmministrazione")) {
					try {
						riga = this.tabellatiMapper.getValore1("G_044", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else if (cod.equals("FunzioniDelegate")) {
					try {
						riga = this.tabellatiMapper.getValore1("W3038", new Long(valore));
					} catch (Exception ex) {
						risultato.setError(RigaResult.INVALID_VALUE);
					}
					risultato.setRiga(riga);
				} else {
					risultato.setError(TabellatoResult.ERROR_NOT_FOUND + " " + cod);
				}
				if (risultato.getRiga() == null && risultato.getError() == null) {
					risultato.setError(RigaResult.ERROR_NOT_FOUND);
				}
			} else {
				risultato.setError(RigaResult.INVALID_VALUE);
			}
		} catch (Throwable t) {
			// qualsiasi sia l'errore si traccia nel log e si ritorna un codice
			// fisso ed il messaggio allegato all'eccezione come errore
			logger.error(
					"Errore inaspettato durante l'estrazione del valore dal tabellato "
							+ cod, t);
			risultato.setError(RigaResult.ERROR_UNEXPECTED + ": "
					+ t.getMessage());
		}

		return risultato;
	}
	
	public TabellatoResult getRegioni(String language) {

		TabellatoResult risultato = new TabellatoResult();
		try {
			List<TabellatoEntry> righe = this.tabellatiMapper.getRegioni();
			risultato.setData(righe);
		} catch (Throwable t) {
			// qualsiasi sia l'errore si traccia nel log e si ritorna un codice
			// fisso ed il messaggio allegato all'eccezione come errore
			logger.error(
					"Errore inaspettato durante l'estrazione delle regioni "
							+ language, t);
			risultato.setError(TabellatoResult.ERROR_UNEXPECTED + ": "
					+ t.getMessage());
		}
		return risultato;
	}
	
	public TabellatoResult getProvince(String regione, String language) {

		TabellatoResult risultato = new TabellatoResult();
		try {
			List<TabellatoEntry> righe = this.tabellatiMapper.getProvince(regione);
			risultato.setData(righe);
		} catch (Throwable t) {
			// qualsiasi sia l'errore si traccia nel log e si ritorna un codice
			// fisso ed il messaggio allegato all'eccezione come errore
			logger.error(
					"Errore inaspettato durante l'estrazione delle province "
							+ regione, t);
			risultato.setError(TabellatoResult.ERROR_UNEXPECTED + ": "
					+ t.getMessage());
		}

		return risultato;
	}
	
	  public TabellatoProvinceResult getProvinceIstat(String language){
			TabellatoProvinceResult risultato = new TabellatoProvinceResult();
			try {
				List<TabellatoProvinceEntry> righe = this.tabellatiMapper.getProvinceIstat();
				risultato.setData(righe);
			} catch (Throwable t) {
				// qualsiasi sia l'errore si traccia nel log e si ritorna un codice
				// fisso ed il messaggio allegato all'eccezione come errore
				logger.error(
						"Errore inaspettato durante l'estrazione delle province Istat", t);
				risultato.setError(TabellatoProvinceResult.ERROR_UNEXPECTED + ": "
						+ t.getMessage());
			}

			return risultato;
		}
	
	public TabellatoResult getAtti(String language) {

		TabellatoResult risultato = new TabellatoResult();
		try {
			List<TabellatoEntry> righe = this.tabellatiMapper.getAtti();
			risultato.setData(righe);
		} catch (Throwable t) {
			// qualsiasi sia l'errore si traccia nel log e si ritorna un codice
			// fisso ed il messaggio allegato all'eccezione come errore
			logger.error(
					"Errore inaspettato durante l'estrazione degli atti "
							+ language, t);
			risultato.setError(TabellatoResult.ERROR_UNEXPECTED + ": "
					+ t.getMessage());
		}
		return risultato;
	}
	
	
}
