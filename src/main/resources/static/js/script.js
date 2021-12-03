
const map = L.map('map').setView([-16.7253029, -49.2559535], 13);
const ajaxRequest = new XMLHttpRequest();
const getIPD = ajaxRequest.open("GET", "http://localhost:8080", true);



L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="#">OpenStreetMap</a> contributors'
}).addTo(map);

L.marker([-16.7253029, -49.2559535]).addTo(map)
    .bindPopup('Jardim Botânico de Goiania')
    .openPopup();


function getIP(){
    let ipdados = {
        ip: '',
        getCity: 'Goiânia'
    }

    const valorIP = document.getElementById("ip").value;
    console.log(valorIP + ipdados.ip);
    console.log(getIPD);
}


