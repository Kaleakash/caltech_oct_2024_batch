let products = [];      // array of product 

let addProduct=function(){    
    let pidValue = document.getElementById("pid").value;
    let pnameValue = document.getElementById("pname").value;
    let priceValue = document.getElementById("price").value;

    // convert those value into objects. 
    let product = {pid:pidValue,pname:pnameValue,price:priceValue}
   
    products.push(product);

    document.getElementById("pid").value=""
    document.getElementById("pname").value=""
    document.getElementById("price").value=""
   // displayProduct();
}
let displayProduct = function() {
    
    for(let p of products){
    let pTag = document.createElement("p");                 // it create p tag 
let pTagValue = document.createTextNode(p.pid+" "+p.pname+" "+p.price)  // it create content 
        pTag.appendChild(pTagValue);                    // added content inside p tag   <p>Computer</p>
        document.getElementById("output").appendChild(pTag);    // adding p tag inside div tag
    }
}
let removeFirstProduct=function() {
    products.shift();
}
let removeLastProduct=function() {
    products.pop();
}