/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author olivertm
 */
public class ImagenFondo implements Serializable {
    private File rutaImagen;
    private Float opacidad;

    public ImagenFondo(File rutaImagen, Float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(Float opacidad) {
        this.opacidad = opacidad;
    }
    
    
}
