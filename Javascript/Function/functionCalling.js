function thank(name){
	console.log("Dear " + name + ", bless!");
}
thank("Michael");
console.log(typeof thank);

function greet(name, mark){
	console.log("Hello " + name +mark);
}
greet("Michael", "!");

console.log(" ");

function addPrint(a, b) {console.log(a + b); }
function add(a, b) {return a + b; }
const x = addPrint(2, 3);
const y = add(2, 3);
console.log(x, y);

console.log(" ");

function showTotal(n) {
	console.log("Total: " + n);
}
function double(n){
return n * 2;
}
showTotal(double(21));

console.log(" ");

function min(a, b){
let smallest = a;
if (a > b){
smallest = b;
}
return smallest;
}
console.log(min(0, -10));

console.log(" ");

function isEven(n){
if (n % 2 == 0){
return true;
}
else{
return false;
}
}

console.log(isEven(55));

console.log(" ");

const areaOfRectangle = (width, height) => width * height;
console.log(areaOfRectangle(4, 5));

console.log(" ");

//function types
//declartion
function add(a, b){
return a + b;
}

//an expression
const add2 = function(a, b) {
return a + b;
}

//arrow function
const add3 = (a, b) => a + b;

console.log(typeof add, typeof add2, typeof add3);


console.log(first());



