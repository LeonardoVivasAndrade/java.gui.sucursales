
package MUNDO;
import Animacion.Fade;
import VISTA.GUI;

/**
 * @author Angel Leonardo Vivas Andrade - codigo 1151646 Ing. de Sistemas UFPS 
 */
public class Main {
    public static void main(String[] args) {
        GUI sucu = new GUI();
        sucu.setVisible(true);
        sucu.setOpacity(0f);
        Fade.JFrameFadeIn(0f, 1f, 0.1f, 100,sucu);
    }
}
