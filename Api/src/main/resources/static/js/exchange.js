var IMP = window.IMP;
IMP.init("imp16618334"); // 재발급 받은 뒤 숨겨버릴 예정

//var tmpLoginUser = sessionStorage.getItem("loginUser");
//var loginUser = JSON.parse(tmpLoginUser);
//var userEmail = loginUser.email;
//var userName = loginUser.name;
var amount = document.getElementById('inputPrice');

var userId;

var paymentResult = obj => {
    $.ajax({
        type : 'post',
        url : '/member/session-info',
        success : function(data, status, xhr) {
            userId = data.userId
            console.log("SuccessBong >>> ", userId, data)
        },
        error	: function(xhr, status, error) {
            alert('결제중 오류가 발생해서 Fucking Bong 합니다.')
        },
    })

    var pg_name = obj.value
    return IMP.request_pay({
        pg : pg_name,
        pay_method : 'card',
        merchant_uid: "picasso_" + new Date().getDate() + new Date().getMilliseconds(), // 계속 바뀌게 설정해야함. 결제에서 가장 중요한 정보 -> 이걸로 결제 하나하나를 식별함
        name : '피카소 포인트 환전',
        amount : amount.value
    }, response => {
        console.log(response);
        if (response.success) {
            alert("결제가 완료되었습니다.");
            postPayInfo(response.success, response);
        } else {
            alert("결제 실패입니다.");
            postPayInfo(response.success, response);
        }
    });
}

function postPayInfo(tof, response) {
    $.ajax({
        type : 'post',
        url : '/exchange/payment',
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data : JSON.stringify({
            "payResult" : tof,
            "userId" : userId,
            "merchantUid" : response.merchant_uid,
            "productName" : response.name,
            "pgProvider" : response.pg_provider,
            "paidAmount" : response.paid_amount,
            "payMethod" : response.pay_method
        })
    })
}