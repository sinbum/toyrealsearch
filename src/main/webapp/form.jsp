<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- 스크립트로 검색 함수를 만든다. -->
<script type="text/javascript">
function search(s){	
	  $.ajax({url: "/searchlist?search="+s, success: function(result){
	      $("#result").html(result);
	    }});
}
</script>
</head>
<body>
<!-- onkeyup은 글자가 추가 될때 마다 실행되는것. -->
<h1>AJAX를 사용한 실시간 검색기능</h1>
<input type="text" name="search" onkeyup="search(this.value)"><br>
<div id="result">

</div>
</body>
</html>