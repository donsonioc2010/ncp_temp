var IMP = window.IMP;
IMP.init("imp16618334"); // 재발급 받은 뒤 숨겨버릴 예정

//var tmpLoginUser = sessionStorage.getItem("loginUser");
//var loginUser = JSON.parse(tmpLoginUser);
//var userEmail = loginUser.email;
//var userName = loginUser.name;
var amount = document.getElementById('inputPrice');

var requestPayment = pg_name  => {
    return IMP.request_pay({
        pg : pg_name,
        pay_method : 'card',
        merchant_uid: "picasso_" + new Date().getDate() + new Date().getMilliseconds(), // 계속 바뀌게 설정해야함. 결제에서 가장 중요한 정보 -> 이걸로 결제 하나하나를 식별함
        name : '피카소 포인트 환전',
        amount : amount.value,
        buyer_email : 'asdf',
        buyer_name : 'asdf'
    });
}

var paymentResult = obj => {
    var pg_name = obj.value
    return IMP.request_pay({
        pg : pg_name,
        pay_method : 'card',
        merchant_uid: "picasso_" + new Date().getDate() + new Date().getMilliseconds(), // 계속 바뀌게 설정해야함. 결제에서 가장 중요한 정보 -> 이걸로 결제 하나하나를 식별함
        name : '피카소 포인트 환전',
        amount : amount.value,
        buyer_email : 'asdf',
        buyer_name : 'asdf'
    }, response => {
        console.log(response);
        if (response.success) {
            alert("결제가 완료되었습니다.");
            console.log(requestPayment(pg_name));
            postPayInfo(response.success, response);
        } else {
            alert("결제 실패입니다.");
            console.log(requestPayment(pg_name));
            postPayInfo(response.success, response);
        }
    });
}

function postPayInfo(tof, response) {
    $.ajax({
        type : 'post',
        url : '/payment-test',
        data : {
            "pay_result" : tof,
            "buyer_name" : response.buyer_name,
            "buyer_email" : response.buyer_email,
            "merchant_uid" : response.merchant_uid,
            "product_name" : response.name,
            "pg_provider" : response.pg_provider,
            "paid_amount" : response.paid_amount,
            "pay_method" : response.pay_method
        },
    })
}