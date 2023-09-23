function changePage(page) {
    // Remove 'active' class from all pages
    const pageItems = document.querySelectorAll('.page-item');
    pageItems.forEach(item => {
        item.classList.remove('active');
    });

    // Add 'active' class to the clicked page
    const clickedPage = document.querySelector(`li.page-item:nth-child(${page + 1})`);
    if (clickedPage) {
        clickedPage.classList.add('active');
    }
}

function changePage(action) {
    const pageSize = 8;
    const currentPage = parseInt(new URLSearchParams(window.location.search).get('page')) || 0;
    const currentStatus = new URLSearchParams(window.location.search).get('status') || 'BIDDING';
    let nextPage = currentPage;

    if (action === 'Previous') {
        if (currentPage > 0) {
            nextPage = currentPage - 1;
        }
    } else if (action === 'Next') {
        nextPage = currentPage + 1;
    } else {
        nextPage = action;
    }

    const nextPageUrl = `/pictures/list?page=${nextPage}&pageSize=${pageSize}&status=${currentStatus}`;
    window.location.href = nextPageUrl;
}