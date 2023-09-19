function displayImage(imageUrl) {
    const imageContainer = document.getElementById('imageContainer');
    const imageElement = document.createElement('img');
    imageElement.src = imageUrl;
    imageElement.alt = '이미지';
    imageContainer.appendChild(imageElement);
}

function getImageUrlFromFilename(filename) {
    const baseUrl = 'http://ixsvvzqnjzre19609214.cdn.ntruss.com/local/paint/';
    const queryParams = 'type=f&w=300&h=400';
    return `${baseUrl}${filename}?${queryParams}`;
}

// Example filename from the list
const filenameFromList = '1f79a563-ff64-4ac5-a35c-f175afd55ef2.jpeg';
const imageUrl = getImageUrlFromFilename(filenameFromList);
displayImage(imageUrl);