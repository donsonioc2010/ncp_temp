console.log("html & js connection complete!");

var IMP = window.IMP;
IMP.init("imp16618334");

function requestKakaoPay() {
    IMP.request_pay({
        pg : "kakaopay.TC0ONETIME",
        pay_method : 'card',
        merchant_uid: "52300234", // 계속 바뀌게 설정해야함
        name : '당근 10kg',
        amount : 1004,
        buyer_email : 'Iamport@chai.finance',
        buyer_name : '아임포트 기술지원팀',
        buyer_tel : '010-1234-5678',
        buyer_addr : '서울특별시 강남구 삼성동',
        buyer_postcode : '123-456'
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
        merchant_uid: "52300234", // 계속 바뀌게 설정해야함
        name : '당근 10kg',
        amount : 1004,
        buyer_email : 'Iamport@chai.finance',
        buyer_name : '아임포트 기술지원팀',
        buyer_tel : '010-1234-5678',
        buyer_addr : '서울특별시 강남구 삼성동',
        buyer_postcode : '123-456'
    }, function (rsp) { // callback
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
        merchant_uid: "52300234", // 계속 바뀌게 설정해야함
        name : '당근 10kg',
        amount : 1004,
        buyer_email : 'Iamport@chai.finance',
        buyer_name : '아임포트 기술지원팀',
        buyer_tel : '010-1234-5678',
        buyer_addr : '서울특별시 강남구 삼성동',
        buyer_postcode : '123-456'
    }, function (rsp) { // callback
        if (rsp.success) {
            console.log(rsp);
        } else {
            console.log(rsp);
        }
    });
}