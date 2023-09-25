var amount = document.getElementById('inputPrice');

var userId;
var bidResult = obj => {
    $.ajax({
        type : 'post',
        url : '/user/session-info',
        success : function(data, status, xhr) {
            userId = data.userId
        },
        error : function(xhr, status, error) {
            alert('입찰 불가')
        },
    })

    var price = document.getElementById("inputPrice").value;
    $.ajax({
        type: 'post',
        url: 'urlurlurl',
        dataType: 'json',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify({
            "bidPrice" : price
        })
    })
}

// function postPayInfo(tof, response) {
//     $.ajax({
//         type : 'post',
//         url : '넣고싶은 url 넣으시길',
//         dataType: 'json',
//         contentType: 'application/json; charset=utf-8',
//         data : JSON.stringify({
//             "payResult" : tof,
//             "userId" : userId,
//             "merchantUid" : response.merchant_uid,
//             "productName" : response.name,
//             "pgProvider" : response.pg_provider,
//             "paidAmount" : response.paid_amount
//         })
//     })
// }