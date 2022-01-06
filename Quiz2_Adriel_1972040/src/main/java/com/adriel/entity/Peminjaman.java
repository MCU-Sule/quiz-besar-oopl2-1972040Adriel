package com.adriel.entity;

import java.util.Date;
/**
 * Adriel Rianson 1972040
 */
public class Peminjaman {
    private int id;
    private Date tanggalPinjam;
    private Date tanggalPengembalian;
    private int Buku_id;
    private int Anggota_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public int getBuku_id() {
        return Buku_id;
    }

    public void setBuku_id(int buku_id) {
        Buku_id = buku_id;
    }

    public int getAnggota_id() {
        return Anggota_id;
    }

    public void setAnggota_id(int anggota_id) {
        Anggota_id = anggota_id;
    }
}
