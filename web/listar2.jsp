<%@page import="java.util.Hashtable"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>

<%@page import = "Paquete.Personajes"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css" type="text/css"><link>
        <script src="JavaScript.js"></script>
        <title> Personajes</title>
    </head>

    <body onload="startTime()"> 
        <h1 class="titulo">Personajes</h1>
        
        <ul>
            <li><a href="index.jsp">Pagina Principal</a></li>
            <li><a href="listar2.jsp">Personajes</a></li>
            <div id="clockdate">
                    <div class="clockdate-wrapper">
                        <div id="clock"></div>
                        <div id="date"></div>
                    </div>
            </div>
        </ul>
        

        <%-- JSTL foreach tag example to loop a HashMap in JSP --%>
        <!--<table>
            <c:forEach var="entry" items="${applicationScope.map}">
                <tr><td><c:out value="${entry.key}"/></td> <td><c:out value="${entry.value.getApellido()}"/> </td></tr>
            </c:forEach>
        </table>-->
        
        <article>
            <c:forEach var="entry" items="${applicationScope.map}">
            <a class="enlace" href="datosJugador.jsp?dato1=${entry.value.getApellido()}&dato2=${entry.value.getFecha()}&dato3=${entry.value.getProfesion()}&dato4=${entry.value}&dato5=${entry.value.getYear()}&dato6=${entry.value.getMes()}&dato7=${entry.value.getDia()}">
            <div style="float:left">
            <table>
                <tr>
                    <td class="td_imagen">
                        <figure><img class="imagen" src="${entry.value.getUrl()}"></figure>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h1 class="titulo"><c:out value="${entry.key}"/></h1>
                    </td>
                </tr>
            </table>
            </div>
            </a>
             </c:forEach>
        </article>
    
    <footer>
        <div id="pie">2021 &copy; PracticaJSP01</div>
    </footer>
    </body>
</html>

