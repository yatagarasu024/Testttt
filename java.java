function showMessage() {
    const messageDiv = document.getElementById('message');
    messageDiv.style.display = 'block';

    for (let i = 0; i < 20; i++) {
        const star = document.createElement('div');
        star.className = 'star';
        star.innerHTML = '★';
        star.style.top = `${Math.random() * 100}%`;
        star.style.left = `${Math.random() * 100}%`;
        star.style.color = getRandomColor();
        messageDiv.appendChild(star);
    }
}

function getRandomColor() {
    const colors = ['gold', '#ff69b4', '#00ffff', 'red', 'blue', 'green'];
    return colors[Math.floor(Math.random() * colors.length)];
}