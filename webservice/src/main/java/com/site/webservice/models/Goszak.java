package com.site.webservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goszak")
public class Goszak {

    @Id
    private Long id;

    @Column(name = "locid")
    private String locid;

    @Column(name = "Name")
    private String name;

    @Column(name = "MDOB")
    private String mdob;

    @Column(name = "Legaladdress")
    private String legaladdress;

    @Column(name = "OKOPF")
    private String okopf;

    @Column(name = "INN")
    private String inn;

    @Column(name = "KPP")
    private String kpp;

    @Column(name = "OGRN")
    private String ogrn;

    @Column(name = "Publicphone")
    private String publicphone;

    @Column(name = "Email")
    private String email;

    @Column(name = "global_id")
    private String globalid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocid() {
        return locid;
    }

    public void setLocid(String locid) {
        this.locid = locid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMdob() {
        return mdob;
    }

    public void setMdob(String mdob) {
        this.mdob = mdob;
    }

    public String getLegaladdress() {
        return legaladdress;
    }

    public void setLegaladdress(String legaladdress) {
        this.legaladdress = legaladdress;
    }

    public String getOkopf() {
        return okopf;
    }

    public void setOkopf(String okopf) {
        this.okopf = okopf;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getPublicphone() {
        return publicphone;
    }

    public void setPublicphone(String publicphone) {
        this.publicphone = publicphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGlobalid() {
        return globalid;
    }

    public void setGlobalid(String globalid) {
        this.globalid = globalid;
    }
}
