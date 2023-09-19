function handleImageUpload(event) {
    const input = event.target;
    const resizedPreview = document.getElementById('resizedPreview');
    const imagePreviewDiv = document.getElementById('imagePreview');

    if (input.files && input.files[0]) {
        const reader = new FileReader();

        reader.onload = function (e) {
            const img = new Image();
            img.src = e.target.result;

            img.onload = function () {
                const canvas = document.createElement('canvas');
                const ctx = canvas.getContext('2d');
                const maxWidth = 500;
                const maxHeight = 500;

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

                // Display resized image preview
                resizedPreview.src = canvas.toDataURL('image/jpeg');
                imagePreviewDiv.style.display = 'block';
            };
        };
        reader.readAsDataURL(input.files[0]);
    }
}

