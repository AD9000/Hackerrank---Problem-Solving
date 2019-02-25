// Author: Atharv Damle
// To calculate the scores by comparing two lists (or arrays)
// Full Question: https://www.hackerrank.com/challenges/compare-the-triplets/problem

static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

  int sc[] = new int[2];
  List<Integer> scores = new ArrayList<Integer>();

  while (!a.isEmpty())
  {
      int one = a.remove(0);
      int two = b.remove(0);
      if (one > two)
      {
          sc[0]++;
      }
      else if (two > one)
      {
          sc[1]++;
      }
  }
  scores.add(sc[0]);
  scores.add(sc[1]);

  return scores;
}
