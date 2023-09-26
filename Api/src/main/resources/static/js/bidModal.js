const inputP = document.getElementById('inputPrice')
const priceAmount = document.getElementById('price_amount')

//결제 가격
function inputPrice(e){
    const bidNum = (e.value);
    inputP.value = e.value;
    priceAmount.textContent = "입찰 금액 : " + bidNum + "원";
}


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

const bidInput = document.getElementById("bidInput")
const incrementAmountVal= parseInt(document.getElementById('incrementAmount').value)
const nowPictureAmountVal = parseInt(document.getElementById('nowPictureAmount').value)
const userPointValue = parseInt(document.getElementById('userPoint').value)

function validateNumericInput(event) {
    const key = event.key;
    const allowedKeys = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'Backspace', 'ArrowLeft', 'ArrowRight', 'ArrowUp', 'ArrowDown', 'Delete', 'Tab'];

    if (!allowedKeys.includes(key)) {
        event.preventDefault();
    }
}


function blurInputValue(){
    // 입력된 값에서 숫자가 아닌 문자 제거하기
    const inputValue = bidInput.value.replace(/[^0-9]/g, '');
    // 숫자가 아닌 문자가 제거된 값 다시 설정
    bidInput.value = inputValue;
}

bidInput.addEventListener('keydown', validateNumericInput);
bidInput.addEventListener('blur', blurInputValue);


const bidButton  = document.getElementById('bidButton')
function bidProcess() {
    let minPictureBidAmount = nowPictureAmountVal+incrementAmountVal
    if(parseInt(bidInput.value) < minPictureBidAmount){
        alert('입찰 최소 금액은 '+minPictureBidAmount+'원 입니다' )
        return false
    }

    if(userPointValue < parseInt(bidInput.value)) {
        alert('현재 보유 포인트가 입찰 가능 포인트 보다 적습니다.\n충전후 다시 시도해 주세요.')
        return false
    }


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
bidButton.addEventListener('click', bidProcess);
