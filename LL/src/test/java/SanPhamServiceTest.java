import com.example.LL.model.SanPham;
import com.example.LL.service.SanPhamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SanPhamServiceTest {
    private SanPhamService sanPhamService;


    @BeforeEach
    public void setup() {
        sanPhamService = new SanPhamService();
        sanPhamService.ThemSP(new SanPham("SP1", "may tinh", 2, 35, 8, "dien tu"));
    }



    @Test
    void testkiemTraTonTai() {
        SanPham sp = new SanPham("SP004", "Điện thoại", 1, 500.0f, 5, "Điện tử");
        sanPhamService.ThemSP(sp);
        assertTrue(sanPhamService.kiemTraMaTonTai("SP004"));
        assertFalse(sanPhamService.kiemTraMaTonTai("SP999"));
    }

    @Test
    public  void TestSuaSP(){
        boolean ketQua=sanPhamService.Update("SP1", "tivi", 2, 35,"dien");
        assertTrue(ketQua,"cap nhat that bai");
//        SanPham sp= sanPhamService.getListSanPham().get(0);
//        assertEquals("tivi",sp.getTen(),"ten san pham khong ton tai");
//        assertEquals(2,sp.getGia(),"gia san pham khong ton tai");
//        assertEquals(35,sp.getSoLuong(),"gia san pham khong ton tai");
//        assertEquals("dien",sp.getDanhMuc(),"danh mu khong ton tai");
//        System.out.println("Sản phẩm mới cập nhật là:");
//        sanPhamService.getListSanPham().forEach(sanPham ->
//                System.out.println(sanPham.getMa()+" - "+sanPham.getTen()+" - "+sanPham.getGia()+" - "+sanPham.getSoLuong()+" - "+sanPham.getDanhMuc())
//        );

    }
    @Test
    public  void TenSanPham(){
        boolean ketQua=sanPhamService.Update("SP1", "tivi", 2, 35,"dien");
        assertTrue(ketQua,"cap nhat that bai");
        SanPham sp= sanPhamService.getListSanPham().get(0);
        assertEquals("tivi",sp.getTen(),"ten san pham khong ton tai");
    }
    @Test
    public  void GiaSanPham(){
        boolean ketQua=sanPhamService.Update("SP1", "tivi", 2, 35,"dien");
        assertTrue(ketQua,"cap nhat that bai");
        SanPham sp= sanPhamService.getListSanPham().get(0);
        assertEquals(2,sp.getGia(),"gia san pham khong ton tai");
    }
    @Test
    public  void SoLuongSanPham(){
        boolean ketQua=sanPhamService.Update("SP1", "tivi", 2, 35,"dien");
        assertTrue(ketQua,"cap nhat that bai");
        SanPham sp= sanPhamService.getListSanPham().get(0);
        assertEquals(35,sp.getSoLuong(),"gia san pham khong ton tai");
    }
    @Test
    public  void DanhMucSanPham(){
        boolean ketQua=sanPhamService.Update("SP1", "tivi", 2, 35,"dien");
        assertTrue(ketQua,"cap nhat that bai");
        SanPham sp= sanPhamService.getListSanPham().get(0);
        assertEquals("dien",sp.getDanhMuc(),"danh mu khong ton tai");
    }



}

