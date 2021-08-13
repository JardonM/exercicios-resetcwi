//Calculo de IMC, grau de obesidade e classificação
let peso, altura, imc, grauObesidade, classificação;
peso = 75;
altura = 1.75;
imc = peso / (altura * altura);

if (imc < 18.5) {
    classificação = "Magreza";
} else if (imc >= 18.5 && imc < 25) {
    classificação = "Normal";
} else if (imc >= 25 && imc < 30) {
    grauObesidade = 1;
    classificação = "Sobrepeso";
} else if (imc >= 30 && imc < 40) {
    grauObesidade = 2;
    classificação = "Obesidade";
} else if (imc >= 40) {
    grauObesidade = 3;
    classificação = "Obesidade grave";
}

console.log("Seu IMC é de ", imc.toFixed(2), " e a sua classificação é ", classificação, ".");
if (grauObesidade > 0) {
    console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
}
if (grauObesidade == 3) {
    console.log("É importante procurar um médico para avaliar sua saúde.");
}