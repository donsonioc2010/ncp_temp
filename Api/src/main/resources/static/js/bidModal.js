const inputP = document.getElementById('inputPrice')
const priceAmount = document.getElementById('price_amount')

//결제 가격
function inputPrice(e){
    const bidNum = (e.value);
    inputP.value = e.value;
    priceAmount.textContent = "입찰 금액 : " + bidNum + "원";
}
