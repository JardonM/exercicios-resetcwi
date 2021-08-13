//função para imprimir na tela
function imprimir(i) {
    console.log(i);
}

imprimir("---")

//Verifica se tem o mesmo nome
function mesmoNome(a, b) {
    temMesmoNome = a == b;
    return temMesmoNome;
}
let cwi = "CWI";
let reset = "Reset";
imprimir(mesmoNome(cwi, cwi))

imprimir("---")

//Verifica Maioridade
function maiorDeIdade(idade) {
    return idade >= 18;

}

imprimir(maiorDeIdade(16));

imprimir("---")

//calcula o valor final com juros
function valorComJuros(valor) {
    valorfinal = valor + (valor * (10 / 100));
    return valorfinal;
}

imprimir(valorComJuros(500))

imprimir("---")

//Media Aritmetica
function mediaAritmetica(itens) {
    var soma = 0;
    for (let i = 0; i < itens.length; i++) {
        soma += itens[i];
    }
    let media = soma / itens.length;
    return media;
}

imprimir(mediaAritmetica([1, 4, 10]))

imprimir("---")

//Margem bruta
function margemBruta(vendasLiq, custosProd) {
    lucroBruto = vendasLiq - custosProd;
    return (lucroBruto / vendasLiq) * 100;
}
imprimir(margemBruta(528459.11, 632501.87))