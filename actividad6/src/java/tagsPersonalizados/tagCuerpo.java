package tagsPersonalizados;

import java.io.IOException;
import java.io.StringWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.util.Date;

public class tagCuerpo extends SimpleTagSupport
{
    StringWriter sw=new StringWriter();
    
    @Override
    public void doTag() throws JspException, IOException
    {
        Date hoy=new Date();
        getJspBody().invoke(sw);
        getJspContext().getOut().println("Actividad 6 de "+sw.toString() + "\nLa fecha del dia de hoy es: " + hoy);
    }
}
