/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author olivertm
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport {

    private ImagenFondoJPanelForm imagenFondoPanel = new ImagenFondoJPanelForm();

    @Override
    public boolean supportsCustomEditor() {
        //return super.supportsCustomEditor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        // Este metodo lo llama netbeans cuando para esta propiedad quiera preguntar si hay un editor
        // personalizado o no.
        // Por defecto está a false, y como estamos editando.. pues devolvemos TRUE.
        return true;
    }

    @Override
    public Component getCustomEditor() {
        //return super.getCustomEditor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        // Aquí nos pide un panel, para ello devolvemos el panel que vamos a devolver.
        // En este caso nos creamos la variable imagenFondoPanel de tipo privado y la devolvemos aquí.
        return imagenFondoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        // Este es complejo y lo dejamos para el final.
        return super.getJavaInitializationString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValue() {
        // return super.getValue(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        // Una vez el usuario ha seleccionado el archivo y ha seleccionado la opacidad, pues devuelve
        // los valores que se han escogido. Y para ello seleccionamos el método que 
        // creamos de getSelectedValue que nos devuelve esos datos.
        return imagenFondoPanel.getSelectedValue();
    }
    
}
