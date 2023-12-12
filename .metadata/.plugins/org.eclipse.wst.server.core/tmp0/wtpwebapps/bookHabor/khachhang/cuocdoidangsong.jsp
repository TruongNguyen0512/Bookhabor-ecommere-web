<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>BookHabor&nbsp;|&nbsp;Thiết Kế Cuộc Đời Đáng Sống</title>

<!-- Stylesheet -->
<!---Boxicons CDN Setup for icons-->
<link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css'
	rel='stylesheet'>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap')
	; /** Poppins Font **/

/** gobal layout */
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}

:root {
	--primary-color: #5344db;
	--accent-color: #5344db;
	--grey: #484848;
	--bg-grey: #efefef;
	--shadow: #949494;
}

.container {
	display: flex;
	position: relative;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.row {
	display: flex;
	gap: 20px;
}

.col-6 {
	width: 50%;
}

.single-product {
	width: 1080px;
	position: relative;
}
/** Breadcrumb **/
.single-product .breadcrumb {
	background: #48484810;
	padding: 8px 4px;
	border-radius: 8px;
	font-size: 15px;
}

.breadcrumb span {
	display: inline-flex;
	flex-direction: row;
	gap: 8px;
	margin-left: 8px;
}

.breadcrumb span:not(:last-child)::after {
	content: '/';
}

.breadcrumb span a {
	text-decoration: none;
	color: var(--primary-color);
}

/** product image **/
.single-product .product-image {
	width: 100%;
}

.product-image .product-image-main {
	position: relative;
	display: block;
	height: 480px;
	background: var(--bg-grey);
	padding: 10px;
}

.product-image-main img {
	display: block;
	width: 100%;
	height: 100%;
	object-fit: contain;
}

.product-image-slider {
	display: flex;
	gap: 10px;
	margin: 10px 0;
}

.product-image-slider img {
	width: 90px;
	height: 90px;
	background: var(--bg-grey);
	padding: 6px;
	cursor: pointer;
}

/** product title **/
.product-title {
	margin-top: 20px;
}

.product-title h2 {
	font-size: 32px;
	line-height: 2.4rem;
	font-weight: 700;
	letter-spacing: -0.02rem;
}

/** product rating **/
.product-rating {
	display: flex;
	margin-top: 4px;
	margin-bottom: 10px;
	align-items: center;
}

.product-rating span:not(:last-child) {
	color: #ffc600;
}

.product-rating .review {
	color: var(--grey);
	font-size: 12px;
	font-weight: 500;
}
/** Product price **/
.product-price {
	display: flex;
	position: relative;
	margin: 10px 0;
	align-items: center;
}

.product-price .offer-price {
	font-size: 48px;
	font-weight: 700;
}

.product-price .sale-price {
	font-size: 22px;
	font-weight: 500;
	text-decoration: line-through;
	color: var(--grey);
	margin-left: 12px;
}

/** Product Details **/
.product-details {
	margin: 10px 0;
}

.product-details h3 {
	font-size: 18px;
	font-weight: 500;
}

.product-details p {
	margin: 5px 0;
	font-size: 14px;
	line-height: 1.2rem;
}

/** Product size **/
.product-size {
	margin: 10px 0;
}

.product-size h4 {
	font-size: 16px;
	font-weight: 500;
}

.product-size .size-layout {
	margin: 5px 0;
	display: inline-flex;
	align-items: center;
	gap: 10px;
	cursor: pointer;
}

.product-size .size-layout .size-input {
	display: none;
}

.product-size .size-layout .size {
	background: var(--bg-grey);
	padding: 10px 18px;
	border: 1px solid var(--bg-grey);
	border-radius: 4px;
	margin-left: 0px;
	font-size: 16px;
	font-weight: 700;
	cursor: pointer;
}

.product-size .size-layout .size:hover {
	border: 1px solid var(--grey);
}

.product-size .size-layout input[type="radio"]:checked+.size {
	background-color: rgb(35, 35, 35);
	border: 1px solid var(--grey);
	color: var(--bg-grey);
	box-shadow: 0 3px 6px var(--shadow);
}

/** Product Color **/
.product-color {
	margin: 10px 0;
	justify-content: center;
}

.product-color h4 {
	font-size: 16px;
	font-weight: 500;
}

.product-color .color-layout {
	margin: 5px 0;
	display: flex;
	gap: 10px;
}

.product-color .color-layout label {
	border-radius: 4px;
	cursor: pointer;
	content: '';
	width: 40px;
	height: 40px;
	display: inline-block;
}

.product-color .color-layout .black {
	background-color: black;
}

.product-color .color-layout .red {
	background-color: red;
}

.product-color .color-layout .blue {
	background-color: blue;
}

.product-color .color-layout input[type="radio"]:checked+label {
	box-shadow: 0 3px 6px var(--shadow);
}

.product-color .color-layout .color-input {
	display: none;
}

/** divider **/
.divider {
	display: block;
	height: 1px;
	width: 100%;
	background: #48484830;
	margin: 20px 0;
}

/** product Button Group **/
.product-btn-group {
	display: flex;
	gap: 15px;
}

.product-btn-group .button {
	display: flex;
	align-items: center;
	justify-content: center;
	gap: 4px;
	padding: 10px 24px;
	font-size: 16px;
	font-weight: 500;
}

.product-btn-group .buy-now {
	background-color: var(--accent-color);
	color: #fff;
	border: 1px solid var(--accent-color);
	border-radius: 4px;
	cursor: pointer;
}

.product-btn-group .buy-now i {
	font-size: 20px;
}

.product-btn-group .buy-now:hover {
	box-shadow: 0 3px 6px var(--shadow);
}

.product-btn-group .add-cart {
	background-color: var(--bg-grey);
	color: var(--grey);
	border-radius: 4px;
	cursor: pointer;
}

.product-btn-group .add-cart i {
	font-size: 20px;
}

.product-btn-group .add-cart:hover {
	box-shadow: 0 3px 6px var(--shadow);
	background: var(--grey);
	color: #fff;
}

.product-btn-group .heart {
	color: var(--grey);
	cursor: pointer;
}

.product-btn-group .heart i {
	font-size: 20px;
}

.product-btn-group .heart:hover {
	color: var(--accent-color);
}

/** Responsive Mobile **/
@media screen and (max-width:520px) {
	.container {
		padding: 20px;
		height: auto;
	}
	.row {
		display: block;
	}
	.col-6 {
		width: 100%;
		display: block;
	}
	.single-product {
		width: 100%;
		position: relative;
	}
	.product-image .product-image-main {
		width: 100%;
		height: 280px;
	}
	.product-image-slider {
		gap: 5px;
	}
	.breadcrumb {
		display: none;
	}
	.product-title h2 {
		font-size: 24px;
		line-height: 1.6rem;
	}
	.product-size {
		display: block;
	}
	.product-size .size-layout {
		display: block;
		margin: 10px 0;
	}
	.product-size .size-layout .size {
		padding: 6px 10px;
	}
	.product-btn-group {
		display: flex;
		flex-direction: column;
		gap: 10px;
	}
}

/** Responsive Tablet **/
@media ( min-width : 520px ) and (max-width: 1080px) {
	.container {
		display: block;
		height: auto;
		padding: 20px;
	}
}

106434






.9609  

.row {
	width: 130%;
	display: flex;
	gap: 20px;
}
</style>
<link rel="icon" href="logo.png">
</head>
<body>
	<div class="container">
		<div class="single-product">
			<div class="row">
				<div class="col-6">
					<div class="product-image">
						<div class="product-image-main">
							<img
								src="https://cdn0.fahasa.com/media/catalog/product/i/m/image_195509_1_4390_1.jpg"
								alt="" id="product-main-image">
						</div>
						<div class="product-image-slider">
							<img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/thiet_ke_mot_cuoc_doi_dang_song_tai_ban_2023/2023_07_31_17_09_36_4-390x510.png"
								alt="" class="image-list"> <img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/thiet_ke_mot_cuoc_doi_dang_song_tai_ban_2023/2023_07_31_17_09_36_5-390x510.png"
								alt="" class="image-list"> <img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/thiet_ke_mot_cuoc_doi_dang_song_tai_ban_2023/2023_07_31_17_09_36_6-390x510.png"
								alt="" class="image-list"> <img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/thiet_ke_mot_cuoc_doi_dang_song_tai_ban_2023/2023_07_31_17_09_36_7-390x510.png"
								alt="" class="image-list">
						</div>
					</div>
				</div>
				<div class="col-6">
					<div class="breadcrumb">
						<span><a href="index.jsp">Trang Chủ</a></span> <span><a
							href="#">Đời Sống</a></span> <span class="active">Thiết Kế Cuộc Đời Đáng Sống</span>
					</div>

					<div class="product">
						<div class="product-title">
							<h2>THIẾT KẾ CUỘC ĐỜI ĐÁNG SỐNG </h2>
						</div>
						<div class="product-rating">
							<span><i class="bx bxs-star"></i></span> <span><i
								class="bx bxs-star"></i></span> <span><i class="bx bxs-star"></i></span>
							<span><i class="bx bxs-star"></i></span> <span><i
								class="bx bxs-star"></i></span> <span class="review">(50 Review)</span>
						</div>
						<div class="product-price">
							<span class="offer-price">128,400 đ</span> <span
								class="sale-price">115,000đ</span>
						</div>


						<div class="product-details">
							<h3>Nội dung giới thiệu</h3>
							<p>Bạn đang "mắc kẹt" trong một công việc không hạnh phúc?
								Bạn đau đầu vì chuyện tiền bạc? Bạn bế tắc vì cuộc sống gia
								đình? Cuộc sống này vốn nhiều thăng trầm, trắc trở. Ai cũng phải
								chật vật với vô số câu hỏi về cuộc đời, công việc, ý nghĩa và
								mục đích sống. Có những vấn đề kéo dài dai dẳng trong hàng năm
								trời, đôi khi khiến chúng ta cảm thấy như không thể tìm được
								lối. Trong "Thiết kế một cuộc đời đáng sống", Bill Burnett và
								Dave Evans - những chuyên gia về thiết kế sản phẩm từ đại học
								Stanford danh tiếng - đưa ra một cách nhìn khác lạ về những vấn
								đề tréo ngoe của cuộc sống: Góc nhìn của một nhà thiết kế sản
								phẩm.</p>
						</div>
						<div class="product-details">
							<h3>Thông tin tác giả</h3>
							<p><strong>Bill Burnett</strong> là giám đốc điều hành chương trình Thiết kế
								Stanford, giáo sư chuyên ngành Kỹ sư Cơ khí đại học Stanford.
								Sau khi lấy bằng Cử nhân và Thạc sĩ Thiết kế Sản phẩm tại
								Stanford, Bill trải qua nhiều dự án thiết kế chuyên nghiệp, từ
								máy tính Apple PowerBooks đến các mô hình nhân vật Hasbro Star
								Wars bản gốc. Ông cũng nắm giữ nhiều bằng sáng chế về cơ khí và
								thiết kế. Dave Evans là giảng viên chuyên ngành Thiết kế Sản
								phẩm Đại học Stanford, cố vấn quản lý kiêm đồng sáng lập
								Electronic Arts. Sau khi tốt nghiệp Cử nhân và Thạc sĩ ngành Kỹ
								sư Cơ khí tại Stanford, Dave trải qua hơn 30 năm trong vai trò
								nhà điều hành kiêm cố vấn quản lý ngành công nghệ cao. Tại
								Electronic Arts, Dave đã hỗ trợ nhiều nhà khởi nghiệp trên con
								đường tìm lối đi riêng.</p>
						</div>
						<span class="divider"></span>

						<div class="product-btn-group">
							<div class="button buy-now">
								<i class='bx bxs-zap'></i> Buy Now
							</div>
							<div class="button add-cart">
								<i class='bx bxs-cart'></i> Add to Cart
							</div>
							<div class="button heart">
								<i class='bx bxs-heart'></i> Add to Wishlist
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--script-->
	<script>
		const sliderMainImage = document.getElementById("product-main-image"); //product container image
		const sliderImageList = document.getElementsByClassName("image-list"); // image thumblian group selection
		console.log(sliderImageList);

		sliderImageList[0].onclick = function() {
			sliderMainImage.src = sliderImageList[0].src;
			console.log(sliderMainImage.src);
		};

		sliderImageList[1].onclick = function() {
			sliderMainImage.src = sliderImageList[1].src;
			console.log(sliderMainImage.src);
		};

		sliderImageList[2].onclick = function() {
			sliderMainImage.src = sliderImageList[2].src;
			console.log(sliderMainImage.src);
		};

		sliderImageList[3].onclick = function() {
			sliderMainImage.src = sliderImageList[3].src;
			console.log(sliderMainImage.src);
		};
	</script>
</body>
</html>