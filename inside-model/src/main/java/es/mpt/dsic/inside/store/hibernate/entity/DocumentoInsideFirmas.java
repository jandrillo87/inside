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

package es.mpt.dsic.inside.store.hibernate.entity;

// Generated 28-ago-2012 18:17:29 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DocumentoInsideFirmas generated by hbm2java
 */
@Entity
@Table(name = "DocumentoInsideFirmas")
public class DocumentoInsideFirmas implements java.io.Serializable {

	private Integer id;
	private FirmaInside firmaInside;
	private DocumentoInside documentoInside;

	public DocumentoInsideFirmas() {
	}

	public DocumentoInsideFirmas(FirmaInside firmaInside,
			DocumentoInside documentoInside) {
		this.firmaInside = firmaInside;
		this.documentoInside = documentoInside;
	}

/*	@Id
	@GeneratedValue(strategy = IDENTITY)*/
	
	
	@Id
	@TableGenerator(name = "GeneradorPk_DocumentoInsideFirmas",
            		table = "GeneradorClaves",
            		pkColumnName = "GenName",
            		valueColumnName = "GenValue",
            		pkColumnValue = "GEN_DocumentoInsideFirmas",
            		allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "GeneradorPk_DocumentoInsideFirmas")
    @Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_firma", nullable = false)
	public FirmaInside getFirmaInside() {
		return this.firmaInside;
	}

	public void setFirmaInside(FirmaInside firmaInside) {
		this.firmaInside = firmaInside;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_documento", nullable = false)
	public DocumentoInside getDocumentoInside() {
		return this.documentoInside;
	}

	public void setDocumentoInside(DocumentoInside documentoInside) {
		this.documentoInside = documentoInside;
	}
	
	@Override
	public String toString () {
		StringBuffer sb = new StringBuffer ("Entity DocumentoInsideFirmas=[");
		String coma = ", ";
		sb.append("id=" + id + coma);
		sb.append("firmaInside=" + firmaInside.toString());
		sb.append("]");
		return sb.toString();
	}

}
