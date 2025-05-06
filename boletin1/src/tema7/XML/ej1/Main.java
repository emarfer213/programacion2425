package tema7.XML.ej1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Persona> conjuntoPersonas;
    static {
        conjuntoPersonas = new ArrayList<>(List.of(
                new Persona("Jose", "5556566566H", "8678728172", LocalDate.of(2025,8,16)),
                new Persona("Carlos", "5556566566H", "8678728172", LocalDate.of(2025,8,16)),
                new Persona("Anibal", "5556566566H", "8678728172", LocalDate.of(2025,8,16)),
                new Persona("Antonio", "5556566566H", "8678728172", LocalDate.of(2025,8,16))
        ));
    }


    public static void main(String[] args) {
        crearXML();
    }

    public static void crearXML(){
        File destino = new File("C:\\Users\\alumno\\Desktop\\programacion\\programacion2425\\boletin1\\src\\tema7\\XML\\ej1\\primerXml.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument();
            Element root = documento.createElement("personas");
            documento.appendChild(root);

            for (Persona persona : conjuntoPersonas){
                Element elementoPersona = documento.createElement("personas");
                elementoPersona.setAttribute("DNI", persona.getDni());

                Element nombre = documento.createElement("nombre");
                nombre.setTextContent(persona.getNombre());

                Element telefono = documento.createElement("nombre");
                telefono.setTextContent(persona.getTelefono());

                Element fecha = documento.createElement("nombre");
                fecha.setTextContent(persona.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                elementoPersona.appendChild(nombre);
                elementoPersona.appendChild(telefono);
                elementoPersona.appendChild(fecha);

                root.appendChild(elementoPersona);
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            StreamResult result = new StreamResult(destino);
            DOMSource source = new DOMSource(documento);

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println("Error!" + ex.getMessage());
        }
    }
}
