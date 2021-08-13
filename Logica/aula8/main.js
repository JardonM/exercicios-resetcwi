//Mostrar todos os componentes do array
var meuArray = [1, 2, 3, 4, 5];
for (var i = 0; i < meuArray.length; i++) {
    console.log(meuArray[i]);
}

//Media aritmética dos valores do array
var segundoArray = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55];
var somaArray = 0;
var contador = 0;
do {
    somaArray += segundoArray[contador]
    contador++;
} while (contador < segundoArray.length)

var media = somaArray / segundoArray.length;

console.log(media)

//Verificação de valores dentro de um array
let nome = "Jardon";
let nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia",
    "Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia",
    "Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina",
    "Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia",
    "Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda",
    "Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"
]

for (let i = 0; i < nomesComuns.length; i++) {
    if (nome == nomesComuns[i]) {
        console.log("É, nome comum :P")
        break;
    } else {
        console.log("Diferentão, hein? XD")
        break;
    }
}