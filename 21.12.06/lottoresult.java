<%@page import="javax.servlet.jsp.tagext.IterationTag"%>
<%@page import="edu.kosmo.ex.Lotto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>결과</title>
<link rel="canonical"
	href="https://getbootstrap.kr/docs/5.0/examples/sticky-footer/">
<style>

</style>
</head>
<body >


	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
	<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="lottostart.jsp">LottoGame</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="lottostart.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="start.jsp">RpsGame</a>
					</li>

				</ul>
			</div>
		</div>
	</nav>

<div class= whole style="background-image: linear-gradient(to bottom, rgba(255, 255, 255, 0.6) 0%, rgba(255, 255, 255, 0.9) 100%), url('lottoimages/paper.jpg');">
	<section class="jumbotron text-center bg-white img-fluid">

		<div class="container">
			<h1 class="display-1 my-5 h2 text-alert p-5">행운의 번호는</h1>

		</div>
	</section>
	<div class= main
		style="background-image: linear-gradient(to bottom, rgba(255, 255, 255, 0.6) 100%, rgba(255, 255, 255, 0.9) 100%), url('lottoimages/paper.jpg');">
		
	<%
	Lotto lotto = new Lotto();
	pageContext.setAttribute("lotto", lotto);
	%>

		<div class="container d-flex justify-content-center ">
			<div class=row>
				<c:forEach var="num" items="${lotto.lottoSet}">

						<div class="card border-0 col-lg-2 mt-5 ">
						<img src="lottoimages/circle-xxl.png" class="card-img-center d-flex justify-content-center"
							style="height: 200px; width: 200px;">
						<div class="card-img-overlay carousel-caption  ">
							<h1
								class="card-text  my-4  ">${num}</h1>

						</div>
						</div>
				</c:forEach>
			</div>
		</div>
		<div class="btn-group d-flex justify-content-center m-5  p-5 "
			role="group" aria-label="다시하기와뒤로가기">
			<a href="lottoresult.jsp" class=" btn-lg" tabindex="-1">
				<button type="button" class="btn btn-danger">한번 더 추첨하기</button>
			</a> <a href="lottostart.jsp" class=" btn-lg" tabindex="-1">
				<button type="button" class="btn btn-success">첫 화면으로 가기</button>
			</a> <a href="http://www.dhlottery.co.kr" class=" btn-lg" tabindex="-1"><button
					type="button" class="btn btn-light text-secondary text-sm">구매하러
					가기</button></a>
		</div>
	</div>
</div>
	<footer
		class="fixed-bottom footer container-fluid navbar-fixed-bottom mt-auto py-3 bg-light text-center">
		<div class="container">
			<span class="text-muted">thx 동행복권 <a
				href="https://www.dhlottery.co.kr/common.do?method=main"> 실제
					동행복권 사이트와는 관련 없습니다 </a></span>
		</div>
	</footer>

</body>
</html>
