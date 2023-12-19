package com.example.procurement_managerapi.services;


import com.example.procurement_managerapi.model.Site;

import java.util.List;

public interface SiteService {
    Site createSite(Site site);


    List<Site> getAllSites();

    Site getSiteById(Long id);

    Site updateSite(Long id, Site site);

    boolean deleteSite(Long id);
}
