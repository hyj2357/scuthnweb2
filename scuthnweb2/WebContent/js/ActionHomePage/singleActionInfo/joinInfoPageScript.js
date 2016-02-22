function checkUseAccountInfo($this){
	//console.info($("#uacc").attr("checked"));
	if($(".inputTxt").attr("disabled")=="disabled")
		$(".inputTxt").removeAttr("disabled");
	else
	    $(".inputTxt").attr("disabled","disabled");
}