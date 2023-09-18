function previewImage(event) {
    const input = event.target;
    const preview = document.getElementById('preview');
    const imagePreviewDiv = document.getElementById('imagePreview');

    if (input.files && input.files[0]) {
        const reader = new FileReader();

        reader.onload = function (e) {
            preview.src = e.target.result;
            imagePreviewDiv.style.display = 'block';
        }
        reader.readAsDataURL(input.files[0]);
    }
}