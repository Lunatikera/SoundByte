/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import InterfacesDAO.IDatosPruebaDAO;
import InterfacesNegocio.IDatosPruebaNegocio;

/**
 *
 * @author carli
 */
public class DatosPruebaNegocio implements IDatosPruebaNegocio {

    private final IDatosPruebaDAO datos;

    public DatosPruebaNegocio(IDatosPruebaDAO datos) {
        this.datos = datos;
    }

    @Override
    public void insercionMasiva() {
        if (!datos.verificarExixstenciaDatos()) {
            datos.insercionMasiva();
        }
    }

    public boolean verificarExixstenciaDatos() {
        return datos.verificarExixstenciaDatos();
    }
}
