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
@Table(name = "country")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c")
    , @NamedQuery(name = "Country.findByIdCountry", query = "SELECT c FROM Country c WHERE c.idCountry = :idCountry")
    , @NamedQuery(name = "Country.findByCountryName", query = "SELECT c FROM Country c WHERE c.countryName = :countryName")
})
public class Country implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCountry")
    private Integer idCountry;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "countryName")
    private String countryName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCountry")
    private Collection<City> cityCollection;

    public Country()
    {
    }

    public Country(Integer idCountry)
    {
        this.idCountry = idCountry;
    }

    public Country(Integer idCountry, String countryName)
    {
        this.idCountry = idCountry;
        this.countryName = countryName;
    }

    public Integer getIdCountry()
    {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry)
    {
        this.idCountry = idCountry;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    @XmlTransient
    public Collection<City> getCityCollection()
    {
        return cityCollection;
    }

    public void setCityCollection(Collection<City> cityCollection)
    {
        this.cityCollection = cityCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idCountry != null ? idCountry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Country))
        {
            return false;
        }
        Country other = (Country) object;
        if ((this.idCountry == null && other.idCountry != null) || (this.idCountry != null && !this.idCountry.equals(other.idCountry)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.Country[ idCountry=" + idCountry + " ]";
    }
    
}
