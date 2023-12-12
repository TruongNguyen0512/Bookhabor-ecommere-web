package models;

public class anhSanPham {
    private String idanh;
    private String tensanpham;
    private byte[] anh1;
    private byte[] anh2;
    private byte[] anh3;

    public anhSanPham() {
        // Constructor mặc định
    }
    
    
    public anhSanPham(String idanh, String tensanpham, byte[] anh1, byte[] anh2, byte[] anh3) {
		super();
		this.idanh = idanh;
		this.tensanpham = tensanpham;
		this.anh1 = anh1;
		this.anh2 = anh2;
		this.anh3 = anh3;
	}


	// Getters và setters cho các trường dữ liệu

    public String getIdanh() {
        return idanh;
    }

    public void setIdanh(String idanh) {
        this.idanh = idanh;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public byte[] getAnh1() {
        return anh1;
    }

    public void setAnh1(byte[] anh1) {
        this.anh1 = anh1;
    }

    public byte[] getAnh2() {
        return anh2;
    }

    public void setAnh2(byte[] anh2) {
        this.anh2 = anh2;
    }

    public byte[] getAnh3() {
        return anh3;
    }

    public void setAnh3(byte[] anh3) {
        this.anh3 = anh3;
    }
}
