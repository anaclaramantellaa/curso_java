function construirTabela(){
    let tabuada = document.querySelector("#tabuada tbody");
    let valorA =  parseInt(document.querySelector('#valorA').value);

    tabuada.innerHTML = "";

    for (let valorB = 1; valorB<=10; valorB++){
        let resultado = valorA * valorB;

        let conteudo =  `<td> ${valorA} </td>
                        <td> X </td>
                        <td> ${valorB}</td>
                        <td> = </td>
                        <td> ${resultado} </td>`

        let linha = document.createElement('tr');
        linha.innerHTML = conteudo;
        tabuada.append(linha);
    }
}

document.querySelector(".btn").addEventListener('click', construirTabela)