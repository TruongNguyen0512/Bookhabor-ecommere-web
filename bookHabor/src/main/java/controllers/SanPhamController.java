package controllers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;  
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Random;

import database.KhachHangDAO;
import database.SanPhamDAO;
import database.anhSanPhamDAO;
import models.KhachHang;
import models.SanPham;
import models.TheLoai;
import models.anhSanPham;
import util.MaHoa;
import javax.servlet.annotation.MultipartConfig;
/**
 * Servlet implementation class SanPhamController
 */
@WebServlet(name = "San-Pham", urlPatterns = { "/San-Pham" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10,      // 10MB
maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class SanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SanPhamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String act = request.getParameter("act")+"";
		if (act.equals("them-san-pham")) {
			themSanPham(request, response);
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
     
	
	
	// Thêm sản phẩm   
		  private void themSanPham(HttpServletRequest request, HttpServletResponse response) {
				
			    
				try {
					String tenSanPham = request.getParameter("tenSanPham");
					String moTa = request.getParameter("moTa");
					String theLoaiString = request.getParameter("category");  
					String giaBanString =  request.getParameter("giaBan");
					String soLuongString =  request.getParameter("soLuong") ;   
					// set Attribute 
					request.setAttribute("tenSanPham", tenSanPham);
					request.setAttribute("moTa", moTa);
					request.setAttribute("theLoai", theLoaiString);
					request.setAttribute("giaBanString",giaBanString);
					request.setAttribute("soLuong", soLuongString);
					
					// Xử lý dữ liệu ảnh   
					
					// Lấy dữ liệu file ảnh từ request
			       Part filePart1 = request.getPart("fileInput1");
			       Part filePart2 = request.getPart("fileInput2");
			       Part filePart3 = request.getPart("fileInput3");
			       
			       
			       String fileName1 = Paths.get(filePart1.getSubmittedFileName()).getFileName().toString(); // Lấy tên file
			       InputStream fileContent1 = filePart1.getInputStream(); // Lấy dữ liệu ảnh (InputStream)
                   
			       String fileName2 = Paths.get(filePart2.getSubmittedFileName()).getFileName().toString(); // Lấy tên file
			       InputStream fileContent2 = filePart2.getInputStream(); // Lấy dữ liệu ảnh (InputStream)
			       
			       String fileName3 = Paths.get(filePart3.getSubmittedFileName()).getFileName().toString(); // Lấy tên file
			       InputStream fileContent3 = filePart3.getInputStream(); // Lấy dữ liệu ảnh (InputStream)
			       
			       // Set Attribute cho ảnh 
			       request.setAttribute("fileContent1", fileContent1);
			       request.setAttribute("fileName1", fileName1);
			       
			       request.setAttribute("fileContent2", fileContent2);
			       request.setAttribute("fileName2", fileName2);
			         
			       request.setAttribute("fileContent3", fileContent3);
			       request.setAttribute("fileName3", fileName3);
			         
			        // Báo Lỗi  
			       

					String url = "";

					String baoLoi = "";
					SanPhamDAO SanPhamDAO = new SanPhamDAO();

					if (SanPhamDAO.kiemTraTenSanPham(tenSanPham)) {
						baoLoi += "Sản phẩm đã tồn tại, vui lòng thêm sản phẩm khác.<br/>";
					}

					request.setAttribute("baoLoi", baoLoi);
			       // Chuyển đổi dữ liệu ảnh   
			       
			       ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();
			       byte[] buffer1 = new byte[4096];
			       int bytesRead1;
			       while ((bytesRead1 = fileContent1.read(buffer1)) != -1) {
			           outputStream1.write(buffer1, 0, bytesRead1);
			       }
			       byte[] imageData1 = outputStream1.toByteArray();

			       ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
			       byte[] buffer2 = new byte[4096];
			       int bytesRead2;
			       while ((bytesRead2 = fileContent2.read(buffer2)) != -1) {
			           outputStream2.write(buffer2, 0, bytesRead2);
			       }
			       byte[] imageData2 = outputStream2.toByteArray();

			       ByteArrayOutputStream outputStream3 = new ByteArrayOutputStream();
			       byte[] buffer3 = new byte[4096];
			       int bytesRead3;
			       while ((bytesRead3 = fileContent3.read(buffer3)) != -1) {
			           outputStream3.write(buffer3, 0, bytesRead3);
			       }
			       byte[] imageData3 = outputStream3.toByteArray();
					// Tạo đối tượng  
				
					anhSanPhamDAO aspd = new anhSanPhamDAO() ;  
					SanPhamDAO spd  =  new SanPhamDAO() ; 
					
					// Tải về bảng sanpham
					Random rd = new Random();
					String maSanPham = System.currentTimeMillis() + rd.nextInt(1000) + "";  
					TheLoai theLoai = new TheLoai(theLoaiString);
					double giaBan = Double.parseDouble(giaBanString); 
					int soLuong = Integer.parseInt(soLuongString);
					SanPham sp =  new SanPham(maSanPham, tenSanPham, giaBan, soLuong, theLoai, moTa);
					
					// Tải về bảng imgsp     
					String idanh = System.currentTimeMillis() + rd.nextInt(1000) + "";  
					anhSanPham img = new anhSanPham(idanh, tenSanPham, imageData1, imageData2,imageData3);    
					
					
				
					if(baoLoi.length()>0) {
						url = "/add-product.jsp" ;
					}else {
						if(spd.insert(sp) >0  && aspd.insert(img)>0 ) {
							url = "/khachhang/thanhcong.jsp" ;
						}
						
					}

					RequestDispatcher rd1 = getServletContext().getRequestDispatcher(url);
					rd1.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	
}
