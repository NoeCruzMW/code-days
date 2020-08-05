/**
 * Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit,
continue reducing in this way until a single-digit number is produced. 
This is only applicable to the natural numbers.
 */

function digital_root(n) {
  if (n < 10) return n;
  return digital_root(
    `${n}`.split("").reduce((sum, i) => parseInt(sum) + parseInt(i))
  );
}

console.log(digital_root(16)); // 7
console.log(digital_root(456)); // 6
