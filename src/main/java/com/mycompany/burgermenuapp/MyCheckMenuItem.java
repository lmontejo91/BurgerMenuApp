/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.burgermenuapp;

import java.awt.event.MouseEvent;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;

/**
 *
 * @author LUCÍA
 */
    public class MyCheckMenuItem extends JCheckBoxMenuItem {

        public MyCheckMenuItem() {
        }

        public MyCheckMenuItem(Icon icon) {
            super(icon);
        }

        public MyCheckMenuItem(String text) {
            super(text);
        }

        public MyCheckMenuItem(Action a) {
            super(a);
        }

        public MyCheckMenuItem(String text, Icon icon) {
            super(text, icon);
        }

        public MyCheckMenuItem(String text, boolean b) {
            super(text, b);
        }

        public MyCheckMenuItem(String text, Icon icon, boolean b) {
            super(text, icon, b);
        }
        
        /*Este método sobrescrito permite que el Menú no se cierre cada vez que se hace click sobre un checkbox 
        y que permita cambiar de opción sin tener que abrirlo cada vez. Sólo se cerrará al pinchar fuera 
        del Menú*/
        @Override
        protected void processMouseEvent(MouseEvent evt) {
            if (evt.getID() == MouseEvent.MOUSE_RELEASED && contains(evt.getPoint())) {
                doClick();
                setArmed(true);
            } else {
                super.processMouseEvent(evt);
            }
        }
}
