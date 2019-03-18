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
@Table(name = "userType")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "UserType.findAll", query = "SELECT u FROM UserType u")
    , @NamedQuery(name = "UserType.findByIdUserType", query = "SELECT u FROM UserType u WHERE u.idUserType = :idUserType")
    , @NamedQuery(name = "UserType.findByUserTypeName", query = "SELECT u FROM UserType u WHERE u.userTypeName = :userTypeName")
})
public class UserType implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUserType")
    private Integer idUserType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "userTypeName")
    private String userTypeName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "userTypeDescription")
    private String userTypeDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUserType")
    private Collection<User> userCollection;

    public UserType()
    {
    }

    public UserType(Integer idUserType)
    {
        this.idUserType = idUserType;
    }

    public UserType(Integer idUserType, String userTypeName, String userTypeDescription)
    {
        this.idUserType = idUserType;
        this.userTypeName = userTypeName;
        this.userTypeDescription = userTypeDescription;
    }

    public Integer getIdUserType()
    {
        return idUserType;
    }

    public void setIdUserType(Integer idUserType)
    {
        this.idUserType = idUserType;
    }

    public String getUserTypeName()
    {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName)
    {
        this.userTypeName = userTypeName;
    }

    public String getUserTypeDescription()
    {
        return userTypeDescription;
    }

    public void setUserTypeDescription(String userTypeDescription)
    {
        this.userTypeDescription = userTypeDescription;
    }

    @XmlTransient
    public Collection<User> getUserCollection()
    {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection)
    {
        this.userCollection = userCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idUserType != null ? idUserType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserType))
        {
            return false;
        }
        UserType other = (UserType) object;
        if ((this.idUserType == null && other.idUserType != null) || (this.idUserType != null && !this.idUserType.equals(other.idUserType)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.metCityRE.UserType[ idUserType=" + idUserType + " ]";
    }
    
}
