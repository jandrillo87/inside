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

package es.mpt.dsic.firma.cliente.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import es.mpt.dsic.firma.cliente.service.EeUtilFirmarService;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-05-04T08:38:05.279+02:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "EeUtilFirmarServiceImplService", 
                  wsdlLocation = "http://desappjava.seap.minhap.es/eeutil/ws/EeUtilFirmarService?wsdl",
                  targetNamespace = "http://impl.service.ws.inside.dsic.mpt.es/") 
public class EeUtilFirmarServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.ws.inside.dsic.mpt.es/", "EeUtilFirmarServiceImplService");
    public final static QName EeUtilFirmarServiceImplPort = new QName("http://impl.service.ws.inside.dsic.mpt.es/", "EeUtilFirmarServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://desappjava.seap.minhap.es/eeutil/ws/EeUtilFirmarService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EeUtilFirmarServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://desappjava.seap.minhap.es/eeutil/ws/EeUtilFirmarService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EeUtilFirmarServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EeUtilFirmarServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EeUtilFirmarServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns EeUtilFirmarService
     */
    @WebEndpoint(name = "EeUtilFirmarServiceImplPort")
    public EeUtilFirmarService getEeUtilFirmarServiceImplPort() {
        return super.getPort(EeUtilFirmarServiceImplPort, EeUtilFirmarService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EeUtilFirmarService
     */
    @WebEndpoint(name = "EeUtilFirmarServiceImplPort")
    public EeUtilFirmarService getEeUtilFirmarServiceImplPort(WebServiceFeature... features) {
        return super.getPort(EeUtilFirmarServiceImplPort, EeUtilFirmarService.class, features);
    }

}
