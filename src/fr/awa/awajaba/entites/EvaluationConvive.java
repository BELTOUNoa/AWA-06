/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba.entites;

/**
 *
 * @author root
 */
public class EvaluationConvive {
    
    private int note;
    private String commentaire;
    private boolean bloque = false;

    public int getNote() {
        return note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public boolean isBloque() {
        return bloque;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setBloque(boolean bloque) {
        this.bloque = bloque;
    }

    @Override
    public String toString() {
        return "EvaluationConvive{" + "note=" + note + ", commentaire=" + commentaire + ", bloque=" + bloque + '}';
    }
    
    
    
    
    
}
