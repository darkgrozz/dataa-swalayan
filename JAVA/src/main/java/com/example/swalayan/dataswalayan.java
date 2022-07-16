package com.example.swalayan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class dataswalayan {

    private Long id;

    private String nama_barang;

    private String jumlah_tersedia;

    private BigInteger expired_barang;

    protected dataswalayan(){

        @Id
        @GeneratedValue(Strategy = GenerationType.IDENTITY)
        public Long getId() {
            return id;
        }

        public void setId(Long id) {this.id =id;
    }

    public String getNama_Barang(){
            return nama_barang;
        }

       public void setNma_Barang(String nama_barang) {
            this.nama_barang = nama_barang;
        }
        public String getJumlah_Tersedia(){
            return jumlah_tersedia;

        }
        public void setJumlah_Tersedia(String jumlah_tersedia) {
            this.jumlah_tersedia = jumlah_tersedia;
        }
        public String getExpired_Barang(){
            return expired_barang;
        }
        public void setExpired_barang(BigInteger expired_barang){
            this.expired_barang = expired_barang;
        }

}
