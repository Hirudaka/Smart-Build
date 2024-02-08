package com.example.procurement_managerapi.controller;

import com.example.procurement_managerapi.model.Site;
import com.example.procurement_managerapi.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class SiteController {
    @Autowired
    private final SiteService siteService;

    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }
    //create function
    @PostMapping("/sites")
    public Site createSite(@RequestBody Site site){
        return siteService.createSite(site);
    }
    //get all function
    @GetMapping("/sites")
    public List<Site> getAllSites(){
        return siteService.getAllSites();
    }
    //get one function
    @GetMapping("/sites/{Id}")
    public Site getSiteById(@PathVariable Long Id){
        return siteService.getSiteById(Id);
    }
    //edit function
    @PutMapping("/sites/{id}")
    public ResponseEntity<Site> updateSite(@PathVariable Long id,
                                           @RequestBody Site site){
        site = siteService.updateSite(id, site);
        return ResponseEntity.ok(site);
    }
    //delete function
    @DeleteMapping("/sites/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteSite(@PathVariable Long id){
        boolean deleted = false;
        deleted= siteService.deleteSite(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",deleted);
        return ResponseEntity.ok(response);
    }
}
