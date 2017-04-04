package ru.dglv.transform;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltHtmlTransform
{
    public static void main(final String[] args)
    {
        try
        {
            final Source xmlSource = new StreamSource("cars.xml");
            final Source xsltSource = new StreamSource("cars-style.xsl");
            final Result htmlResult = new StreamResult("result.html");
            
            final TransformerFactory transformerFactory = TransformerFactory.newInstance();
            final Transformer transformer = transformerFactory.newTransformer(xsltSource);
            
            transformer.transform(xmlSource, htmlResult);
            
            System.out.println("Success!");
        }
        catch (final Exception e)
        {
            e.printStackTrace( );
        }
    }
}
