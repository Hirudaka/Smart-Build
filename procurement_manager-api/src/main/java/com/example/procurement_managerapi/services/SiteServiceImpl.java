package com.example.procurement_managerapi.services;

import com.example.procurement_managerapi.entity.SiteEntity;
import com.example.procurement_managerapi.model.Site;
import com.example.procurement_managerapi.repository.SiteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SiteServiceImpl implements SiteService{
    private SiteRepository siteRepository;

    public SiteServiceImpl(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }
    @Override
    public Site createSite(Site site) {
        SiteEntity siteEntity = new SiteEntity();
        BeanUtils.copyProperties(site,siteEntity);
        siteRepository.save(siteEntity);
        return site;
    }
    @Override
    public List<Site> getAllSites() {
        List<SiteEntity> siteEntities
                = siteRepository.findAll();

        List<Site> sites = siteEntities
                .stream().map(sit -> new Site(
                        sit.getId(),
                        sit.getSiteName(),
                        sit.getAddress(),
                        sit.getPhone(),
                        sit.getBudget(),
                        sit.getStatus(),
                        sit.getSiteManager()
                ))
                .collect(Collectors.toList());
        return sites;
    }
    @Override
    public Site getSiteById(Long Id) {
        Optional<SiteEntity> siteEntity = siteRepository.findById(Id);
        if (siteEntity.isPresent()) {
            SiteEntity site = siteEntity.get();
            return new Site(
                    site.getId(),
                    site.getSiteName(),
                    site.getAddress(),
                    site.getPhone(),
                    site.getBudget(),
                    site.getStatus(),
                    site.getSiteManager()
            );
        }
        return null;
    }
    @Override
    public Site updateSite(Long id, Site site) {
        SiteEntity siteEntity = siteRepository.findById(id).get();
        siteEntity.setSiteName(site.getSiteName());
        siteEntity.setAddress(site.getAddress());
        siteEntity.setPhone(site.getPhone());
        siteEntity.setBudget(site.getBudget());
        siteEntity.setStatus(site.getStatus());
        siteEntity.setSiteManager(site.getSiteManager());
        siteRepository.save(siteEntity);
        return site;
    }

    @Override
    public boolean deleteSite(Long id) {
        SiteEntity site = siteRepository.findById(id).get();
        siteRepository.delete(site);
        return true;
    }

}
