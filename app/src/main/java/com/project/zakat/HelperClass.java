package com.project.zakat;

public class HelperClass {

    String noKK, noKTP, noTel, nama, alamat, email, password, conpassword;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public HelperClass(String noKK, String noKTP, String noTel, String nama, String alamat, String email, String password, String conpassword) {
        this.noKK = noKK;
        this.noKTP = noKTP;
        this.noTel = noTel;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.password = password;
        this.conpassword = conpassword;
    }

    public HelperClass() {
    }

}