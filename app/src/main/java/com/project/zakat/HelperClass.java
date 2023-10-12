package com.project.zakat;

public class HelperClass {

    String noKK, noKTP, noTel, nama, alamat, username, password, conpassword;

    public String getNoKK() {
        return noKK;
    }

    public void setNoKK(String noKK) {
        this.noKK = noKK;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNoTel() {
        return noTel;
    }

    public void setNoTel(String noTel) {
        this.noTel = noTel;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConpassword() {
        return conpassword;
    }

    public void setConpassword(String conpassword) {
        this.conpassword = conpassword;
    }

    public HelperClass(String noKK, String noKTP, String noTel, String nama, String alamat, String username, String password, String conpassword) {
        this.noKK = noKK;
        this.noKTP = noKTP;
        this.noTel = noTel;
        this.nama = nama;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
        this.conpassword = conpassword;
    }

    public HelperClass() {
    }

}