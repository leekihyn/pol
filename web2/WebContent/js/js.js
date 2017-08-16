/**
 * 
 */

function checkValue(fObj) {
	var maxNum = fObj.elements.length;

	var result = "";

	for (var i = 0; i < maxNum; i++) {
		var eObj = fObj.elements[i];
		if (i % 2 == 1) {
			var checkNum = Number(eObj.value);
			if (isNaN(checkNum)) {
				alert("숫자라고!!");
				eObj.value = "";
				eObj.focus();
				return false;
			}
		}
		if (eObj.value != "전송") {
			result += eObj.value;
		}
		if (i == maxNum - 1) {
			eObj.value = result;
		}
	}
	return false;
}
//		
// if (i % 2 == 1 && i !=maxNum -1) {
// try{
// var checkNum = Number(eObj.value);
// if (isNaN(checkNum)) {
// alert("숫자라고!!");
// eObj.value = "";
// eObj.focus();
// return false;
// }
// }cathch(e){
// alert(e);
// }
// -------------------------------------------------
// 1,2 다 더하는거 전송에 출력되게 하는거
// function checkValue(fObj){
// var maxNum = fObj.elements.length;
//	
// var result = "";
//	
// for(var i =0;i<maxNum;i++){
// var eObj = fObj.elements[i];
// if(eObj.value!="전송"){
// result += eObj.value;
// }
// if(i==maxNum-1){
// eObj.value = result;
// }
// return false;
// }
// }
// /-------------------------------------------
//
// for(var i =0; i<= fObj.elements.length;i++){
//		
//	
//
// alert(fObj.elements[i].value);
// }
// return false;
//	
// }
