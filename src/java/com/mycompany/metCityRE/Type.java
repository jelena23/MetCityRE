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
@Table(name = "type")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Type.findAll", query = "SELECT t FROM Type t")
    , @NamedQuery(name = "Type.findByIdType", query = "SELECT t FROM Type t WHERE t.idType = :idType")
    , @NamedQuery(name = "Type.findByTypeName", query = "SELECT t FROM Type t WHERE t.typeName = :typeName")
})
public class Type implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idType")
    private Integer idType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "typeName")
    private String typeName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idType")
    private Collection<RealEstate> realEstateCollection;

    public Type()
    {
    }

    public Type(Integer idType)
    {
        this.idType = idType;
    }

    public Type(Integer idType, String typeName)
    {
        this.idType = idType;
        this.typeName = typeName;
    }

    public Integer getIdType()
    {
        return idType;
    }

    public void setIdType(Integer idType)
    {
        this.idType = idType;
    }

    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
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
        hash += (idType != null ? idType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Type))
        {
            return false;
        }
        Type other = (Type) object;
        if ((this.idType == null && other.idType != null) || (this.idType != null && !this.idType.equals(other.idType)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.Type[ idType=" + idType + " ]";
    }
    
}
