function validateFileExtension(fileInput) {
    const allowedExtensions = ['jpg', 'jpeg', 'png'];
    const filenameDisplayElement = document.getElementById('filename');

    if (fileInput.files.length > 0) {
        const fileName = fileInput.files[0].name;
        const fileExtension = fileName.split('.').pop().toLowerCase();

        if (!allowedExtensions.includes(fileExtension)) {
            alert("프로필 사진은 .jpg, .jpeg 또는 .png 확장자만 허용됩니다.");
            fileInput.value = ''; // 파일 입력을 초기화합니다.
            filenameDisplayElement.textContent = '';
        } else {
            filenameDisplayElement.textContent = fileName;
        }
    } else {
        filenameDisplayElement.textContent = '';
    }
}