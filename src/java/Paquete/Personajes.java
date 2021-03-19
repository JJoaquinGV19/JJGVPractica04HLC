
package Paquete;

import java.io.Serializable;
import java.util.*;

public class Personajes {
    private String apellido;
    private Calendar fechaN = new GregorianCalendar();
    private String profesion;
    private String url;

    public Personajes(String apellido, int año, int mes, int dia, String profesion, String url) {
        this.apellido = apellido;
        this.fechaN.set(año, mes-1, dia);
        this.profesion = profesion;
        this.url = url;
    }
    
    public Personajes()
    {
        
    }

    public String calcularSigno(String vmes, String vdia)
    {
        String signo="";
        
        int mes=Integer.parseInt(vmes);
        int dia=Integer.parseInt(vdia);
        switch(mes) {		
            case 1: 
              // Enero
              if (dia>=21)
                signo="Acuario";
              else
                signo="Capricornio";				
              break;
            case 2:
              // Febrero
              if (dia>=21)
                signo="Piscis";
              else
                signo="Acuario";
              break;
            
            case 3:
              // Febrero
              if (dia>=21)
                signo="Aries";
              else
                signo="Piscis";
            break;
            
            case 4:
              // Febrero
              if (dia>=21)
                signo="Tauro";
              else
                signo="Aries";
            break;
            
            case 5:
              // Febrero
              if (dia>=21)
                signo="Geminis";
              else
                signo="Tauro";
            break;
            
            case 6:
              // Febrero
              if (dia>=21)
                signo="Cancer";
              else
                signo="Geminis";
            break;
            
            case 7:
              // Febrero
              if (dia>=21)
                signo="Leo";
              else
                signo="Cancer";
            break;
            
            case 8:
              // Febrero
              if (dia>=21)
                signo="Virgo";
              else
                signo="Leo";
            break;
            
            case 9:
              // Febrero
              if (dia>=21)
                signo="Libra";
              else
                signo="Virgo";
            break;
            
            case 10:
              // Febrero
              if (dia>=21)
                signo="Escorpio";
              else
                signo="Libra";
            break;
            
            case 11:
              // Febrero
              if (dia>=21)
                signo="Sagitario";
              else
                signo="Escorpio";
            break;
            
            case 12:
              // Febrero
              if (dia>=21)
                signo="Capricornio";
              else
                signo="Sagitario";
            break;
          }
        
        return signo;
    }
    
    public int calcularEdad(String vaño, String vmes, String vdia)
    {
        int edad =0;
        
        int mes=Integer.parseInt(vmes);
        int dia=Integer.parseInt(vdia);
        int anio=Integer.parseInt(vaño);
        
        Calendar aux = new GregorianCalendar();
        
        anio = aux.get(Calendar.YEAR)-anio;
        
        if(aux.get(Calendar.MONTH)>mes)
            edad = anio;
        else
            if(aux.get(Calendar.MONTH)<mes)
                edad = anio-1;
            else
            {
                if(aux.get(Calendar.DAY_OF_MONTH)>=dia)
                    edad = anio;
                else
                    edad = anio-1;
            }
        
        return edad;
    }
    
    public String getYear() {
	return fechaN.get(Calendar.YEAR)+"";
    }
    
    public String getMes() {
	return (fechaN.get(Calendar.MONTH)+1)+"";
    }
    
    public String getDia() {
	return fechaN.get(Calendar.DAY_OF_MONTH)+"";
    }

    public Calendar getFechaN() {
        return fechaN;
    }
    
    public String getUrl() {
        return url;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFecha() {
        String dia=fechaN.get(Calendar.DAY_OF_MONTH)+"";
        String mes=fechaN.get(Calendar.MONTH)+"";
        
        if(dia.length()==1)
        {
            dia = "0"+dia;
        }
        
        if(mes.length()==1)
        {
            mes = "0"+mes;
        }
        
        String fecha=fechaN.get(Calendar.YEAR)+"-"+mes+"-"+dia;
        
        return fecha;
    }

    public String getProfesion() {
        return profesion;
    }
    
    
}
