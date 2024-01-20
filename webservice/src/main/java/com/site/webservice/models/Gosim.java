package com.site.webservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gosim")
public class Gosim {
    @Id
    private Long id;

    @Column(name = "Admarea")
    private String admarea;

    @Column(name = "District")
    private String district;

    @Column(name = "Address")
    private String address;

    @Column(name = "Propertytype")
    private String propertytype;

    @Column(name = "Objectarea")
    private String objectarea;

    @Column(name = "Note")
    private String note;

    @Column(name = "global_id")
    private String globalid;

    @Column(name = "geodata")
    private String geodata;

    @Column(name = "geodata_center")
    private String geoadata_center;

    @Column(name = "geoarea")
    private String geoarea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdmarea() {
        return admarea;
    }

    public void setAdmarea(String admarea) {
        this.admarea = admarea;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    public String getObjectarea() {
        return objectarea;
    }

    public void setObjectarea(String objectarea) {
        this.objectarea = objectarea;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getGlobalid() {
        return globalid;
    }

    public void setGlobalid(String globalid) {
        this.globalid = globalid;
    }

    public String getGeodata() {
        return geodata;
    }

    public void setGeodata(String geodata) {
        this.geodata = geodata;
    }

    public String getGeoadata_center() {
        return geoadata_center;
    }

    public void setGeoadata_center(String geoadata_center) {
        this.geoadata_center = geoadata_center;
    }

    public String getGeoarea() {
        return geoarea;
    }

    public void setGeoarea(String geoarea) {
        this.geoarea = geoarea;
    }
}
