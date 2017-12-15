
package es.mpt.dsic.inside.xml.eni.documento.contenido.mtom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.mpt.dsic.inside.xml.eni.documento.contenido.mtom package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContenidoMtom_QNAME = new QName("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido/mtom", "contenidoMtom");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.mpt.dsic.inside.xml.eni.documento.contenido.mtom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoContenidoMtom }
     * 
     */
    public TipoContenidoMtom createTipoContenidoMtom() {
        return new TipoContenidoMtom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoContenidoMtom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido/mtom", name = "contenidoMtom")
    public JAXBElement<TipoContenidoMtom> createContenidoMtom(TipoContenidoMtom value) {
        return new JAXBElement<TipoContenidoMtom>(_ContenidoMtom_QNAME, TipoContenidoMtom.class, null, value);
    }

}
