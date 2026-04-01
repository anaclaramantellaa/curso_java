const btnAdicionar = document.querySelector("#btnAdicionar"); 
//cria uma variável constante
//document = docuemento html
//querySelector = selecionar qualquer item da tela, com indicação
//#btnAdicionar = bptão com id = "adicionar"

btnAdicionar.addEventListener("click", function(){
//addEventlistener = ouvinte de ações na tela sobre o botão, recebe 2 argumentos... 1 ação e outra função.
    const item = document.createElement("li");
    //crie um novo elemento html(li) e insere na variável
    const caixaValor =document.querySelector('#minhaCaixa').value;
    //seleciona o elemento #minhaCaixa, e insere na variável
    const novaTarefa = document.createTextNode(caixaValor);
    //adiciona o texto do input na variável
    item.appendChild(novaTarefa);
    //appendChild = insere o texto na li

    if(caixaValor === ""){
    //verifica se o input está vazio ou não
    alert("Você deve informar uma nova tarefa para adicionar");
    //mostra uma caixa de aviso em tela!
}else {
    document.querySelector('#tarefas').appendChild(item);
    //insere novo elemento texto no "li"
}
    document.querySelector("#minhaCaixa").value = "";
    //zera, apaga o valor do input digitado

    /*---------------------------------------------- */
    //botão "Apagar"
    const span = document.createElement("span");
    //cria um novo elemento <span>
    const icon = document.createTextNode("\u00d7");
    //cria e adiciona um "caracter especial" texto no html, este código refere-se a um "X"
    span.className = "fechar";
    //adiciona a classe "Fechar" a essa span
    span.appendChild(icon);
    //adiciona o "icon" texto no span
    item.appendChild(span);
    //insere a span na "li" criada

    /*---------------------------------------------- */
    //deletar uma tarefa
    const close = document.querySelectorAll(".fechar");
    //captura "todas" as spans com a classe fechar

    /*---------------------------------------------- */
    //varre a lista de spans e verifica uma por uma, qual foi criada
    for (let i = 0; i < close.length; i++){
    //estrutura de repetição que inicia  a zero e vai até o comprimento total de close
        close[i].addEventListener("click", function(){
            //a cada elemento do close que for clicado será executado 
            const item = this.parentElement;
            //captura a tag pai dessa "this" tag span, no caso a li
        item.style.display = "none";
        //muda o display da li para "none" fazendo ela sumir
        })
    }
})
//marcar como "tarefa feita"
const list = document.querySelector("ul"); //captura a lista inteira
//ao clicar na lista a minha função recebe um evento
list.addEventListener("click", function(ev){
//se o nome do item que eu cliquei na lista foi "li"
    if(ev.target.nodeName === "li"){ //verifica se o item é li
        ev.target.classList.toogle("checado");
        //adiciona nesse elemento a classe "checked"
    }

});