// https://school.programmers.co.kr/learn/courses/30/lessons/42578
{
  type Name = unknown;
  type Type = string;

  const solution = (clothes: [Name, Type][]) => {
    const count_by_type = clothes.reduce(
      getCountByType,
      new Map<Type, number>()
    );

    return [...count_by_type.values()].reduce(getCasesByCount, 1) - 1; // -1은 다 안 입는 경우의 수
  };

  const getCountByType = (map: Map<Type, number>, [, type]: [Name, Type]) => {
    map.set(type, (map.get(type) ?? 0) + 1); // 1은 안 입는 경우의 수
    return map;
  };

  const getCasesByCount = (sum: number, count: number) => (sum *= count + 1);
}
