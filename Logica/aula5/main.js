//Verifica se os nomes são iguais
let mesmoNome, nomeDoFulano, nomeDoBeltrano;
nomeDoFulano = "Fulano";
nomeDoBeltrano = "Beltrano";

mesmoNome = nomeDoFulano == nomeDoBeltrano;


//Verifica maioridade
let idade = 25;
let maiorDeIdade = (idade >= 18);


//Calculo de juros
let boleto, valorComJuros, juros;
boleto = 500;
juros = boleto * (10 / 100);
valorComJuros = boleto + juros;
console.log(valorComJuros);


//Media Aritmética
let item1, item2, item3, item4, item5;
let media = (item1 + item2 + item3 + item4 + item5) / 5;


//Calculo de lucro bruto e margem bruta
let lucroBruto, vendasLiq, custosProd;
vendasLiq = 20000;
custosProd = 10000;
lucroBruto = vendasLiq - custosProd;
console.log(lucroBruto);
let margemBruta = (lucroBruto / vendasLiq) * 100;
console.log(margemBruta);


//Alterações de valores de uma mesma variavel repetidas vezes.
let saldoConta = 1000;
saldoConta -= 99.9;
saldoConta += 2500;
saldoConta -= 0.1;
let valorAC = saldoConta * (25 / 100);
saldoConta -= valorAC;
saldoConta -= (saldoConta) / 2;
console.log(saldoConta);