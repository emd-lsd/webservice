package com.site.webservice.models;

import javax.persistence.*;

@Entity
@Table(name = "promp")
public class Promp {


    @Id
    private Long id;
    @Column(name = "OKVED_Description")
    private String OKVEDD;

    @Column(name = "District")
    private String district;

    @Column(name = "Address")
    private String address;

    @Column(name = "FullName")
    private String fullname;

    @Column(name = "Shortname")
    private String shortname;

    @Column(name = "AdmArea")
    private String admarea;

    @Column(name = "geodata")
    private String geodata;

    private String global_id, INN, OKPO, Category, Specialization, OKVED, geodata_center, geoarea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGlobal_id() {
        return global_id;
    }

    public void setGlobal_id(String global_id) {
        this.global_id = global_id;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getOKPO() {
        return OKPO;
    }

    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    public String getAdmArea() {
        return admarea;
    }

    public void setAdmArea(String admarea) {
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

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getOKVED() {
        return OKVED;
    }

    public void setOKVED(String OKVED) {
        this.OKVED = OKVED;
    }

    public String getOKVED_Description() {
        return OKVEDD;
    }

    public void setOKVED_Description(String OKVED_Description) {
        this.OKVEDD = OKVEDD;
    }

    public String getGeodata() {
        return geodata;
    }

    public void setGeodata(String geodata) {
        this.geodata = geodata;
    }

    public String getGeodata_center() {
        return geodata_center;
    }

    public void setGeodata_center(String geodata_center) {
        this.geodata_center = geodata_center;
    }

    public String getGeoarea() {
        return geoarea;
    }

    public void setGeoarea(String geoarea) {
        this.geoarea = geoarea;
    }
}
