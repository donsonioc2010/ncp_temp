var IMP = window.IMP;
IMP.init("imp16618334"); // 재발급 받은 뒤 숨겨버릴 예정

var requestPayment = pg_name  => {
    return IMP.request_pay({
        pg : pg_name,
        pay_method : 'card',
        merchant_uid: "picasso_" + new Date().getMilliseconds(), // 계속 바뀌게 설정해야함. 결제에서 가장 중요한 정보 -> 이걸로 결제 하나하나를 식별함
        name : 'asdfasdf',
        amount : 1004,
        buyer_email : 'Iamport@chai.finance',
        buyer_name : '아임포트 기술지원팀'
    });
}

var paymentResult = obj => {
    var pg_name = obj.value
    return (requestPayment(pg_name), function(response) {
        if (response.success) {
            var msg = "결제 완료";
            msg += '고유ID : ' + response.imp_uid;
            msg += '// 상점 거래ID : ' + response.merchant_uid;
            msg += '// 결제 금액 : ' + response.paid_amount;
            msg += '// 카드 승인번호 : ' + response.apply_num;

            postPayInfo(true);
            console.log(msg);
        } else {
            var msg = "결제 실패"
            msg += "에러 내용" + response.error_msg;
            postPayInfo(false);
            console.log(msg);
        }
    });
}

function postPayInfo(tof, rsp) {
    $.ajax({
        type : 'post',
        url : '/pay',
        data : {
            "pay_result" : tof,
            "buyer_name" : rsp.buyer_name,
            "buyer_email" : rsp.buyer_email,
            "merchant_uid" : rsp.merchant_uid,
            "product_name" : rsp.name,
            "pg_provider" : rsp.pg_provider,
            "amount" : rsp.paid_amount,
            "pay_method" : rsp.pay_method
        },
    })
}