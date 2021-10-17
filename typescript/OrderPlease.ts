export function order(words: string): string {
  const finalString: string[] = ["","","","","","","","","",""];
  words.split(" ").forEach((i) => {
    const match = i.match("[0-9]+");
    if (match != null && match[0] != null)
      finalString.splice(parseInt(match[0]), 1, i);
  });
  return finalString.filter(i=>i!="").join(" ");
}

console.log(order("is2 Thi1s T4est 3a"));
console.log(order("4of Fo1r pe6ople g3ood th5e the2"));
console.log(order(""));
