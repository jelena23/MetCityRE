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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "realEstate")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "RealEstate.findAll", query = "SELECT r FROM RealEstate r")
    , @NamedQuery(name = "RealEstate.findByIdRealEstate", query = "SELECT r FROM RealEstate r WHERE r.idRealEstate = :idRealEstate")
    , @NamedQuery(name = "RealEstate.findByAddress", query = "SELECT r FROM RealEstate r WHERE r.address = :address")
    , @NamedQuery(name = "RealEstate.findByNumOfRooms", query = "SELECT r FROM RealEstate r WHERE r.numOfRooms = :numOfRooms")
    , @NamedQuery(name = "RealEstate.findByFloor", query = "SELECT r FROM RealEstate r WHERE r.floor = :floor")
    , @NamedQuery(name = "RealEstate.findBySize", query = "SELECT r FROM RealEstate r WHERE r.size = :size")
    , @NamedQuery(name = "RealEstate.findByCeilingHeight", query = "SELECT r FROM RealEstate r WHERE r.ceilingHeight = :ceilingHeight")
    , @NamedQuery(name = "RealEstate.findByNumOfBathrooms", query = "SELECT r FROM RealEstate r WHERE r.numOfBathrooms = :numOfBathrooms")
    , @NamedQuery(name = "RealEstate.findByHeating", query = "SELECT r FROM RealEstate r WHERE r.heating = :heating")
    , @NamedQuery(name = "RealEstate.findByPrice", query = "SELECT r FROM RealEstate r WHERE r.price = :price")
})
public class RealEstate implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRealEstate")
    private Integer idRealEstate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numOfRooms")
    private int numOfRooms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "floor")
    private int floor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "size")
    private double size;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ceilingHeight")
    private double ceilingHeight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numOfBathrooms")
    private int numOfBathrooms;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "heating")
    private String heating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private double price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRealEstate")
    private Collection<SalesAgreement> salesAgreementCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRealEstate")
    private Collection<RentalAgreement> rentalAgreementCollection;
    @JoinColumn(name = "idMunicipality", referencedColumnName = "idMunicipality")
    @ManyToOne(optional = false)
    private Municipality idMunicipality;
    @JoinColumn(name = "idRealEstateType", referencedColumnName = "idRealEstateType")
    @ManyToOne(optional = false)
    private RealEstateType idRealEstateType;
    @JoinColumn(name = "idType", referencedColumnName = "idType")
    @ManyToOne(optional = false)
    private Type idType;
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private User idUser;

    public RealEstate()
    {
    }

    public RealEstate(Integer idRealEstate)
    {
        this.idRealEstate = idRealEstate;
    }

    public RealEstate(Integer idRealEstate, String address, int numOfRooms, int floor, double size, double ceilingHeight, int numOfBathrooms, String heating, double price)
    {
        this.idRealEstate = idRealEstate;
        this.address = address;
        this.numOfRooms = numOfRooms;
        this.floor = floor;
        this.size = size;
        this.ceilingHeight = ceilingHeight;
        this.numOfBathrooms = numOfBathrooms;
        this.heating = heating;
        this.price = price;
    }

    public Integer getIdRealEstate()
    {
        return idRealEstate;
    }

    public void setIdRealEstate(Integer idRealEstate)
    {
        this.idRealEstate = idRealEstate;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getNumOfRooms()
    {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms)
    {
        this.numOfRooms = numOfRooms;
    }

    public int getFloor()
    {
        return floor;
    }

    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    public double getSize()
    {
        return size;
    }

    public void setSize(double size)
    {
        this.size = size;
    }

    public double getCeilingHeight()
    {
        return ceilingHeight;
    }

    public void setCeilingHeight(double ceilingHeight)
    {
        this.ceilingHeight = ceilingHeight;
    }

    public int getNumOfBathrooms()
    {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms)
    {
        this.numOfBathrooms = numOfBathrooms;
    }

    public String getHeating()
    {
        return heating;
    }

    public void setHeating(String heating)
    {
        this.heating = heating;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @XmlTransient
    public Collection<SalesAgreement> getSalesAgreementCollection()
    {
        return salesAgreementCollection;
    }

    public void setSalesAgreementCollection(Collection<SalesAgreement> salesAgreementCollection)
    {
        this.salesAgreementCollection = salesAgreementCollection;
    }

    @XmlTransient
    public Collection<RentalAgreement> getRentalAgreementCollection()
    {
        return rentalAgreementCollection;
    }

    public void setRentalAgreementCollection(Collection<RentalAgreement> rentalAgreementCollection)
    {
        this.rentalAgreementCollection = rentalAgreementCollection;
    }

    public Municipality getIdMunicipality()
    {
        return idMunicipality;
    }

    public void setIdMunicipality(Municipality idMunicipality)
    {
        this.idMunicipality = idMunicipality;
    }

    public RealEstateType getIdRealEstateType()
    {
        return idRealEstateType;
    }

    public void setIdRealEstateType(RealEstateType idRealEstateType)
    {
        this.idRealEstateType = idRealEstateType;
    }

    public Type getIdType()
    {
        return idType;
    }

    public void setIdType(Type idType)
    {
        this.idType = idType;
    }

    public User getIdUser()
    {
        return idUser;
    }

    public void setIdUser(User idUser)
    {
        this.idUser = idUser;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idRealEstate != null ? idRealEstate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RealEstate))
        {
            return false;
        }
        RealEstate other = (RealEstate) object;
        if ((this.idRealEstate == null && other.idRealEstate != null) || (this.idRealEstate != null && !this.idRealEstate.equals(other.idRealEstate)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.RealEstate[ idRealEstate=" + idRealEstate + " ]";
    }
    
}
