package views;

import data.Persistencia;
import domain.TipoAlimentacion;

import javax.swing.*;
import java.util.InvalidPropertiesFormatException;

public class Program {

    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        IngresarAnimalView view1 = new IngresarAnimalView();
        ListarAnimalesView view = new ListarAnimalesView();
        view.setVisible(true);
        view1.setVisible(true);
    }
}
