let nomeCompleto, apelido, idade, dataNasc, localNasc, altura, trabalhando;
nomeCompleto = "Jardon Moises Martins";
apelido = "Jardon";
idade = 25;
dataNasc = "15/05/1996";
localNasc = "Novo Hamburgo";
altura = "1,75";
trabalhando = true;

let apresentação = "Meu nome é " + nomeCompleto + " (sou conhecido[a] como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNasc + ", na cidade de " + localNasc + ". Tenho " + altura + "m de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregado") + ".";
console.log(apresentação);