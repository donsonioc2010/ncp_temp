 function resizeImage(imageUrl, maxWidth, maxHeight) {
    return new Promise((resolve, reject) => {
    const img = new Image();
    img.crossOrigin = 'Anonymous';  // Enable cross-origin resource sharing

    img.onload = function () {
    const canvas = document.createElement('canvas');
    const ctx = canvas.getContext('2d');

    let width = img.width;
    let height = img.height;

    // Calculate new dimensions maintaining aspect ratio
    if (width > height) {
    if (width > maxWidth) {
    height *= maxWidth / width;
    width = maxWidth;
}
} else {
    if (height > maxHeight) {
    width *= maxHeight / height;
    height = maxHeight;
}
}

    canvas.width = width;
    canvas.height = height;
    ctx.drawImage(img, 0, 0, width, height);

    const resizedImageUrl = canvas.toDataURL('image/jpeg');
    resolve(resizedImageUrl);
};

    img.onerror = function () {
    reject(new Error('Failed to load image.'));
};

    img.src = imageUrl;
});
}

// TODO: 그림의 사이즈는 912 * 600으로 리사이징한다

    // 리사이즈된 이미지를 표시하는 함수
    async function displayResizedImage() {
    const originalImageUrl = '../static/asset/한소희.jpeg';
    const maxWidth = 300; // 최대 너비
    const maxHeight = 300; // 최대 높이

    try {
    const resizedImageUrl = await resizeImage(originalImageUrl, maxWidth, maxHeight);
    const resizedImageElement = document.getElementById('resizedImage');
    resizedImageElement.src = resizedImageUrl;
} catch (error) {
    console.error('Error resizing image:', error);
}
}

