function ctop(){
var w=window.innerWidth
|| document.documentElement.clientWidth
|| document.body.clientWidth;

var h=window.innerHeight
|| document.documentElement.clientHeight
|| document.body.clientHeight;

var e = $(".top").css("width");
var d = $(".top").css("height");

var ef = parseFloat(e.substring(0,e.length-2));
var df = parseFloat(d.substring(0,d.length-2));
var r = ef/df;
var before_ef = ef;
ef = parseInt(w);
if(ef>1200)          //如果尺寸在1000px以上,停止变化,并且两边留白.
{
	var v = (ef - before_ef)/2;
	$("#wrap").css("margin-left",v+"px");
    $("#wrap").css("margin-right",v+"px");
	return;
}else{
	$("#wrap").css("margin-left",0+"px");
    $("#wrap").css("margin-right",0+"px");
}
df = ef*0.5;

$(".top").css("width",ef+"px");
$(".top").css("height",df+"px");

var top = df;
$("#v").css("top",top+"px");
$("#v").css("width",ef+"px");
$("#v").css("height",(ef*1)+"px");

top += ef;
$("#foot").css("top",top+"px");
$("#foot").css("width",ef+"px");
$("#foot").css("height",(ef/4)+"px");

var w_topBar = parseInt(w)*0.1;
$(".blackC_t").css("width",ef+"px");
$(".blackC_t").css("height",w_topBar+"px");
$(".topbar").css("width",ef+"px");
$(".topbar").css("height",w_topBar+"px");

var w_topBnt = $("#topBtn").css("width");
var _w_topBnf = parseFloat(w_topBnt.substring(0,e.length-2));
$("#topBtn").css("height",(_w_topBnf/3.6)+"px");
}

function cover(){
         $("#topBtn").css("color","#FFFFFF");
         $("#topBtn").css("background-color","#00CCFF");
}
function cout(){
		 $("#topBtn").css("color","#00CCFF");
         $("#topBtn").css("background-color","");
}


function addMediaf($this){
	//afs($this);
	$(".intro:hover").css("text-shadow","0px 0px 9px #00CCFF");

	$this.css("animation","myf 3s");
    $this.css("-moz-animation","myf 3s");
    $this.css("-webkit-animation","myf 3s");
    $this.css("-o-animation","myf 3s");  

    $this.css("animation-iteration-count","9999");  
    $this.css("-webkit-animation-iteration-count","9999");  

    $this.css("animation-iteration-delay","1s");  
    $this.css("-webkit-animation-iteration-delay","1s");  

    $this.css("animation-direction","alternate");  
    $this.css("-webkit-animation-direction","alternate");

}

function removeMedia($this){	
	//rollback($this);
	$(".intro:hover").css("text-shadow","0px 0px 0px");
	$this.css("text-shadow","");

    $this.css("animation","");
    $this.css("-moz-animation","");
    $this.css("-webkit-animation","");
    $this.css("-o-animation","");  

    $this.css("animation-iteration-count","");  
    $this.css("-webkit-animation-iteration-count","");  

    $this.css("animation-direction","");  
    $this.css("-webkit-animation-direction","");  

}

function addMedias($this){
	//afs($this);
	$(".intro:hover").css("text-shadow","0px 0px 9px #CCFF00");


    $this.css("animation","mys 3s");
    $this.css("-moz-animation","mys 3s");
    $this.css("-webkit-animation","mys 3s");
    $this.css("-o-animation","mys 3s");  

    $this.css("animation-iteration-count","9999");  
    $this.css("-webkit-animation-iteration-count","9999");  

	$this.css("animation-iteration-delay","1s");  
    $this.css("-webkit-animation-iteration-delay","1s");  

    $this.css("animation-direction","alternate");  
    $this.css("-webkit-animation-direction","alternate");  



}


function addMediat($this){
	//afs($this);
	$(".intro:hover").css("text-shadow","0px 0px 9px #FF9900");

    $this.css("animation","myt 3s");
    $this.css("-moz-animation","myt 3s");
    $this.css("-webkit-animation","myt 3s");
    $this.css("-o-animation","myf 3s");  

    $this.css("animation-iteration-count","9999");  
    $this.css("-webkit-animation-iteration-count","9999");  

	$this.css("animation-iteration-delay","1s");  
    $this.css("-webkit-animation-iteration-delay","1s");  

    $this.css("animation-direction","alternate");  
    $this.css("-webkit-animation-direction","alternate");  


}

function ccr($this){
     $this.css("color","#FF9900");

}
function ccg($this){
     $this.css("color","#CCFF00");

}
function ccb($this){
     $this.css("color","#00CCFF");

}
function ccB($this){
     $this.css("color","#000000");

}
function cc($this){
    $this.css("color","#FFFFFF");
}


function afs($this){
    var _size = $this.css("font-size");
    var s = parseInt(_size.substring(0,(_size.length-2)));
    s += 6;
    $(".intro:hover").css("font-size",s+"px");  
}

function rollback($this){
    var _size = $(".intro:hover").css("font-size");
    var s = parseInt(_size.substring(0,(_size.length-2)));
    s -= 6;
    $this.css("font-size",s+"px");  
}