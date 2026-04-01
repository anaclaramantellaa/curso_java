const cor = document.querySelector('body');
const btnf = document.querySelector('#face');  /* pegar o botão do face */
const btng = document.querySelector('#gith');  /* pegar o botão do fithub */ 
const btnd = document.querySelector('#disc');  /* pegar o botão do discord */
const btni = document.querySelector('#inst');  /* pegar o botão do instagram */
const btny = document.querySelector('#yout');  /* pegar o botão do youtube */

function mudarCor(op){/*  */
    switch(op){
        case 1: cor.style.background = "darkblue url('facebook.png') no-repeat top"; break;
        case 2: cor.style.background = "#171515 url('github.png') no-repeat top";break;
        case 3: cor.style.background = "#7289da url('discord.png') no-repeat top";break;
        case 4: cor.style.background = "orangered url('instagram.png') no-repeat top";break;
        case 5: cor.style.background = "red url('youtube.png') no-repeat top";break;
 // "cor imagem nãoRepetir posicaoTop"   Aqui iremos alterar a cor de fundo e inserir uma imagem
    }
}
function reset(){
    cor.style.background = 'linear-gradient(315deg, #fff, lightblue)';
    // aqui estaremos apagando a imagem da tela e tb, voltando a cor inicial do fundo.
}

btnf.addEventListener('mouseleave', reset);  //retirando o mouse de cima do botão acionará o reset
btnd.addEventListener('mouseleave', reset);
btng.addEventListener('mouseleave', reset);
btni.addEventListener('mouseleave', reset);
btny.addEventListener('mouseleave', reset);

function trocar(){
    window.location.href = "icones.html";  //chamada de uma nova página.
}