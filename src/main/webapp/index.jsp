<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>

<html>
<body>
<h2>Hello World! redeploy <%=new Date()%></h2>

<%
    int j =  0;
    int k = 1;
    int l = j+k;

 %>
 Hodnota l je <%=l%><br>
 <%=l+4%><br>
 <%=4+5-2%><br>
 <%=new String("Kiko")%><br>
 <%="kiko cernak"%><br>

 <%!
     public int spocitaj(int a, int b){
     return a+b;
     }
 %>

 <p> Spocitaj a + b = <%=spocitaj(10, 5)%> </p>

 <%
 int a = 10;
 int b = 100;
 int vysledok = spocitaj(a, b);
 out.println("Vysledok spocitaj je: " + vysledok);
 %>

 <%
    for(int i = 0; i<10; i++){
    out.println(i+"<br>");
    }
 %>

  <%
      for(int i = 0; i<10; i++){
      %>
      <p><%=i%></p>
      <%
      }
  %>

<%@ include file="/footer.jsp"%>
</body>
</html>
