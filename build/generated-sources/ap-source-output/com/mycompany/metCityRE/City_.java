package com.mycompany.metCityRE;

import com.mycompany.metCityRE.Country;
import com.mycompany.metCityRE.Municipality;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> cityName;
    public static volatile CollectionAttribute<City, Municipality> municipalityCollection;
    public static volatile SingularAttribute<City, Integer> idCity;
    public static volatile SingularAttribute<City, Country> idCountry;

}