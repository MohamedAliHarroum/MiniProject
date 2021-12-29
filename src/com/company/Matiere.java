package com.company;

public class Matiere {
    String nomMatiere;
    double noteExamen;
    double noteTP;
    double noteDS;

    public Matiere(String nomMatiere, double noteExamen, double noteTP, double noteDS) {
        this.nomMatiere = nomMatiere;
        this.noteExamen = noteExamen;
        this.noteTP = noteTP;
        this.noteDS = noteDS;
    }

    public Matiere() {

    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public double getNoteExamen() {
        return noteExamen;
    }

    public double getNoteTP() {
        return noteTP;
    }

    public double getNoteDS() {
        return noteDS;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public void setNoteExamen(double noteExamen) {
        this.noteExamen = noteExamen;
    }

    public void setNoteTP(double noteTP) {
        this.noteTP = noteTP;
    }

    public void setNoteDS(double noteDS) {
        this.noteDS = noteDS;
    }
}
