const range = 12;

for(let count = 1;count <= range;count++) {

for(let counter = 1;counter <= range;counter++) {
	let multiply = counter * count;
	process.stdout.write(`${counter} X ${count} = ${multiply}\t`);}
console.log("\n")
}

