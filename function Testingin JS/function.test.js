const {add, multiply} = require("./function.js");

test("add two numbers", () => {
	let numOne = 2;
	let numTwo = 5;
	let ans = add(numOne, numTwo)
	expect(ans).toBe(7);
});


test("multiply two numbers", () => {
	let numberOne = 2;
	let numberTwo = 5;
	let ans = multiply(numberOne, numberTwo)
	expect(ans).toBe(10);
});