<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>BookHaBor&nbsp;|&nbsp;Đầu Tư Thông Minh</title>
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
								src="https://cdn0.fahasa.com/media/catalog/product/8/9/8935086856765.jpg?_gl=1*i87rpt*_ga*MTY3NDY3MDExMy4xNzAyMjc4NzQx*_ga_460L9JMC2G*MTcwMjI3ODc0MS4xLjEuMTcwMjI4MTY1Mi42MC4wLjA.*_gcl_aw*R0NMLjE3MDIyODAzOTkuQ2owS0NRaUE0TldyQmhELUFSSXNBRkNLd1d2UDZWMWM3eFF3dXRvanRST3Y0dDBNX3NhS1JqYTd3V1VCNi1ZRTZnY3NrWFlyLU1uZl9Md2FBamdJRUFMd193Y0I.*_gcl_au*MTQ0Nzg0NDI3Ny4xNzAyMjc4NzQx"
								alt="" id="product-main-image">
						</div>
						<div class="product-image-slider">
							<img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/dau_tu_thong_minh/2023_02_06_09_52_45_1-390x510.jpg?_gl=1*i87rpt*_ga*MTY3NDY3MDExMy4xNzAyMjc4NzQx*_ga_460L9JMC2G*MTcwMjI3ODc0MS4xLjEuMTcwMjI4MTY1Mi42MC4wLjA.*_gcl_aw*R0NMLjE3MDIyODAzOTkuQ2owS0NRaUE0TldyQmhELUFSSXNBRkNLd1d2UDZWMWM3eFF3dXRvanRST3Y0dDBNX3NhS1JqYTd3V1VCNi1ZRTZnY3NrWFlyLU1uZl9Md2FBamdJRUFMd193Y0I.*_gcl_au*MTQ0Nzg0NDI3Ny4xNzAyMjc4NzQx"
								alt="" class="image-list"> <img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/dau_tu_thong_minh/2023_02_06_09_52_45_2-390x510.jpg"
								alt="" class="image-list"> <img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/dau_tu_thong_minh/2023_02_06_09_52_45_3-390x510.jpg"
								alt="" class="image-list"> <img
								src="https://cdn0.fahasa.com/media/flashmagazine/images/page_images/dau_tu_thong_minh/2023_02_06_09_52_45_4-390x510.jpg"
								alt="" class="image-list">
						</div>
					</div>
				</div>
				<div class="col-6">
					<div class="breadcrumb">
						<span><a href="index.jsp">Trang Chủ</a></span> <span><a
							href="#">Đời Sống</a></span> <span class="active">Đầu Tư Thông
							Minh</span>
					</div>

					<div class="product">
						<div class="product-title">
							<h2>ĐẦU TƯ THÔNG MINH</h2>
						</div>
						<div class="product-rating">
							<span><i class="bx bxs-star"></i></span> <span><i
								class="bx bxs-star"></i></span> <span><i class="bx bxs-star"></i></span>
							<span><i class="bx bxs-star"></i></span> <span><i
								class="bx bxs-star"></i></span> <span class="review">(47 Review)</span>
						</div>
						<div class="product-price">
							<span class="offer-price">100,000 đ</span> <span
								class="sale-price">200,000đ</span>
						</div>


						<div class="product-details">
							<h3>Nội dung giới thiệu</h3>
							<p>Bạn cảm thấy như thế nào nếu từ tâm trí, trái tim và sâu
								thẳm trong tâm hồn mình, bạn biết mình sẽ luôn được sung túc?
								Bạn cảm thấy như thế nào khi biết chắc chắn rằng dù có bất cứ
								chuyện gì xảy ra với nền kinh tế, thị trường chứng khoán hay thị
								trường bất động sản, bạn vẫn luôn có sự an toàn về mặt tài chính
								đến cuối đời? Bạn cảm thấy như thế nào khi biết mình sẽ có một
								gia tài to lớn đủ để bạn không chỉ có thể chăm lo cho gia đình
								mà còn tận hưởng niềm vui đến từ việc giúp đỡ người khác? Tất cả
								chúng ta đều mơ ước đạt được sự bình yên nội tại, sự thoải mái,
								độc lập và tự do đó. Nói một cách ngắn gọn, chúng ta đều khao
								khát có được trạng thái vững vàng trước mọi biến động.</p>
						</div>
						<div class="product-details">
							<h3>Thông tin tác giả</h3>
							<p><strong>Anthony Jay Robbins</strong> (tên khai sinh là Anthony J.
								Mahavoric; sinh ngày 29 tháng 2 năm 1960) là một tác giả, chuyên
								gia coaching, diễn giả và nhà từ thiện người Mỹ. Robbins được
								biết đến thông qua các tác phẩm, hội thảo về chủ đề self-help,
								bao gồm sách Unlimited Power (xuất bản năm 1987) và Awaken the
								Giant Within (xuất bản năm 1993).</p>
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