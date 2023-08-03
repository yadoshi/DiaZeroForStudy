function getDataHoraAtual() {

    const data = new Date();
    const dia = String(data.getDate()).padStart(2, '0');
    const mes = String(data.getMonth() + 1).padStart(2, '0');
    const ano = data.getFullYear();
    const horas = String(data.getHours()).padStart(2, '0');
    const minutos = String(data.getMinutes()).padStart(2, '0');
    const segundos = String(data.getSeconds()).padStart(2, '0');


    var all = dia + "/" + mes + "/" + ano + " " + horas + ":" + minutos + ":" + segundos
console.log(all)

var inputx = document.getElementById("dataIncidente")
var inputy = document.getElementById("status")
inputx.setAttribute("value", all)
inputy.setAttribute("value", "Aberto")

var nome = document.getElementById("nome")
var desc = document.getElementById("descricao")

if (nome.value <= 3 || desc.value <= 5){
    alert("Os campos devem atender o tamanho mínimo de 3 para o nome e 5 para a descrição")
}else document.getElementById("myForm").submit()

}