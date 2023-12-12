//co sua
package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.anhSanPham;
import models.TheLoai;

public class anhSanPhamDAO implements DAOInterface<anhSanPham> {

	 @Override
	    public ArrayList<anhSanPham> selectAll() {
	        // Implement phương thức selectAll() để lấy tất cả các dòng từ bảng imgsp
	        ArrayList<anhSanPham> anhSanPhams = new ArrayList<>();
	        try { 
	        	// Bước 1: tạo kết nối đến CSDL
				Connection con = JDBCUtil.getConnection();
                //  Bước 2 : 
	            String query = "SELECT * FROM imgsp";
	            PreparedStatement ps = con.prepareStatement(query);
	         // Bước 3: thực thi câu lệnh SQL
				System.out.println(query);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                anhSanPham anhSanPham = new anhSanPham();
	                // Đọc dữ liệu từ ResultSet và thiết lập các thuộc tính của đối tượng AnhSanPham
	                anhSanPham.setIdanh(rs.getString("idanh"));
	                anhSanPham.setTensanpham(rs.getString("tensanpham"));
	                anhSanPham.setAnh1(rs.getBytes("anh1"));
	                anhSanPham.setAnh2(rs.getBytes("anh2"));
	                anhSanPham.setAnh3(rs.getBytes("anh3"));
	                // Thêm đối tượng AnhSanPham vào ArrayList
	                anhSanPhams.add(anhSanPham);
	            }
	        	JDBCUtil.closeConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return anhSanPhams;
	    }

	    // Implement các phương thức khác tương tự như selectAll() tương ứng với các thao tác CRUD

	    @Override
	    public int insert(anhSanPham t) {
	        // Implement phương thức insert() để chèn dữ liệu vào bảng imgsp
	        int result = 0;
	        try {
	        	// Bước 1: tạo kết nối đến CSDL
				Connection con = JDBCUtil.getConnection();
                //  Bước 2 : 
			 String query = "INSERT INTO imgsp (idanh, tensanpham, anh1, anh2, anh3) VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(query);
	         // Bước 3: thực thi câu lệnh SQL
			
	            //Bước 4  :
	            // Thiết lập các giá trị cho câu lệnh truy vấn
	            ps.setString(1, t.getIdanh());
	            ps.setString(2, t.getTensanpham());
	            ps.setBytes(3, t.getAnh1());
	            ps.setBytes(4, t.getAnh2());
	            ps.setBytes(5, t.getAnh3());
	            // Thực thi câu lệnh truy vấn
	        	System.out.println(query);
	            result = ps.executeUpdate();
	            JDBCUtil.closeConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return result;
	    }
       
	    @Override
	    public anhSanPham selectById(anhSanPham t) {
	        // Implement phương thức selectById() để lấy một bản ghi từ bảng imgsp dựa trên idanh
	        anhSanPham anhSanPham = null;
	        try {
	        	Connection con = JDBCUtil.getConnection();
	            String query = "SELECT * FROM imgsp WHERE idanh = ?";
	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, t.getIdanh());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                anhSanPham = new anhSanPham();
	                // Đọc dữ liệu từ ResultSet và thiết lập các thuộc tính của đối tượng AnhSanPham
	                anhSanPham.setIdanh(rs.getString("idanh"));
	                anhSanPham.setTensanpham(rs.getString("tensanpham"));
	                anhSanPham.setAnh1(rs.getBytes("anh1"));
	                anhSanPham.setAnh2(rs.getBytes("anh2"));
	                anhSanPham.setAnh3(rs.getBytes("anh3"));
	            }
	            JDBCUtil.closeConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return anhSanPham;
	    }

		@Override
		public int insertAll(ArrayList<anhSanPham> arr) {
	        int result = 0;
	        for (anhSanPham anhSanPham : arr) {
	            result += insert(anhSanPham);
	        }
	        return result;

		}

		@Override
		public int delete(anhSanPham t) {
			int result = 0;
	        try {
	        	Connection con = JDBCUtil.getConnection();
	            String query = "DELETE FROM imgsp WHERE idanh = ?";
	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, t.getIdanh());
	            result = ps.executeUpdate(); 
	            
	            JDBCUtil.closeConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return result;
		}

		@Override
		public int deleteAll(ArrayList<anhSanPham> arr) {
			int result = 0;
	        for (anhSanPham anhSanPham : arr) {
	            result += delete(anhSanPham);
	        }
	        return result;
	    }
	

		@Override
		public int update(anhSanPham t) {
			int result = 0;
	        try {
	        	Connection con = JDBCUtil.getConnection();
	            String query = "UPDATE imgsp SET tensanpham = ?, anh1 = ?, anh2 = ?, anh3 = ? WHERE idanh = ?";
	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, t.getTensanpham());
	            ps.setBytes(2, t.getAnh1());
	            ps.setBytes(3, t.getAnh2());
	            ps.setBytes(4, t.getAnh3());
	            ps.setString(5, t.getIdanh());
	            result = ps.executeUpdate();
	            JDBCUtil.closeConnection(con);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return result;
		}
	    
	 
	    
}