class Employee {
    id:number;
    fname:string;
    salary:number;
    constructor() {
        console.log("employee class object created..")
        this.id=100;
        this.fname="Steven";
        this.salary=45000;
    }
    display() : void {
        console.log("display function")
        console.log("id is "+this.id)
        console.log("name is "+this.fname)
        console.log("salary is "+this.salary)
    }
}

let emp1 = new Employee();
emp1.display();