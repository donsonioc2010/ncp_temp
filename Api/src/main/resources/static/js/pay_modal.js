const inputP = document.getElementById('inputPrice')
const priceAmount = document.getElementById('price_amount')

//결제 가격
function inputPrice(e){
    const paynum = (e.value);
    inputP.value = e.value;
    priceAmount.textContent = "결제 금액 : " + paynum + "원";
}
// var price = inputP.value;
// document.getElementById("price_amount").innerHTML = price;