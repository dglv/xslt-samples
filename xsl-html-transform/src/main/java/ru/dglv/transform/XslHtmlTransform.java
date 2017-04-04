package ru.dglv.transform;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class XslHtmlTransform
{
    public static void main(final String[] args)
    {
        try
        {
            final Source xmlSource = new javax.xml.transform.stream.StreamSource("cars.xml");
            final Source xslSource = new javax.xml.transform.stream.StreamSource("cars-style.xsl");
            final Result htmlResult = new javax.xml.transform.stream.StreamResult("result.html");
            
            final TransformerFactory transformerFactory = TransformerFactory.newInstance();
            final Transformer transformer = transformerFactory.newTransformer(xslSource);
            
            transformer.transform(xmlSource, htmlResult);
        }
        catch (final Exception e)
        {
            e.printStackTrace( );
            return;
        }
        
        System.out.println("Success!");
    }
}
