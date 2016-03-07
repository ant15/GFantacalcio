/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gfantacalcio.object;


public class Giocatore {
    
    private String nome;
    private String cognome;
    private int prezzo;
    private boolean capitano;
    private int ruolo;
    private float voto;
    private boolean ammonizione;
    private boolean espulsione;
    private int gol;
    private int assist;
    private boolean infortunio;
    private int presenze;
    private int rigore;
    
    public Giocatore() {
        this.nome = "";
        this.cognome = "";
        this.prezzo = 0;
        this.capitano = false;
        this.ruolo = 0;
        this.voto = 0;
        this.ammonizione = false;
        this.espulsione = false;
        this.gol = 0;
        this.rigore = 0;
        this.assist = 0;
        this.infortunio = false;
        this.presenze = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public boolean setPrezzo(int prezzo) {
        if(prezzo <= 0){            
            return false;
        }
        this.prezzo = prezzo;
        return true;
    }

    public boolean getCapitano() {
        return capitano;
    }

    public void setCapitano(boolean cap) {
        this.capitano = cap;
    }

    public int getRuolo() {
        return ruolo;
    }

    public boolean setRuolo(int ruolo) {
        if((ruolo < 1)||(ruolo > 4)){
            return false;
        }
        this.ruolo = ruolo;
        return true;
    }

    public float getVoto() {
        return voto;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }

    public boolean getAmmonizione() {
        return ammonizione;
    }

    public void setAmmonizione(boolean ammonizione) {
        this.ammonizione = ammonizione;
    }

    public boolean getEspulsione() {
        return espulsione;
    }

    public void setEspulsione(boolean espulsione) {
        this.espulsione = espulsione;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public boolean getInfortunio() {
        return infortunio;
    }

    public void setInfortunio(boolean infortunio) {
        this.infortunio = infortunio;
    }

    public int getPresenze() {
        return presenze;
    }

    public void setPresenze(int presenze) {
        this.presenze = presenze;
    }

    public int getRigore() {
        return rigore;
    }

    public void setRigore(int rigore) {
        this.rigore = rigore;
    }
    
    
    
}
