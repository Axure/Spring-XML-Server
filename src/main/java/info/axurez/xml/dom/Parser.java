package info.axurez.xml.dom;
/**
 * If the method of DOM takes too much memory, then it would be easy to attack the server by sending large requests?
 */

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class Parser {

    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

    public Document parse(String filePath) {
        Document document = null;
        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            document = builder.parse(new File(filePath));

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    public static Document loadXMLFromString(String xml) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        Document document = null;
        try {
            InputSource is = new InputSource(new StringReader(xml));
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(is);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }

        return document;
    }

    /**
     * Use a recursive algorithm to validate an XML document.
     *
     * @param template
     * @param input
     * @return
     */
    public static Boolean validateXml(String template, String input) {
        DOMParser parser = new DOMParser();

        Document templateDocument = loadXMLFromString(template);
        Document inputDocument = loadXMLFromString(input);

        Element inputRootElement = inputDocument.getDocumentElement();
        Element templateRootElement = templateDocument.getDocumentElement();

        if (inputRootElement.getTagName() != templateRootElement.getTagName()) {
            return false;
        }

        return true;
    }



    public static ArrayList<Object> subtractAccordingToTemplate() {

        ArrayList<Object> result = new ArrayList();


        return result;
    }
}
