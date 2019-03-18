package com.mycompany.metCityRE;

import com.mycompany.metCityRE.RealEstate;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-17T15:37:04")
@StaticMetamodel(RealEstateType.class)
public class RealEstateType_ { 

    public static volatile SingularAttribute<RealEstateType, String> realEstateTypeName;
    public static volatile SingularAttribute<RealEstateType, String> realEstateTypeDescription;
    public static volatile SingularAttribute<RealEstateType, Integer> idRealEstateType;
    public static volatile CollectionAttribute<RealEstateType, RealEstate> realEstateCollection;

}