package tema7.simulacionExamen;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            Path ruta = Path.of("src/tema7/simulacionExamen/catalogo_videojuegos.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(ruta.toFile());

            extraccionPegi(document);

        } catch (IOException | SAXException | ParserConfigurationException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void extraccionPegi(Document document) {
        Pattern patronPegi = Pattern.compile("\\s(PEGI:\\s\\d{1,2})");
        NodeList videojuego = document.getElementsByTagName("videojuego");

        for (int i = 0; i < videojuego.getLength(); i++) {
            Element temp = (Element) videojuego.item(i);
            NodeList listaDescripcion = temp.getElementsByTagName("descripcion");

            if (listaDescripcion.getLength() == 1){
                Matcher m = patronPegi.matcher(listaDescripcion.item(0).getTextContent());
                if(m.find()){
                    System.out.println(m.group(1));
                }
            }
        }
    }

    private static void creacionDeFichas(Document document){
        NodeList juego = document.getElementsByTagName("videojuego");

        for (int i = 0; i < juego.getLength(); i++) {

        }

    }
}
