// Entrada
// Se va a ingresar una cadena conformada por números del 0 al 9 (cadena junta, sin espacios, sin comas, ni decimales) se pueden colocar números repetidos.La longitud de la cadena debe ser mayor a 0 y menor a 100.

// Salida
// Como salida se obtendrá la cadena ordenada de mayor a menor (junta, sin espacios o comas).

const sortSolution = (str) => str.split("").sort().reverse().join("");

// Tests

["3245432", "123456789", "224455991"].forEach((input) =>
  console.log(sortSolution(input))
);
