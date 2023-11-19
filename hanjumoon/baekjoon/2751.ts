// https://www.acmicpc.net/problem/2751
{
  type index = number;
  const COMPARATOR = (a: number, b: number) => a - b; // byAsc

  const solution = (numbers: number[]) => mergeSort(numbers);

  const mergeSort = (numbers: number[]): number[] => {
    if (numbers.length < 2) {
      return numbers;
    }

    const pivot = Math.floor(numbers.length / 2);
    const left = mergeSort(numbers.slice(0, pivot));
    const right = mergeSort(numbers.slice(pivot, numbers.length));

    return mergeByOrder(left, right);
  };

  const mergeByOrder = (left: number[], right: number[]) => {
    const merged: number[] = [];
    let left_first: index = 0;
    let right_first: index = 0;

    while (left_first < left.length && right_first < right.length) {
      if (COMPARATOR(left[left_first], right[right_first]) <= 0) {
        merged.push(left[left_first++]);
      } else {
        merged.push(right[right_first++]);
      }
    }

    return merged.concat(left.slice(left_first), right.slice(right_first));
  };

  {
    const [, ...lines]: string[] = require("fs")
      .readFileSync("/dev/stdin")
      .toString()
      .trim()
      .split("\n");
    const numbers: number[] = lines.map((number: string) => Number(number));

    process.stdout.write(solution(numbers).join("\n"));
    process.exit(0);
    // console.log(solution([5, 4, 3, 2, 1]));
  }
}
