const lavida = document.getElementById("vida");
const elGolpe = document.getElementById("golpe");

let vida = 800;

function atacar() {

    let daño = Number(elGolpe.value);

    if (daño > 100) {
        alert("Ingrese un numero menor a 100");
        return;
    }

    vida = vida - daño;

    if (vida <= 0) {
        vida = 0;
        lavida.innerText = "¡¡¡¡GANASTE!!!!";
    } else {
        lavida.innerText = vida;
    }

}