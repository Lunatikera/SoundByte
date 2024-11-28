/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IArtistaNegocio;
import InterfacesNegocio.IFachadaNegocio;
import InterfacesNegocio.IGeneroNegocio;
import InterfacesNegocio.IUsuarioNegocio;

/**
 *
 * @author santi
 */
public class FachadaNegocio implements IFachadaNegocio{
    
    private final IAlbumNegocio albumNegocio;    
    private final IArtistaNegocio artistaNegocio;    
    private final IGeneroNegocio generoNegocio;    
    private final IUsuarioNegocio usuarioNegocio;

    public FachadaNegocio(IAlbumNegocio albumNegocio, IArtistaNegocio artistaNegocio, IGeneroNegocio generoNegocio, IUsuarioNegocio usuarioNegocio) {
        this.albumNegocio = albumNegocio;
        this.artistaNegocio = artistaNegocio;
        this.generoNegocio = generoNegocio;
        this.usuarioNegocio = usuarioNegocio;
    }

    @Override
    public IAlbumNegocio getAlbumNegocio() {
        return albumNegocio;
    }

    @Override
    public IArtistaNegocio getArtistaNegocio() {
        return artistaNegocio;
    }

    @Override
    public IGeneroNegocio getGeneroNegocio() {
        return generoNegocio;
    }

    @Override
    public IUsuarioNegocio getUsuarioNegocio() {
        return usuarioNegocio;
    }
    
    
    
}
