<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Properties"%>
<%@page import="java.io.File"%>
<html>
<body>
<%
try
{
	out.println("Profile ID:  " + System.getProperty("profileId"));
	String path = "E:\\Logic Building\\ideMaven4\\src\\main\\env\\{env}_webapp\\myapp.properties";
	System.out.println(System.getProperty("user.dir"));
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
</br>
<%
try
{
   // FileInputStream fis = new FileInputStream("../myapp.properties");
    //Properties q = new Properties();
    //q.load(fis);
    //String LogFileName1 = q.getProperty("msg");
    //out.println(LogFileName1);
}
catch (Exception e)
{// Catch exception if any
   // out.println(e.getMessage());
}
%>

<h2>CyberPunk!</h2>
</body>
</html>
