<%-- 
    Document   : menu
    Created on : 15 oct. 2024, 13:06:30
    Author     : Usuario
--%>

<%@page import="org.gerdoc.logica.ArticuloListLogica"%>
<%@page import="org.gerdoc.model.bd.Articulo"%>

<%@page import="java.util.List"%>
<%@page import="org.gerdoc.model.MenuModelo"%>
<%

List<Articulo>articulos = new ArticuloListLogica( ).getArticulosList( );
if( articulos == null || articulos.size() == 0)
{
    out.print("<b>Sin datos</b>");
    return;
}
%>
<table class="table table-hover table-striped table-bordered"> 
    <thead>
        <tr>
        <th scope="col"><b>Clave</b></th>
        <th scope="col"><b>Artículo</b></th>
        <th scope="col"><b>Descripción</b></th>
        <th scope="col"><b>Precio</b></th>
        </tr>
    </thead>
    <tbody>
<%
    for( Articulo articulo : articulos)
    {
%>
        <tr>
            <th scope="col"><%=articulo.getClave( )%></th>
            <th scope="col"><%=articulo.getArticulo( )%></th>
            <th scope="col"><%=articulo.getDescripcion( )%></th>
            <th scope="col"><%=articulo.getPrecio( )%></th>
        </tr>    
<%
    }
%>
    </tbody>
</table>