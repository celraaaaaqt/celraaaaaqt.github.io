document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const errorMessage = document.getElementById('errorMessage');

    
    const validUsername = 'Natasha';
    const validPassword = 'Discallar';

    if (username === validUsername && password === validPassword) {
        
        window.location.href = 'backend.html';
    } else {
        errorMessage.textContent = 'Mali yung password Tashing!';
        errorMessage.style.display = 'block';
    }
});


