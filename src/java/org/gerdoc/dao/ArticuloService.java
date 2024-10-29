/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gerdoc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.gerdoc.model.bd.Articulo;

/**
 *
 * @author Usuario
 */
public class ArticuloService  extends Conexion<Articulo>
{

    public ArticuloService() 
    {
    }
    
    
    public List<Articulo> getArticuloList() 
    {
        List<Articulo> articuloList = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Articulo articulo = null;

        try 
        {
            connection = getConnection();
            if (connection == null) 
            {
                return null;
            }
            statement = connection.createStatement();
            if (statement == null) {
                return null;
            }
            resultSet = statement.executeQuery("SELECT * FROM articulo");
            if (resultSet == null) 
            {
                return null;
            }
            articuloList = new ArrayList<>();
            while (resultSet.next()) 
            {
                articulo = new Articulo();
                articulo.setClave( resultSet.getInt(1));
                articulo.setArticulo(resultSet.getString(2));
                articulo.setDescripcion(resultSet.getString(3));
                articulo.setPrecio(resultSet.getInt(4));
                articuloList.add(articulo);
            }
            resultSet.close();
            closeConnection(connection);
            return articuloList;
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        List<Articulo> list = new ArticuloService().getArticuloList( );
        for(Articulo articulo:list)
        {
            System.out.println(articulo.getArticulo());
        }
    }
}
