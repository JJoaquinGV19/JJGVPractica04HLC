<%@page import="java.util.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import = "Paquete.Personajes"%>

<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css" type="text/css"><link>
        <script src="JavaScript.js"></script>
        <title>Pagina Principal</title>
    </head>
    <body onload="startTime()">
    <header>
        <h1 class="titulo">Pagina Principal</h1>
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
    </header>
    
    <section>
        <svg version="1.1" id="Ebene_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" 
   width="600px" height="100px" viewBox="0 0 600 100">
<style type="text/css">

<![CDATA[

  text {
    filter: url(#filter);
    fill: white;
      font-family: 'Share Tech Mono', sans-serif;
      font-size: 100px;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
        }
]]>
</style>
  <defs>

    <filter id="filter">
        <feFlood flood-color="black" result="black" />
        <feFlood flood-color="red" result="flood1" />
        <feFlood flood-color="limegreen" result="flood2" />
      <feOffset in="SourceGraphic" dx="3" dy="0" result="off1a"/>
      <feOffset in="SourceGraphic" dx="2" dy="0" result="off1b"/>
      <feOffset in="SourceGraphic" dx="-3" dy="0" result="off2a"/>
      <feOffset in="SourceGraphic" dx="-2" dy="0" result="off2b"/>
        <feComposite in="flood1" in2="off1a" operator="in"  result="comp1" />
        <feComposite in="flood2" in2="off2a" operator="in" result="comp2" />

        <feMerge x="0" width="100%" result="merge1">
        <feMergeNode in = "black" />
        <feMergeNode in = "comp1" />
        <feMergeNode in = "off1b" />

        <animate 
          attributeName="y" 
            id = "y"
            dur ="4s"
            
            values = '104px; 104px; 30px; 105px; 30px; 2px; 2px; 50px; 40px; 105px; 105px; 20px; 6ßpx; 40px; 104px; 40px; 70px; 10px; 30px; 104px; 102px'

            keyTimes = '0; 0.362; 0.368; 0.421; 0.440; 0.477; 0.518; 0.564; 0.593; 0.613; 0.644; 0.693; 0.721; 0.736; 0.772; 0.818; 0.844; 0.894; 0.925; 0.939; 1'

            repeatCount = "indefinite" />
 
        <animate attributeName="height" 
            id = "h" 
            dur ="4s"
            
            values = '10px; 0px; 10px; 30px; 50px; 0px; 10px; 0px; 0px; 0px; 10px; 50px; 40px; 0px; 0px; 0px; 40px; 30px; 10px; 0px; 50px'

            keyTimes = '0; 0.362; 0.368; 0.421; 0.440; 0.477; 0.518; 0.564; 0.593; 0.613; 0.644; 0.693; 0.721; 0.736; 0.772; 0.818; 0.844; 0.894; 0.925; 0.939; 1'

            repeatCount = "indefinite" />
        </feMerge>
      

      <feMerge x="0" width="100%" y="60px" height="65px" result="merge2">
        <feMergeNode in = "black" />
        <feMergeNode in = "comp2" />
        <feMergeNode in = "off2b" />

        <animate attributeName="y" 
            id = "y"
            dur ="4s"
            values = '103px; 104px; 69px; 53px; 42px; 104px; 78px; 89px; 96px; 100px; 67px; 50px; 96px; 66px; 88px; 42px; 13px; 100px; 100px; 104px;' 

            keyTimes = '0; 0.055; 0.100; 0.125; 0.159; 0.182; 0.202; 0.236; 0.268; 0.326; 0.357; 0.400; 0.408; 0.461; 0.493; 0.513; 0.548; 0.577; 0.613; 1'

            repeatCount = "indefinite" />
 
        <animate attributeName="height" 
            id = "h"
            dur = "4s"
          
          values = '0px; 0px; 0px; 16px; 16px; 12px; 12px; 0px; 0px; 5px; 10px; 22px; 33px; 11px; 0px; 0px; 10px'

            keyTimes = '0; 0.055; 0.100; 0.125; 0.159; 0.182; 0.202; 0.236; 0.268; 0.326; 0.357; 0.400; 0.408; 0.461; 0.493; 0.513;  1'
             
            repeatCount = "indefinite" />
        </feMerge>
      
            <feMerge>
              <feMergeNode in="SourceGraphic" />  

              <feMergeNode in="merge1" /> 
            <feMergeNode in="merge2" />

              </feMerge>
            </filter>

        </defs>

      <g>
        <text x="0" y="100">Jose Joaquin</text>
        <text x="0" y="200">Garrido Vargas</text>
      </g>
      </svg>
    </section>
    
    
       <% 
            // Avoid Java Code in JSP - This is only for ease of testing
            Map<String, Personajes> personaje = new HashMap<String, Personajes>();
            personaje.put("Rafael", new Personajes("Nadal", 1986, 06, 03, "Tenista", "https://estaticos.marie-claire.es/media/cache/760x570_thumb/uploads/images/article/5fa29bc15cafe812d2d168e5/nadal-cuadrada_1.jpg"));
            personaje.put("Elon", new Personajes("Musk", 1971, 06, 28, "Emprendedor", "https://thumbor.forbes.com/thumbor/fit-in/416x416/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5f47d4de7637290765bce495%2F0x0.jpg%3Fbackground%3D000000%26cropX1%3D1398%26cropX2%3D3908%26cropY1%3D594%26cropY2%3D3102"));
            personaje.put("Albert", new Personajes("Enstein", 1879, 03, 14, "Fisico", "https://www.fundacionaquae.org/wp-content/uploads/2014/11/AlbertEinstein.jpg"));
            personaje.put("F. Javier", new Personajes("Alvarez", 1996, 07, 02, "Cantante", "https://yt3.ggpht.com/ytc/AAUvwniriKOHq9wy8k7vWafWTVtiLUONUhP2vhz-LRHY=s900-c-k-c0x00ffffff-no-rj"));
            personaje.put("Emma", new Personajes("Watson", 1990, 04, 15, "Actriz", "https://www.tuenlinea.com/wp-content/uploads/2018/08/Conoce-a-la-chica-que-es-id%C3%A9ntica-a-Emma-Watson-1.jpg"));
           
            // put the hashmap as pageContext attribute
            application.setAttribute("map", personaje);
        %>     
            
    <footer>
        <div id="pie">2021 &copy; PracticaJSP01</div>
    </footer>
    </body>
</html>
