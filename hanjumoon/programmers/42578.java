package hanjumoon.programmers;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578
class Solution {
  private static BinaryOperator<Long> getCasesByCount = (sum, count) -> sum * (count + 1);

  public int solution(String[][] clothes) {
    Long totalCase = Arrays.stream(clothes)
        .map(test -> test[1])
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .values().stream()
        .collect(Collectors.reducing(1L, getCasesByCount));

    return totalCase.intValue() - 1; // -1은 다 안 입는 경우의 수
  }
}