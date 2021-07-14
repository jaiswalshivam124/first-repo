<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Properties"%>
<%@page import="java.io.File"%>
<html>
<body>
<%
try
{
	String path = "\\myapp.properties";
    FileInputStream fis = new FileInputStream(path);
    Properties p = new Properties();
    p.load(fis);
    String LogFileName = p.getProperty("msg");
    out.println(LogFileName);
}
catch (Exception e)
{ //Catch exception if any
    out.println(e.getMessage());
}
%>
<h2>Hello World!!!!</h2>
</body>
</html>
