<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="delete_form" action="delete.do" method="post">
<p>
	<input type="hidden" name="no" value="${param.no}">
</p>
<input type="submit" value="삭제">
</form>

<script type="text/javascript">
this.document.getElementById("delete_form").submit();
</script>
</body>
</html>