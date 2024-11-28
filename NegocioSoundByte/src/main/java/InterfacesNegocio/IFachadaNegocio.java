/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

/**
 *
 * @author santi
 */
public interface IFachadaNegocio {
    
    public IAlbumNegocio getAlbumNegocio();
    
    public IArtistaNegocio getArtistaNegocio();
    
    public IGeneroNegocio getGeneroNegocio();
    
    public IUsuarioNegocio getUsuarioNegocio();
    
}
