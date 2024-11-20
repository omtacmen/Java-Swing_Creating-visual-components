package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelImagen extends JPanel implements Serializable
{
    // private File rutaImagen;
    private ImagenFondo imagenFondo;

    public JPanelImagen()
    {
        
    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*
        if (rutaImagen!=null && rutaImagen.exists()){
            ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, this);
        }
        */
        if (imagenFondo!=null){
            if (imagenFondo.getRutaImagen()!=null && imagenFondo.getRutaImagen().exists()){
                // Cogemos la imagen
                ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
                Graphics2D g2d = (Graphics2D)g;
                // Dibujamos la imagen con una opacidad que nosotros la hemos puesto en el slider.
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
                // Una vez que dibujamos la imagen, tenemos que volver a poner la opacidad como estaba al principio
                // que es con el valor 1.
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }
    }
    
    
    
}
