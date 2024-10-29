/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gerdoc.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.gerdoc.model.MenuModelo;

/**
 *
 * @author Usuario
 */
public class MenuLogica implements Serializable
{

    public MenuLogica() 
    {
    }
    
    
    public List<MenuModelo> getMenuAdmin( String param1 )
    {
        List<MenuModelo>list = new ArrayList<MenuModelo>();
        
        list.add( new MenuModelo( "nav-link disabled", true, "index.jsp", "index", true ) );
        list.add( new MenuModelo( "nav-link ", false, "uno.jsp", "Uno", false ) );
        list.add( new MenuModelo( "nav-link ", false, "dos.jsp", "Dos", false ) );
        return list;
    }

    
}
