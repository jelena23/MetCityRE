package com.mycompany.metCityRE;

import com.mycompany.metCityRE.City;
import com.mycompany.metCityRE.RealEstate;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(Municipality.class)
public class Municipality_ { 

    public static volatile SingularAttribute<Municipality, Integer> idMunicipality;
    public static volatile SingularAttribute<Municipality, City> idCity;
    public static volatile CollectionAttribute<Municipality, RealEstate> realEstateCollection;
    public static volatile SingularAttribute<Municipality, String> municipalityName;

}