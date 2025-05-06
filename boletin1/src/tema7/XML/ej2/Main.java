package tema7.XML.ej2;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("encontrados: " + contarElementosClassMenu());
        System.out.println(IMGconALT());
    }

    public static int contadorDIV() {
        File archivoHTML = new File("src/tema7/XML/ej2/web1.html");
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(archivoHTML);

            NodeList listaDeNodos = document.getElementsByTagName("div");
            return listaDeNodos.getLength();
        } catch (SAXException | IOException | ParserConfigurationException e) {
            System.out.println("error en la ejecucion " + e.getMessage());
            throw new RuntimeException();
        }
    }

    /*public static String LeerTituloWeb() {
        File archivoHTML = new File("src/tema7/XML/ej2/web1.html");
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(archivoHTML);


        } catch (SAXException | IOException | ParserConfigurationException e) {
            return e.getMessage();
        }
    }*/

    public static int contadorDIVconID() {
        File archivoHTML = new File("src/tema7/XML/ej2/web1.html");
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(archivoHTML);

            NodeList listaDeNodos = document.getElementsByTagName("div");
            int contador = 0;
            for (int i = 0; i < listaDeNodos.getLength(); i++) {
                Node nodo = listaDeNodos.item(i);
                NamedNodeMap atributos = nodo.getAttributes();
                Node nodoId = atributos.getNamedItem("id");

                if (nodoId != null && nodoId.getNodeValue() != null && !nodoId.getNodeValue().isEmpty()) {
                    contador++;
                }
            }
            return contador;
        } catch (SAXException | IOException | ParserConfigurationException e) {
            System.out.println("error " + e.getMessage());
            throw new RuntimeException();
        }
    }

    public static int contarElementosClassMenu() {
        File archivoHTML = new File("src/tema7/XML/ej2/web1.html");
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(archivoHTML);
            Pattern patron = Pattern.compile("(?i)\\bmenu\\b");
            return elementoAtributoClassMenuRecursivo(document.getDocumentElement(), patron, 0);

        } catch (SAXException | IOException | ParserConfigurationException e) {
            System.out.println("error " + e.getMessage());
            throw new RuntimeException();
        }
    }

    public static int elementoAtributoClassMenuRecursivo(Node nodo, Pattern patron, int encontrados) {
        NodeList listaDeNodos = nodo.getChildNodes();

        for (int i = 0; i < listaDeNodos.getLength(); i++) {
            Node nodoTemporal = listaDeNodos.item(i);
            if (nodoTemporal.getNodeType() == Node.ELEMENT_NODE) {
                if (nodoTemporal.hasChildNodes()) {
                    encontrados = elementoAtributoClassMenuRecursivo(nodoTemporal, patron, encontrados);
                }

                String clases = ((Element) nodoTemporal).getAttribute("class");
                String[] clasesSueltas = clases.split("\\s+");
                for (int j = 0; j < clasesSueltas.length; j++) {
                    Matcher matcher = patron.matcher(clases);
                    if (matcher.matches()){
                        encontrados++;
                    }
                }
            }
        }
        return encontrados;
    }

    public static String IMGconALT(){
        try {
            File archivoHTML = new File("src/tema7/XML/ej2/web1.html");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(archivoHTML);

            NodeList nodeList = document.getElementsByTagName("img");
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nodo = nodeList.item(i);
                NamedNodeMap atributos = nodo.getAttributes();
                Node nodoAlt = atributos.getNamedItem("alt");
                sb.append(nodoAlt.getNodeValue()).append("\n");
            }
            return sb.toString();
        } catch (SAXException | IOException | ParserConfigurationException e) {
            System.out.println("error " + e.getMessage());
            throw new RuntimeException();
        }
    }

   /* public static Element getDivMenu(Element nodoRaiz){
        NodeList nodeList = nodoRaiz.getElementsByTagName("div");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element nodoTemporal = (Element) nodeList.item(i);
            if (nodoTemporal.getAttribute("id").equals("menu")){

            }
        }
    }*/
}
