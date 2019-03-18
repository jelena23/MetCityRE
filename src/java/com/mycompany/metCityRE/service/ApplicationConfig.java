/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metCityRE.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author jelena
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application
{

    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources)
    {
        resources.add(com.mycompany.metCityRE.CrossOriginResourceSharingFilter.class);
        resources.add(com.mycompany.metCityRE.NewCrossOriginResourceSharingFilter.class);
        resources.add(com.mycompany.metCityRE.service.CityFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.CountryFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.MunicipalityFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.RealEstateFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.RealEstateTypeFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.RentalAgreementFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.SalesAgreementFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.TypeFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.UserFacadeREST.class);
        resources.add(com.mycompany.metCityRE.service.UserTypeFacadeREST.class);
    }
    
}
