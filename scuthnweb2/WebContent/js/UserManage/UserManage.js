function checkUseAccountInfo($this){
	//console.info($("#uacc").attr("checked"));
	if($(".inputTxt").attr("disabled")=="disabled")
		$(".inputTxt").removeAttr("disabled");
	else
	    $(".inputTxt").attr("disabled","disabled");
}

function mouseOverNcboard($this){
	$this.css("background-color","#FFFFFF");
	$this.css("border-width","6px 6px 3px 6px");
	$this.css("border-color","#FFFFFF #FF9900 #FFFFFF #FFFFFF");
}

function mouseOutNcboard($this){
	$this.css("background-color","#CCCCCC");
	$this.css("border-width","6px 6px 3px 6px");
	$this.css("border-color","#CCCCCC #CCCCCC #FFFFFF #CCCCCC");	
}

function mouseOverWcboard($this){
	
}

function mouseOutWcboard($this){
	
}