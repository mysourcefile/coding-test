// https://school.programmers.co.kr/learn/courses/30/lessons/64065
{
  const solution = (string: string) => {
    const result = toNumberArrays(string)
      .sort(bySizeAsc)
      .reduce((result, numbers) => {
        numbers.forEach(result.add, result);
        return result;
      }, new Set<number>());

    return [...result];
  };

  const toNumberArrays = (string: string): number[][] =>
    string
      .replace("{{", "")
      .replace("}}", "")
      .split("},{")
      .map((string) => string.split(",").map((number) => Number(number)));

  const bySizeAsc = (a: number[], b: number[]) => a.length - b.length;

  console.log(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
  console.log(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
  console.log(solution("{{20,111},{111"));
  console.log(solution("{{123}}"));
  console.log(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
}
