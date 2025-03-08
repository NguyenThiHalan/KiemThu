package com.example.LL.service;

import com.example.LL.model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham>danhSachSanPham= new ArrayList<>();

    public List<SanPham>getListSanPham(){
        return danhSachSanPham;
    }

    public void ThemSP(SanPham sp){
        danhSachSanPham.add(sp);
    }


    public  boolean kiemTraMaTonTai(String ma){
        return  danhSachSanPham.stream().anyMatch(sp ->sp.getMa().equals(ma));
    }
    public boolean Update(String ma,String ten,float giaMoi,int soLuongMoi,String danhMucMoi){
        if(ma==null||ma.trim().isEmpty()   || ten==null||ten.trim().isEmpty() || giaMoi <=0 ||soLuongMoi <=0|| danhMucMoi==null||danhMucMoi.trim().isEmpty()){
            return  false;
        }
        for(SanPham sp:danhSachSanPham){
            if(sp.getMa().equals(ma)){
                sp.setTen(ten);
                sp.setGia(giaMoi);
                sp.setSoLuong(soLuongMoi);
                sp.setDanhMuc(danhMucMoi);
                return  true;
            }
        }
        return false;
    }
}
