/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gerdoc.logica;

import java.io.Serializable;
import java.util.List;
import org.gerdoc.dao.ArticuloService;
import org.gerdoc.model.bd.Articulo;

/**
 *
 * @author gerdoc
 */
public class ArticuloListLogica  implements Serializable
{

    public ArticuloListLogica() 
    {
    }
    
    public List<Articulo>getArticulosList( )
    {
        return new ArticuloService( ).getArticuloList( );
    }
     
}
