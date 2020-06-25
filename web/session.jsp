<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<TITLE>세션 JSP 테스트 페이지</TITLE>
</HEAD>
<BODY>
<center>
<h1>세션 JSP 테스트 페이지</h1>
<%
    Integer ival = (Integer)session.getAttribute("sessiontest.counter");
    if(ival==null) {
        ival = new Integer(1);
    }
    else {
        ival = new Integer(ival.intValue() + 1);
    }
    session.setAttribute("sessiontest.counter", ival);
%>
당신은 이곳을 <b> <%= ival %> </b>번 방문 했습니다.<p>
<a href="session.jsp">여기를 클릭하세요.</a>
<p>
<h3>request 객체와 관련된 세션 데이터</h3>
요청된 세션 ID : <%= request.getRequestedSessionId() %><br />
쿠키로부터 요청된 세션 ID 인가? : <%= request.isRequestedSessionIdFromCookie() %><br />
URL로부터 요청된 세션 ID 인가? : <%= request.isRequestedSessionIdFromURL() %><br />
유효한 세션 ID 인가? : <%= request.isRequestedSessionIdValid() %><br />
</center>
</BODY>
</HTML>

