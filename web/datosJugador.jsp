<%-- 
    Document   : datosJugador
    Created on : 17-feb-2021, 13:11:03
    Author     : magda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:useBean id="p" class="Paquete.Personajes"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css" type="text/css"><link>
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1 id="datos">Datos de la persona</h1>
         <% String datoUno = request.getParameter("dato1");
            String datoDos = request.getParameter("dato2");
            String datoTres = request.getParameter("dato3");
            String datoAnio = request.getParameter("dato5");
            String datoMes = request.getParameter("dato6");
            String datoDia = request.getParameter("dato7");
            
            /*out.println("<h3>Apellido: "+datoUno+"</h3>"); 
            out.println("<h3>Fecha de nacimiento: "+datoDos+"</h3>");
            out.println("<h3>Edad: "+p.calcularEdad(datoAnio, datoMes, datoDia)+"</h3>");
            out.println("<h3>Profesion: "+datoTres+"</h3>");
            out.println("<h3>Signo Zodiacal: "+p.calcularSigno(datoMes, datoDia)+"</h3>");
            */
         %>
    
         <table class="datos">
             <tr class="datos">
                 <td class="datos"><h3><b>Apellido: </b></h3></td>
                 <td class="datos"><h3><b><%=datoUno%></b></h3></td>
             </tr>
             <tr class="datos">
                 <td class="datos"><h3><b>Fecha de nacimiento: </b></h3></td>
                 <td class="datos"><h3><b><%=datoDos%></b></h3></td>
             </tr>
             <tr class="datos">
                 <td class="datos"><h3><b>Edad: </h3></b></td>
                 <td class="datos"><h3><b><%=p.calcularEdad(datoAnio, datoMes, datoDia)%></b></h3></b></td>
             </tr>
             <tr class="datos">
                 <td class="datos"><h3><b>Profesion: </b></h3></td>
                 <td class="datos"><h3><b><%=datoTres%></b></h3></td>
             </tr>
             <tr class="datos">
                 <td class="datos"><h3><b>Signo Zodiacal: </b></h3></td>
                 <td class="datos"><h3><b><%=p.calcularSigno(datoMes, datoDia)%></b></h3></td>
             </tr>
         </table>
         
         <footer>
        <div id="pie">2021 &copy; PracticaJSP01</div>
    </footer>    
             
    </body>
    
</html>
