let ul = document.createElement('ul');
let container = document.querySelector('.container');
console.log(container);
let dataString = [];
let data = [
    {nome: 'OP1',  importo: 50.0, quantita: 21, operazione: 'b'},
    {nome: 'OP2',  importo: 100.0, quantita: 10, operazione: 's'},
    {nome: 'OP3',  importo: 10.0, quantita: 1, operazione: 's'},
    {nome: 'OP4',  importo: 12.0, quantita: 15, operazione: 'b'},
    {nome: 'OP5',  importo: 11.0, quantita: 3, operazione: 's'},
    {nome: 'OP6',  importo: 1.0, quantita: 4, operazione: 's'},
    {nome: 'OP7',  importo: 1.0, quantita: 3, operazione: 's'},
    {nome: 'OP8',  importo: 1.0, quantita: 3, operazione: 's'}
    ]


data.map(oper => { 
        let tot  = oper.importo * oper.quantita; 
        let str = 'Nome: ' + oper.nome + ' - Importo: ' + oper.importo + " - Quantita: " + oper.quantita + " - Operazione: " + oper.operazione + " - Totale: " + tot;
        dataString.push(str);
       
        return str;
    })

dataString.forEach(str =>{
    let li = document.createElement('li');
    let text = document.createTextNode(str);
    li.appendChild(text);

    ul.appendChild(li);
})

container.appendChild(ul);
