package com.mycompany.metCityRE;

import com.mycompany.metCityRE.RealEstate;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(Type.class)
public class Type_ { 

    public static volatile SingularAttribute<Type, Integer> idType;
    public static volatile SingularAttribute<Type, String> typeName;
    public static volatile CollectionAttribute<Type, RealEstate> realEstateCollection;

}