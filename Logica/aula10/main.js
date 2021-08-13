let colaboradores = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison'];
let idades = [69, 66, 58, 61, 60, 64, 59, 55];
let temposDeTrabalho = [31, 29, 30, 26, 25, 24, 26, 29];

function verificarAposentadoria(nome) {
    let aposenta;
    for (let i = 0; i < colaboradores.length; i++) {
        if (nome == colaboradores[i]) {
            if ((idades[i] >= 65) || (temposDeTrabalho[i] >= 30) || ((idades[i] >= 60) && (temposDeTrabalho[i] >= 25))) {
                aposenta = true;
                break;
            } else {
                aposenta = false;
                break;
            }
        }
    }
    if (aposenta == true) {
        console.log("Parabéns, já pode sair de férias eternas :)");
    } else if (aposenta == false) {
        console.log("Infelizmente para você, ainda falta um tempo :(");
    } else {
        console.log("Colaborador inválido :|")
    }



}

verificarAposentadoria('Agripino');