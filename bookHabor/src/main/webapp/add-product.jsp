<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>Add Product - Dashboard HTML Template</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:400,700" />
<!-- https://fonts.google.com/specimen/Roboto -->
<link rel="stylesheet" href="css/fontawesome.min.css" />
<!-- https://fontawesome.com/ -->
<link rel="stylesheet" href="jquery-ui-datepicker/jquery-ui.min.css"
	type="text/css" />
<!-- http://api.jqueryui.com/datepicker/ -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
<!-- https://getbootstrap.com/ -->
<link rel="stylesheet" href="css/templatemo-style.css">  

<!--
	Product Admin CSS Template
	https://templatemo.com/tm-524-product-admin
	-->
	<style>   
	
	   .row {
    width: 100%;
    display: -ms-flexbox;
    display: flex;
    -ms-flex-wrap: wrap;
    flex-wrap: wrap;
    margin-right: -15px;
    margin-left: -15px;
  }
       .tm-block-title {
    margin-bottom: 0;
    
   }
        .red {
	color: red;
    }
	</style>
</head>

<body>
     <%
		String baoLoi = request.getAttribute("baoLoi")+"";
		baoLoi = (baoLoi.equals("null"))?"":baoLoi;
	
	%>
	<nav class="navbar navbar-expand-xl">
		<div class="container h-100">
			<a class="navbar-brand" href="index.html">
				<h1 class="tm-site-title mb-0">Product Admin</h1>
			</a>
			<button class="navbar-toggler ml-auto mr-0" type="button"
				data-toggle="collapse" data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<i class="fas fa-bars tm-nav-icon"></i>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mx-auto h-100">
					<li class="nav-item"><a class="nav-link" href="index.html">
							<i class="fas fa-tachometer-alt"></i> Dashboard <span
							class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="far fa-file-alt"></i> <span>
								Reports <i class="fas fa-angle-down"></i>
						</span>
					</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Daily Report</a> <a
								class="dropdown-item" href="#">Weekly Report</a> <a
								class="dropdown-item" href="#">Yearly Report</a>
						</div></li>
					<li class="nav-item"><a class="nav-link active"
						href="products.html"> <i class="fas fa-shopping-cart"></i>
							Products
					</a></li>

					<li class="nav-item"><a class="nav-link" href="accounts.html">
							<i class="far fa-user"></i> Accounts
					</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="fas fa-cog"></i> <span>
								Settings <i class="fas fa-angle-down"></i>
						</span>
					</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Profile</a> <a
								class="dropdown-item" href="#">Billing</a> <a
								class="dropdown-item" href="#">Customize</a>
						</div></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link d-block"
						href="login.html"> Admin, <b>Logout</b>
					</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container tm-mt-big tm-mb-big">
		<div class="row">
			<div class="col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto">
				<div class="tm-bg-primary-dark tm-block tm-block-h-auto">
					<div class="row">
						<div class="col-12">
							<h2 class="tm-block-title d-inline-block">Add Product</h2>
							<div class="red" id="baoLoi">
			                       <%=baoLoi %>
		                    </div>
						</div>
					</div>
					<div class="row tm-edit-product-row">
						<div class="col-md-12">
							<form action="San-Pham" class="tm-edit-product-form" method="post" enctype="multipart/form-data">
								<input type="hidden" name="act" value="them-san-pham"/>
								<div class="form-group mb-3">
									<label for="name">Tên Sản Phẩm </label> <input id="tenSanPham"
										name="tenSanPham" type="text" class="form-control validate"
										required />
								</div>
								<div class="form-group mb-3">
									<label for="description">Mô tả</label>
									<textarea class="form-control validate" rows="3" name="moTa"
										required></textarea>
								</div>
								<div class="form-group mb-3">
									<label for="category">Thể Loại</label> <select
										class="custom-select tm-select-accounts" id="category"
										name="category">
										<option selected>Select category</option>
										<option value="khoaHoc">Khoa Học</option>
										<option value="vanHoc">Văn Học</option>
										<option value="doiSong">Đời Sống</option>
									</select>
								</div>
								<div class="row">
									<div class="form-group mb-3 col-xs-12 col-sm-6">
										<label for="expire_date">Số Lượng</label> <input id=""
											name="soLuong" type="text" class="form-control validate"
											data-large-mode="true" />
									</div>
									<div class="form-group mb-3 col-xs-12 col-sm-6">
										<label for="stock">Giá Bán</label> <input id="stock"
											name="giaBan" type="text" class="form-control validate"
											required />
									</div>
								</div>
						</div>
						<div class="row">
							<div class="col-xl-4 col-lg-4 col-md-4 mx-auto mb-4">
								<div class="tm-product-img-dummy mx-auto">
									<img id="uploadedImage1" src="" alt="Uploaded Image 1"
										style="display: none; max-width: 100%; height: auto;">
								</div>
								<input id="fileInput1" name="fileInput1" type="file"
									style="display: none;" onchange="previewImage(event, 1)">
							</div>
							<div class="col-xl-4 col-lg-4 col-md-4 mx-auto mb-4">
								<div class="tm-product-img-dummy mx-auto">
									<img id="uploadedImage2" src="" alt="Uploaded Image 2"
										style="display: none; max-width: 100%; height: auto;">
								</div>
								<input id="fileInput2" name="fileInput2" type="file"
									style="display: none;" onchange="previewImage(event, 2)">
							</div>
							<div class="col-xl-4 col-lg-4 col-md-4 mx-auto mb-4">
								<div class="tm-product-img-dummy mx-auto">
									<img id="uploadedImage3" src="" alt="Uploaded Image 3"
										style="display: none; max-width: 100%; height: auto;">
								</div>
								<input id="fileInput3" name="fileInput3" type="file"
									style="display: none;" onchange="previewImage(event, 3)">
							</div>
						</div>
						<div class="row">
							<div class="col-xl-6 col-lg-6 col-md-12 mx-auto mb-4">
								<div class="custom-file mt-3 mb-3">
									<input type="button" class="btn btn-primary btn-block mx-auto"
										value="Thêm Ảnh" onclick="openFileInput()">
								</div>
							</div>
						</div>
						<div class="col-12">
							<button type="submit"
								class="btn btn-primary btn-block text-uppercase"
								value="themSanPham">Thêm Sản Phẩm Ngay</button>
						</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer class="tm-footer row tm-mt-small">
		<div class="col-12 font-weight-light">
			<p class="text-center text-white mb-0 px-4 small">
				Copyright &copy; <b>2018</b> All rights reserved. Design: <a
					rel="nofollow noopener" href="https://templatemo.com"
					class="tm-footer-link">Template Mo</a>
			</p>
		</div>
	</footer>

	<script src="js/jquery-3.3.1.min.js"></script>
	<!-- https://jquery.com/download/ -->
	<script src="jquery-ui-datepicker/jquery-ui.min.js"></script>
	<!-- https://jqueryui.com/download/ -->
	<script src="js/bootstrap.min.js"></script>
	<!-- https://getbootstrap.com/ -->
	<script>
		$(function() {
			$("#expire_date").datepicker();
		});
	</script>

	<script>
		let currentImageNumber = 1;

		function openFileInput() {
			if (currentImageNumber <= 3) {
				document.getElementById('fileInput' + currentImageNumber)
						.click();
				currentImageNumber++;
			}
		}

		function previewImage(event, imageNumber) {
			const input = event.target;
			if (input.files && input.files[0]) {
				const reader = new FileReader();

				reader.onload = function(e) {
					const imageId = 'uploadedImage' + imageNumber;
					const image = document.getElementById(imageId);
					image.src = e.target.result;
					image.style.display = 'block';
				};

				reader.readAsDataURL(input.files[0]);
			}
		}
	</script>
</body>
</html>
