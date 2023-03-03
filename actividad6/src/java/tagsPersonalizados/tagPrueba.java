package tagsPersonalizados;

import java.io.IOException;
import java.util.Date;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class tagPrueba extends SimpleTagSupport
{
    @Override
    public void doTag() throws JspException, IOException
    {
        JspWriter out=getJspContext().getOut();
        Date hoy=new Date();
        out.println("Tag vacio, soy Edgar Mendez y la fecha de hoy es: " + hoy + "\n");
    }
}
