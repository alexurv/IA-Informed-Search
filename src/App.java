import DataStructures.State;
import Heuristics.MinMin;
import SearchAlgorithms.AStarSearch;
import SearchAlgorithms.BestFirstSearch;
import SearchAlgorithms.SearchAlgorithm;

import java.util.List;

public class App {
    public static void main(String[] args){
        int[][] map = { {1, 0, -1, 1, 3, 2, 3, 4, 3, 1},
                        {2, 1, -1, 2, 4, 2, 2, 4, 2, 2},
                        {5, 3, -1, 2, 3, 2, -1, 3, 3, 3},
                        {3, 3, 1, 3, 4, 3, -1, 1, 2, 2},
                        {2, 2, 2, 3, 6, 4, -1, 1, 2, 1},
                        {-1, -1, -1, -1, 3, 3, -1, 0, 2, -1},
                        {-1, -1, -1, -1, 2, 4, -1, 2, 2, -1},
                        {2, 3, 4, 3, 1, 3, -1, 3, 2, -1},
                        {3, 5, 6, 5, 2, 3, -1, 5, 3, -1},
                        {5, 6, 7, 6, 4, 4, -1, 6, 4, 5}};

        SearchAlgorithm search = new BestFirstSearch();

        State ini = new State(0, 0, map[0][0]);
        State fi = new State(4, 9, map[4][9]);

        List<State> result = search.search(ini, fi, map, new MinMin());

        result.forEach(System.out::println);
    }
}
