// 이미지를 동적으로 추가하는 함수
function addSliderItem(imageUrl, altText) {
    const dynamicSliderItem = document.getElementById('dynamicSliderItem');

    const sliderItem = document.createElement('div');
    sliderItem.classList.add('slider');

    const img = document.createElement('img');
    img.src = imageUrl;
    img.alt = altText;

    const span = document.createElement('span');
    span.innerText = '낙찰';  // 이미지 아래에 표시할 텍스트

    sliderItem.appendChild(img);
    sliderItem.appendChild(span);  // 텍스트를 이미지 아래로 이동

    dynamicSliderItem.appendChild(sliderItem);
}

// 예시: 슬라이더 아이템을 추가
addSliderItem('../static/asset/설윤.jpg', '이미지1의 설명');
addSliderItem('../static/asset/카리나.jpg', '이미지2의 설명');
addSliderItem('../static/asset/윈터.jpg', '이미지3의 설명');
