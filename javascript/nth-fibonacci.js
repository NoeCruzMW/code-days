// AlgoExpert
//   The Fibonacci sequence is defined as follows: the first number of the sequence
//   is 0, the second number is 1, and the nth number is the sum of the (n - 1)th
//   and (n - 2)th numbers. Write a function that takes in an integer
//   n and returns the nth Fibonacci number.
//Iterative form
function getNthFib(n) {
    let init = [0, 1];
    if (n < 3) return init[n - 1];

    for (let i = 0; i < n - 2; i++) {
        let nth = init[0] + init[1];
        init[0] = init[1];
        init[1] = nth;
    }
    return init[1];
}

console.log(getNthFib(6));