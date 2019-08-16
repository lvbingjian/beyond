<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html; charset=UTF-8" %>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta content="yes" name="apple-mobile-web-app-capable">
<meta content="telephone=no,email=no" name="format-detection">
<meta content="yes" name="apple-touch-fullscreen">
<title>进度条</title>
<style>
*{margin:0;padding:0;}
#ulmian{
position:relative;
width:100%;
overflow:hidden;
}
#ulmian li{
position:absolute;
opacity:0;
transition:opacity 1s;
}
#ulmian li:first-child{
position:absolute;
opacity:1;
}
#ulmian li img{
width:100%;
}
#last{
position:absolute;
width:60px;
height:30px;
text-align:center;
font-size:14px;
background:rgba(0,0,0,0.8);
line-height:30px;
top:50%;
margin-top:15px;
left:0;
color:#fff;
cursor:pointer;
}
#next{
position:absolute;
width:60px;
height:30px;
text-align:center;
font-size:14px;
background:rgba(0,0,0,0.8);
line-height:30px;
top:50%;
margin-top:15px;
right:0;
color:#fff;
cursor:pointer;
}
*::selection{
background:none;
}
</style>
</head>
<body>
<div style="position:relative;">
<ul id="ulmian">
<li><img src="images/banner1.jpg"></li>
<li><img src="images/banner2.jpg"></li>
<li><img src="images/banner3.jpg"></li>
<li><img src="images/banner4.jpg"></li>
</ul>
<div id="last">last</div>
<div id="next">next</div>
</div> 

<script>
window.onload = function(){
document.getElementById("ulmian").style.height = window.screen.height + 'px';
}
window.onresize = function(){
document.getElementById("ulmian").style.height = window.screen.height + 'px';
}
//点击next按钮跳转到下一页
var next = document.getElementById("next");
var last = document.getElementById("last");
var oLi = document.getElementById("ulmian").getElementsByTagName("li");
var index = 0;
next.onclick = function(){
index++;
if(index == oLi.length){
index = 0;
}
for(var i=0;i<oLi.length;i++){
oLi[i].style.opacity = "0";
}
oLi[index].style.opacity = "1"; 

}
last.onclick = function(){
index--;
if(index == -1){
index = oLi.length-1;
}
for(var i=0;i<oLi.length;i++){
oLi[i].style.opacity = "0";
}
oLi[index].style.opacity = "1"; 

}

</script> 
</body>
</html>
