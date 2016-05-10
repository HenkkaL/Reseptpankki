/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.henriklyra.reseptipankki;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Tekninen apuluokka, jonka tehtävänä on tarkkailla ja päivittää reseptinäkymän 
 * muokkaustilassa tapahtuvia reseptin nimeen kohdistuvia toimenpiteitä
 * @author Henkka
 * @see Reseptinakyma
 * @see Resepti
 */
public class PaivitaNimi implements DocumentListener{
          
            private JTextField nimiKentta;
            Resepti resepti;
            
            public PaivitaNimi(JTextField nimiKentta, Resepti resepti){
                this.nimiKentta = nimiKentta;
                this.resepti = resepti;
            }

        @Override
        public void insertUpdate(DocumentEvent de) {            
            this.resepti.setNimi(this.nimiKentta.getText());
            Reseptikortisto.tallentamatonMuutos();
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
            this.resepti.setNimi(this.nimiKentta.getText());
            Reseptikortisto.tallentamatonMuutos();
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
            this.resepti.setNimi(this.nimiKentta.getText());
            Reseptikortisto.tallentamatonMuutos();
        }
    
}
