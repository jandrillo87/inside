/* Copyright (C) 2016 MINHAP, Gobierno de España
   This program is licensed and may be used, modified and redistributed under the terms
   of the European Public License (EUPL), either version 1.1 or (at your
   option) any later version as soon as they are approved by the European Commission.
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
   or implied. See the License for the specific language governing permissions and
   more details.
   You should have received a copy of the EUPL1.1 license
   along with this program; if not, you may find it at
   http://joinup.ec.europa.eu/software/page/eupl/licence-eupl */

package es.mpt.dsic.inside.service.validacionENI.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-10-20T13:24:03.336+02:00
 * Generated source version: 3.0.3
 * 
 */
@WebServiceClient(name = "EeUtilValidacionENIServiceImplService", 
                  wsdlLocation = "http://eeutil-misc.desappjava.seap.minhap.es/eeutil-misc/ws/EeUtilValidacionENIService?wsdl",
                  targetNamespace = "http://impl.service.ws.inside.dsic.mpt.es/") 
public class EeUtilValidacionENIServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.ws.inside.dsic.mpt.es/", "EeUtilValidacionENIServiceImplService");
    public final static QName EeUtilValidacionENIServiceImplPort = new QName("http://impl.service.ws.inside.dsic.mpt.es/", "EeUtilValidacionENIServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://eeutil-misc.desappjava.seap.minhap.es/eeutil-misc/ws/EeUtilValidacionENIService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EeUtilValidacionENIServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://eeutil-misc.desappjava.seap.minhap.es/eeutil-misc/ws/EeUtilValidacionENIService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EeUtilValidacionENIServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EeUtilValidacionENIServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EeUtilValidacionENIServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public EeUtilValidacionENIServiceImplService(WebServiceFeature ... features) {
//        super(WSDL_LOCATION, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public EeUtilValidacionENIServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
//        super(wsdlLocation, SERVICE, features);
//    }
//
//    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
//    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
//    //compliant code instead.
//    public EeUtilValidacionENIServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
//        super(wsdlLocation, serviceName, features);
//    }    

    /**
     *
     * @return
     *     returns EeUtilValidacionENIService
     */
    @WebEndpoint(name = "EeUtilValidacionENIServiceImplPort")
    public EeUtilValidacionENIService getEeUtilValidacionENIServiceImplPort() {
        return super.getPort(EeUtilValidacionENIServiceImplPort, EeUtilValidacionENIService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EeUtilValidacionENIService
     */
    @WebEndpoint(name = "EeUtilValidacionENIServiceImplPort")
    public EeUtilValidacionENIService getEeUtilValidacionENIServiceImplPort(WebServiceFeature... features) {
        return super.getPort(EeUtilValidacionENIServiceImplPort, EeUtilValidacionENIService.class, features);
    }

}
