const inputP = document.querySelector('.inputPrice') //결제 개월 수 입력받는 inputhidden
const amount = document.querySelector('.amount');
const amountV = document.querySelector('.amountValue');

//결제 가격
function inputPrice(e){
    const paynum = (e.value);
    inputP.value = e.value;
    amount.textContent = "결제 금액 : " + paynum + "원";
    amountV.value = paynum;
}

var price = inputP.value;
document.getElementById("price_amount").innerHTML = price;