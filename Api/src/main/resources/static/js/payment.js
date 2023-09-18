console.log("html & js connection complete!");

var IMP = window.IMP;
IMP.init("imp16618334");

function requestKakaoPay() {
    IMP.request_pay({
        pg : "kakaopay.TC0ONETIME",
        pay_method : 'card',
        merchant_uid: "09090902", // 계속 바뀌게 설정해야함. 결제에서 가장 중요한 정보 -> 이걸로 결제 하나하나를 식별함
        name : '당근 10kg',
        amount : 1004,
        buyer_email : 'Iamport@chai.finance',
        buyer_name : '아임포트 기술지원팀'
    }, function (rsp) { // callback
        if (rsp.success) {
            console.log(rsp);
        } else {
            console.log(rsp);
        }
    });
}

function requestTossPay() {
    IMP.request_pay({
        pg : "tosspay.tosstest",
        pay_method : 'card',
        merchant_uid: "1341",
        name : '당근 10kg',
        amount : 1004,
        buyer_email : 'Iamport@chai.finance',
        buyer_name : '아임포트 기술지원팀'
    }, function (rsp) { // callback -> rsp에
        if (rsp.success) {
            console.log(rsp);
        } else {
            console.log(rsp);
        }
    });
}

function requestKGInicis() {
    IMP.request_pay({
        pg : "html5_inicis.INIBillTst",
        pay_method : 'card',
        merchant_uid: "57854673",
        name : '당근 10kg',
        amount : 1004,
        buyer_email : 'Iamport@chai.finance',
        buyer_name : '아임포트 기술지원팀'
    }, function (rsp) { // callback
        if (rsp.success) {
            console.log(rsp);
        } else {
            console.log(rsp);
        }
    });
}