const ajaxRequest = new XMLHttpRequest();
const getIPD = ajaxRequest.open("GET", "http://localhost:8080", true);

function getIP(dados){
    if (dados.long1 == null || dados.lat1 == null){
        dados.lat1 = "-16.7253029";
        dados.long1 = "-49.2559535";
    }

    const map = L.map('map').setView([dados.lat1, dados.long1], 13);
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="#">OpenStreetMap</a> contributors'
    }).addTo(map);
    L.marker([dados.lat1, dados.long1]).addTo(map)
        .bindPopup('IP: '+dados.ip1 +'<br>Cidade:'+ dados.cidade1+'<br>Estado/ País:'+dados.estado1 +'/ '+dados.pais1)
        .openPopup();
}







