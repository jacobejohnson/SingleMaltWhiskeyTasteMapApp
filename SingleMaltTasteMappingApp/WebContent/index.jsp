<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome to the Whiskey Selector!</h1>
	<form action="helloServlet" method="post">
	Hello, welcome to the Single Malt Whiskey Flavor Map! Let's start by getting<br/>
	some of your taste preferences which will help us better determine the ideal<br/>
	whiskey for your palate.<br/>
	<br/>
	The flavor scale of whiskey slides from side to side between light and rich,<br/>
	and up and down between delicate and smoky. Light refers to fresh flavors<br/>
	such as fruits, grass, and cereals, while rich refers to vanilla, dried fruit,<br/>
	and chocolate flavors derived from the wood used during the aging process.<br/>
	
	On a scale of 0-3, with 0 being exceptionally light, 1 being more light than<br/>
	rich, 2 being more rich than light, and 3 being exceptionally rich, which<br/>
	flavor do you think you would enjoy most? <input type="text" name="flavor1" size="5"><br/>
	<br/>
	Delicate whiskeys refrain from using peat during the malting process. As you<br/>
	stay delicate but move towards the light end of the spectrum you notice more<br/>
	floral and grassy freshness. Then moving towards the rich end, you get nutty<br/>
	and barley flavors. Smoky single malts all contain peatiness, which gets<br/>
	burned in the malting process. You will notice smoke and wood-fire like<br/>
	scents in these whiskeys.
	<br/>
	On a scale of 0-3, with 0 being exceptionally delicate, 1 being more delicate<br/>
	than smoky, 2 being more smoky than delicate, and 3 being exceptionally smoky,<br/>
	which flavor do you think you would enjoy most? <input type="text" name="flavor2" size="5"><br/>
	<input type="submit" value="Submit" />
	</form>
</body>
</html>