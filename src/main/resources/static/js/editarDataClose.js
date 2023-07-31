function getDataHoraAtual(id) {

    const data = new Date();
    const dia = String(data.getDate()).padStart(2, '0');
    const mes = String(data.getMonth() + 1).padStart(2, '0');
    const ano = data.getFullYear();
    const horas = String(data.getHours()).padStart(2, '0');
    const minutos = String(data.getMinutes()).padStart(2, '0');
    const segundos = String(data.getSeconds()).padStart(2, '0');


    var all = dia + "/" + mes + "/" + ano + " " + horas + ":" + minutos + ":" + segundos
    var caminho = "/fechar/" + id



    var form = document.getElementById("fechar")
    form.setAttribute("action", caminho)

    var input = document.getElementById("dataIncidente")
    input.setAttribute("value", all)


    document.getElementById("fechar").submit()

}