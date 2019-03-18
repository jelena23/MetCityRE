/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metCityRE;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jelena
 */
@Entity
@Table(name = "realEstateType")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "RealEstateType.findAll", query = "SELECT r FROM RealEstateType r")
    , @NamedQuery(name = "RealEstateType.findByIdRealEstateType", query = "SELECT r FROM RealEstateType r WHERE r.idRealEstateType = :idRealEstateType")
    , @NamedQuery(name = "RealEstateType.findByRealEstateTypeName", query = "SELECT r FROM RealEstateType r WHERE r.realEstateTypeName = :realEstateTypeName")
})
public class RealEstateType implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRealEstateType")
    private Integer idRealEstateType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "realEstateTypeName")
    private String realEstateTypeName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "realEstateTypeDescription")
    private String realEstateTypeDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRealEstateType")
    private Collection<RealEstate> realEstateCollection;

    public RealEstateType()
    {
    }

    public RealEstateType(Integer idRealEstateType)
    {
        this.idRealEstateType = idRealEstateType;
    }

    public RealEstateType(Integer idRealEstateType, String realEstateTypeName, String realEstateTypeDescription)
    {
        this.idRealEstateType = idRealEstateType;
        this.realEstateTypeName = realEstateTypeName;
        this.realEstateTypeDescription = realEstateTypeDescription;
    }

    public Integer getIdRealEstateType()
    {
        return idRealEstateType;
    }

    public void setIdRealEstateType(Integer idRealEstateType)
    {
        this.idRealEstateType = idRealEstateType;
    }

    public String getRealEstateTypeName()
    {
        return realEstateTypeName;
    }

    public void setRealEstateTypeName(String realEstateTypeName)
    {
        this.realEstateTypeName = realEstateTypeName;
    }

    public String getRealEstateTypeDescription()
    {
        return realEstateTypeDescription;
    }

    public void setRealEstateTypeDescription(String realEstateTypeDescription)
    {
        this.realEstateTypeDescription = realEstateTypeDescription;
    }

    @XmlTransient
    public Collection<RealEstate> getRealEstateCollection()
    {
        return realEstateCollection;
    }

    public void setRealEstateCollection(Collection<RealEstate> realEstateCollection)
    {
        this.realEstateCollection = realEstateCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idRealEstateType != null ? idRealEstateType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RealEstateType))
        {
            return false;
        }
        RealEstateType other = (RealEstateType) object;
        if ((this.idRealEstateType == null && other.idRealEstateType != null) || (this.idRealEstateType != null && !this.idRealEstateType.equals(other.idRealEstateType)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.RealEstateType[ idRealEstateType=" + idRealEstateType + " ]";
    }
    
}
