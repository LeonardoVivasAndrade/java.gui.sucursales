/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MUNDO;
import Animacion.Fade;
import VISTA.GUI;
import java.util.Date;

/**
 *
 * @author Angel Leonardo Vivas Andrade - codigo 1151646 Ing. de Sistemas UFPS
 * @since 2018
 * 
 */
public class Main {
    public static void main(String[] args) {
        GUI sucu = new GUI();
        sucu.setVisible(true);
        sucu.setOpacity(0f);
        Fade.JFrameFadeIn(0f, 1f, 0.1f, 100,sucu);
    }
}
