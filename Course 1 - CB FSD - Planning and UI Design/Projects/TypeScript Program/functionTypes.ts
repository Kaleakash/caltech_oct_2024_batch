// function with number of parameter 
function add(a,b){          // data type can be any type 
    console.log(a)
    console.log(b)
}
add(10,20)
add("A","B")
//add(10)
//add();
function addNumber(a:number,b:number){      // data type is number type consider. 
    console.log(a)
    console.log(b)
}
addNumber(10,20);
addNumber(10.10,20.20)
//addNumber("A","B")

// info function no return any type of value. 
function info(): void {
    console.log("info function")
}
info();

// function with return string value 
function sayHello(name:string):string {
    return "Welcome user "+name;
}
let msg:string = sayHello("Steven");

// function with any return type 
function getInfo() :any {
    //return 100;
    //return true;
    //return "Welcome"
}

