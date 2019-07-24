/*
 * Copyright (C) 2016 MINHAP, Gobierno de España This program is licensed and may be used, modified
 * and redistributed under the terms of the European Public License (EUPL), either version 1.1 or
 * (at your option) any later version as soon as they are approved by the European Commission.
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and more details. You
 * should have received a copy of the EUPL1.1 license along with this program; if not, you may find
 * it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */

package es.mpt.dsic.inside.store.hibernate.entity;

// Generated 28-ago-2012 18:17:29 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import es.mpt.dsic.inside.util.InsideUtils;

/**
 * ExpedienteInsideIndice generated by hbm2java
 */
@Entity
@Table(name = "ExpedienteInsideIndice")
public class ExpedienteInsideIndice implements java.io.Serializable {

  private Integer id;
  private ExpedienteInside expedienteInside;
  private ExpedienteInsideIndiceCarpetaIndizada expedienteInsideIndiceCarpetaIndizada;
  private ExpedienteInsideIndice expedienteInsideIndice;
  private String identificadorExpediente;
  private Date fechaIndiceElectronico;
  private Integer orden;
  private Date createdAt;
  private Set<ExpedienteInsideIndice> expedienteInsideIndices =
      new HashSet<ExpedienteInsideIndice>(0);
  private Set<ExpedienteInside> expedienteInsides = new HashSet<ExpedienteInside>(0);
  private Set<ExpedienteInsideIndiceDocumentoIndizado> expedienteInsideIndiceDocumentoIndizados =
      new HashSet<ExpedienteInsideIndiceDocumentoIndizado>(0);
  private Set<ExpedienteInsideIndiceCarpetaIndizada> expedienteInsideIndiceCarpetaIndizadas =
      new HashSet<ExpedienteInsideIndiceCarpetaIndizada>(0);

  public ExpedienteInsideIndice() {}

  public ExpedienteInsideIndice(Date createdAt) {
    this.createdAt = createdAt;
  }

  public ExpedienteInsideIndice(ExpedienteInside expedienteInside,
      ExpedienteInsideIndiceCarpetaIndizada expedienteInsideIndiceCarpetaIndizada,
      ExpedienteInsideIndice expedienteInsideIndice, String identificadorExpediente,
      Date fechaIndiceElectronico, Integer orden, Date createdAt,
      Set<ExpedienteInsideIndice> expedienteInsideIndices, Set<ExpedienteInside> expedienteInsides,
      Set<ExpedienteInsideIndiceDocumentoIndizado> expedienteInsideIndiceDocumentoIndizados,
      Set<ExpedienteInsideIndiceCarpetaIndizada> expedienteInsideIndiceCarpetaIndizadas) {
    this.expedienteInside = expedienteInside;
    this.expedienteInsideIndiceCarpetaIndizada = expedienteInsideIndiceCarpetaIndizada;
    this.expedienteInsideIndice = expedienteInsideIndice;
    this.identificadorExpediente = identificadorExpediente;
    this.fechaIndiceElectronico = fechaIndiceElectronico;
    this.orden = orden;
    this.createdAt = createdAt;
    this.expedienteInsideIndices = expedienteInsideIndices;
    this.expedienteInsides = expedienteInsides;
    this.expedienteInsideIndiceDocumentoIndizados = expedienteInsideIndiceDocumentoIndizados;
    this.expedienteInsideIndiceCarpetaIndizadas = expedienteInsideIndiceCarpetaIndizadas;
  }

  @Id
  // @GeneratedValue(strategy = IDENTITY)
  @TableGenerator(name = "GeneradorPk_ExpedienteInsideIndice", table = "GeneradorClaves",
      pkColumnName = "GenName", valueColumnName = "GenValue",
      pkColumnValue = "GEN_ExpedienteInsideIndice", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "GeneradorPk_ExpedienteInsideIndice")
  @Column(name = "id", unique = true, nullable = false)
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_expediente_vinculado")
  public ExpedienteInside getExpedienteInside() {
    return this.expedienteInside;
  }

  public void setExpedienteInside(ExpedienteInside expedienteInside) {
    this.expedienteInside = expedienteInside;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_carpeta_indizada")
  public ExpedienteInsideIndiceCarpetaIndizada getExpedienteInsideIndiceCarpetaIndizada() {
    return this.expedienteInsideIndiceCarpetaIndizada;
  }

  public void setExpedienteInsideIndiceCarpetaIndizada(
      ExpedienteInsideIndiceCarpetaIndizada expedienteInsideIndiceCarpetaIndizada) {
    this.expedienteInsideIndiceCarpetaIndizada = expedienteInsideIndiceCarpetaIndizada;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_expediente_indizado")
  public ExpedienteInsideIndice getExpedienteInsideIndice() {
    return this.expedienteInsideIndice;
  }

  public void setExpedienteInsideIndice(ExpedienteInsideIndice expedienteInsideIndice) {
    this.expedienteInsideIndice = expedienteInsideIndice;
  }

  @Column(name = "identificador_expediente")
  public String getIdentificadorExpediente() {
    return this.identificadorExpediente;
  }

  public void setIdentificadorExpediente(String identificadorExpediente) {
    this.identificadorExpediente = identificadorExpediente;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "fecha_indice_electronico", length = 19)
  public Date getFechaIndiceElectronico() {
    return this.fechaIndiceElectronico;
  }

  public void setFechaIndiceElectronico(Date fechaIndiceElectronico) {
    this.fechaIndiceElectronico = fechaIndiceElectronico;
  }

  @Column(name = "orden")
  public Integer getOrden() {
    return this.orden;
  }

  public void setOrden(Integer orden) {
    this.orden = orden;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at", nullable = false, length = 19)
  public Date getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "expedienteInsideIndice")
  public Set<ExpedienteInsideIndice> getExpedienteInsideIndices() {
    return this.expedienteInsideIndices;
  }

  public void setExpedienteInsideIndices(Set<ExpedienteInsideIndice> expedienteInsideIndices) {
    this.expedienteInsideIndices = expedienteInsideIndices;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "expedienteInsideIndice")
  public Set<ExpedienteInside> getExpedienteInsides() {
    return this.expedienteInsides;
  }

  public void setExpedienteInsides(Set<ExpedienteInside> expedienteInsides) {
    this.expedienteInsides = expedienteInsides;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "expedienteInsideIndice")
  public Set<ExpedienteInsideIndiceDocumentoIndizado> getExpedienteInsideIndiceDocumentoIndizados() {
    return this.expedienteInsideIndiceDocumentoIndizados;
  }

  public void setExpedienteInsideIndiceDocumentoIndizados(
      Set<ExpedienteInsideIndiceDocumentoIndizado> expedienteInsideIndiceDocumentoIndizados) {
    this.expedienteInsideIndiceDocumentoIndizados = expedienteInsideIndiceDocumentoIndizados;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "expedienteInsideIndice")
  public Set<ExpedienteInsideIndiceCarpetaIndizada> getExpedienteInsideIndiceCarpetaIndizadas() {
    return this.expedienteInsideIndiceCarpetaIndizadas;
  }

  public void setExpedienteInsideIndiceCarpetaIndizadas(
      Set<ExpedienteInsideIndiceCarpetaIndizada> expedienteInsideIndiceCarpetaIndizadas) {
    this.expedienteInsideIndiceCarpetaIndizadas = expedienteInsideIndiceCarpetaIndizadas;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer("Entity ExpedienteInsideIndice=[");
    String coma = ", ";

    sb.append("id=" + id + coma);

    sb.append("identificadorExpediente=" + identificadorExpediente + coma);
    sb.append(
        "fechaIndiceElectronico=" + InsideUtils.dateToStringISO8601(fechaIndiceElectronico) + coma);
    sb.append("orden=" + orden + coma);
    sb.append("createdAt=" + InsideUtils.dateToStringISO8601(createdAt) + coma);

    if (expedienteInsides == null) {
      sb.append("expedienteInsides=null" + coma);
    } else {
      sb.append("expedienteInsides=<");
      for (ExpedienteInside expedienteInside : expedienteInsides) {
        sb.append(expedienteInside.toString() + coma);
      }
      sb.append(">");
    }


    if (expedienteInsideIndices == null) {
      sb.append("expedienteInsideIndices=null" + coma);
    } else {
      sb.append("expedienteInsideIndices=<");
      for (ExpedienteInsideIndice expedienteInsideIndice : expedienteInsideIndices) {
        sb.append(expedienteInsideIndice.toString() + coma);
      }
      sb.append(">");
    }

    if (expedienteInsideIndiceDocumentoIndizados == null) {
      sb.append("expedienteInsideIndiceDocumentoIndizados=null" + coma);
    } else {
      sb.append("expedienteInsideIndiceDocumentoIndizados=<");
      for (ExpedienteInsideIndiceDocumentoIndizado expedienteInsideIndiceDocumentoIndizado : expedienteInsideIndiceDocumentoIndizados) {
        sb.append(expedienteInsideIndiceDocumentoIndizado.toString() + coma);
      }
      sb.append(">");
    }

    if (expedienteInsideIndiceCarpetaIndizadas == null) {
      sb.append("expedienteInsideIndiceCarpetaIndizadas=null" + coma);
    } else {
      sb.append("expedienteInsideIndiceCarpetaIndizadas=<");
      for (ExpedienteInsideIndiceCarpetaIndizada expedienteInsideIndiceCarpetaIndizada : expedienteInsideIndiceCarpetaIndizadas) {
        sb.append(expedienteInsideIndiceCarpetaIndizada.toString() + coma);
      }
      sb.append(">");
    }

    sb.append("]");
    return sb.toString();

  }

}